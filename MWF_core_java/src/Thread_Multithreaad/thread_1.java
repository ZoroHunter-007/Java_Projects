//ThreadCreation
//Thread Creation using Thread class
//Thread Creation using Runnable interface
//There are two ways to create a thread in java:
//1]Extends the threaded by java.lang.Thread class
//2]Implements the Runnable interface
package Thread_Multithreaad;

public class thread_1 extends Thread{

	public void run() {
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(2000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread_1 th=new thread_1();
		th.start(); // start() method is used to start the thread

	}

}
