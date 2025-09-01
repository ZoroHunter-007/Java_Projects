package Thread_Multithreaad;

public class thread_2 extends Thread{

	public thread_2(String name) {
		super(name);
	}
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
			   Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+" started: "+ i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" Finished");
			
			
		}
	}
	public static void main(String[] args) throws InterruptedException {
		thread_2 th=new thread_2("Thread A");
		thread_2 th1=new thread_2("Thread B");
		thread_2 th2=new thread_2("Thread C");
		th.start();
		th.join();//join() method is used to wait for the thread to die
		//another thread to finish before execution
		th1.start();
		th1.join();
		th2.start();
		th2.join();
		
		
	}
}
