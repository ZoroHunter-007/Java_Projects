package Thread_Multithreaad;

public class thread_task extends Thread {

	int num;
	public thread_task(int num) {
		
		this.num=num;
		
	}
	public void run() {
		
		
			try {
				System.out.println("Task "+num+ " Started by "+Thread.currentThread().getName());
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Task "+num+" finished "+Thread.currentThread().getName());
		}
	
	public static void main(String[] args) throws InterruptedException {
		thread_task th=new thread_task(1);
		thread_task th1=new thread_task(2);
		thread_task th2=new thread_task(3);
		th.start();
		
		th1.start();
		
		th2.start();
		
		th.join();
		th1.join();
		th2.join();
		System.out.println("\nAll threads finished");
	}
}
