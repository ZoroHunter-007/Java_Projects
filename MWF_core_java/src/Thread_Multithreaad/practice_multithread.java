package Thread_Multithreaad;
class Thread_1 extends Thread{
	int num;
	public Thread_1(int num) {
		this.num=num;
	}
	public void run() {
		for(int i=0;i<=5;i++)
		{
			
			try {
				System.out.println("Task "+num+" Values:"+ i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Task "+num+" is completed");
		}
	}
}
class Thread_2 extends Thread{
	int num;
	public Thread_2(int num) {
		this.num=num;
	}
	public void run() {
		for(int i=0;i<=5;i++)
		{
			
			try {
				System.out.println("Task "+num+" Values:"+ i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Task "+num+" is completed");
		}
	}
}
class Thread_3 extends Thread{
	int num;
	public Thread_3(int num) {
		this.num=num;
	}
	public void run() {
		for(int i=0;i<=5;i++)
		{
			
			try {
				System.out.println("Task "+num+" Values:"+ i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Task "+num+" is completed");
		}
	}
}
public class practice_multithread  {

	public static void main(String[] args) throws InterruptedException {
		Thread_1 th=new Thread_1(1);
		Thread_2 th1=new Thread_2(2);
		Thread_3 th2=new Thread_3(3);
		th.start();
		th1.start();
		th2.start();
		th.join();
		th1.join();
		th2.join();
		System.out.println("All Tasks completed...");
	}
}

