package Thread_Multithreaad;

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
	}
}
class cust_1 extends Thread{
	
	double balance=50000.00;
	public void run() {
		Bank_1.withdraw("Drhuv",6000.00,50000.00);
		balance-=6000.00;
		System.out.println("After withdraw balance is "+balance);
	}
	
}
class cust_2 extends Thread{
	double balance=60000.00;
	public void run() {
		Bank_1.withdraw("Drhuval",6000.00,60000.00);
		balance-=6000.00;
		System.out.println("After withdraw balance is "+balance);
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
