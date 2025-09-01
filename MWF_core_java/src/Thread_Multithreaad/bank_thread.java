package Thread_Multithreaad;

class thread_3{
	int balance=30000;
	public void withdraw(int amount) {
		if(balance>amount) {
			try {
				System.out.println(Thread.currentThread().getName()+" is withdraing "+ amount);
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance-=amount;
			System.out.println(Thread.currentThread().getName()+" Completed the withdrawal of "+ amount);
			System.out.println("After Withdraw Balance:"+balance);
		}
		else {
			System.out.println("Balance is not enough");
		}
	}
}
public class bank_thread {

	public static void main(String[] args) {
		thread_3 th=new thread_3();
		Runnable task=()->{
			
				th.withdraw(4000);
			
		};
		Thread th1=new Thread(task, "ATM-1");
		
		th1.start();
		
	}
}
