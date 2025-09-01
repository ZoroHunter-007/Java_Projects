package Thread_Multithreaad;

public class thread_4_bank extends Thread {
	int balance=30000;
	int withdraw=20000;
	int ac_no;
	public thread_4_bank(int ac_no) {
		this.ac_no=ac_no;
	}
	public void run() {
		
		if(balance>withdraw) {
			
			try {
				System.out.println(ac_no+" is withdrawing "+ withdraw);
				Thread.sleep(2000);//Taking time for withdrawal
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance-=withdraw;
			System.out.println(ac_no+" Completed withdrawing amount "+withdraw);
			System.out.println("After Balnce:"+balance);
		}
		else {
			System.out.println("Not enough Balnce in your Account");
		}
	}

	public static void main(String[] args) {
		
		thread_4_bank th=new thread_4_bank(123456);
		th.start();
	}
}
