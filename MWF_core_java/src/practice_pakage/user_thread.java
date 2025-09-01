package practice_pakage;

import java.util.Scanner;

class Bank_of_Baroda{
	int ac_no;
	String name;
	double amount;
	double balance=0.00;
	synchronized static void withdraw(int ac_no,String name,double amount,double balance) {
		
		if(balance>amount && amount<=balance) {
			try {
				System.out.println("\n"+name+" your amount "+amount+" withdraw in you account successfully...");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(amount>balance){
			System.out.println("Insufficient balance in your account...!");
		}
		else {
			System.out.println("Please enter positive amount..!");
		}
	}
	synchronized static void deposite(int ac_no,String name,double amount,double balance) {
		if(amount>0) {
			
			try {
				System.out.println(amount+" Amount is deposited in your account...");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Customer_1 extends Thread{
	Scanner sc=new Scanner(System.in);
	int ac_no;
	String name;
	double amount;
	double d_amount;
	double balance;
	public Customer_1() {
		System.out.println("Enter the Account Holder No:");
		ac_no=sc.nextInt();
		System.out.println("Enter the Account Holder Name:");
		name=sc.next();
		System.out.println("Enter the Withdraw amount:");
		amount=sc.nextDouble();
		System.out.println("Enter the Desposited amount:");
		d_amount=sc.nextDouble();
		System.out.println("Enter the Balance:");
		balance=sc.nextDouble();
		
	}
	public void run() {
		Bank_of_Baroda.withdraw(ac_no,name, amount,balance);
		balance-=amount;
		Bank_of_Baroda.deposite(ac_no, name, d_amount, balance);
		balance+=d_amount;
		System.out.println("\nCustomer Data:");
		System.out.println("Account No:"+ac_no);
		System.out.println("A/c Holder Name:"+name);
		System.out.println("After transcation Balance:"+balance);
	}
}
class Customer_2 extends Thread{
	Scanner sc=new Scanner(System.in);
	int ac_no;
	String name;
	double amount;
	double d_amount;
	double balance;
	public Customer_2() {
		System.out.println("Enter the Account Holder No:");
		ac_no=sc.nextInt();
		System.out.println("Enter the Account Holder Name:");
		name=sc.next();
		System.out.println("Enter the Withdraw amount:");
		amount=sc.nextDouble();
		System.out.println("Enter the Desposited amount:");
		d_amount=sc.nextDouble();
		System.out.println("Enter the Balance:");
		balance=sc.nextDouble();
		
	}
	public void run() {
		Bank_of_Baroda.withdraw(ac_no,name, amount,balance);
		balance-=amount;
		Bank_of_Baroda.deposite(ac_no, name, d_amount, balance);
		balance+=d_amount;
		System.out.println("\nCustomer Data:");
		System.out.println("Account No:"+ac_no);
		System.out.println("A/c Holder Name:"+name);
		System.out.println("After transcation Balance:"+balance);
	}
}
public class user_thread {
	public static void main(String[] args) throws InterruptedException {
		
		Customer_1 c=new Customer_1();
		Customer_2 c1=new Customer_2();
		
		c.start();
		c.join();
		c1.start();
		c1.join();
	}

}
