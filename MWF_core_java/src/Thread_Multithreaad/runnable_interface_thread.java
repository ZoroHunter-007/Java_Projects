//Implement the Runnable interface
package Thread_Multithreaad;

public class runnable_interface_thread implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runnable_interface_thread rt=new runnable_interface_thread();
		Thread t=new Thread(rt);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
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

}
