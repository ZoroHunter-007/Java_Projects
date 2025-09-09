package Thread_Multithreaad;

import java.util.Scanner;

class Bank_1{
	String name;
	double amount;
	double balance=0.00;
	synchronized static void withdraw(String name,double amount,double balance) {
		
		
		if(balance>amount) {
			
			try {
				System.out.println(name+" you withdrawn "+amount+" from your account");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Insufficient Balance...!");
		}
	}
}
class cust_1 extends Thread{
	Scanner sc=new Scanner(System.in);

	public void run() {
		System.out.println("Enter the Name:");
		String name=sc.next();
		System.out.println("Enter the Amount Withdraw:");
		double amt=sc.nextDouble();
		System.out.println("Enter the Balance:");
		double balance=sc.nextDouble();
	
		Bank_1.withdraw(name, amt, balance);
		if(balance>amt) {
			balance-=amt;
			System.out.println("Current Balance in your A/c: "+balance);
		}
		else {
			System.out.println("Failed to Withdrwal...!");
		}
}
}
class cust_2 extends Thread{
	Scanner sc=new Scanner(System.in);

	public void run() {
		System.out.println("Enter the Name:");
		String name=sc.next();
		System.out.println("Enter the Amount Withdraw:");
		double amt=sc.nextDouble();
		System.out.println("Enter the Balance:");
		double balance=sc.nextDouble();
	
		Bank_1.withdraw(name, amt, balance);
		if(balance>amt) {
			balance-=amt;
			System.out.println("Current Balance in your A/c: "+balance);
		}
		else {
			System.out.println("Failed to Withdrwal...!");
		}
}
	
}
public class bank_multithread {

	public static void main(String[] args) throws InterruptedException {
		cust_1 c=new cust_1();
		cust_2 c1=new cust_2();
		
		c.start();
		c.join();
		c1.start();
		c1.join();
	}
	
}
