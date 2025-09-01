package Thread_Multithreaad;
class Table{
	synchronized  static void multiply(int n) {
		for(int i=1;i<=10;i++) {
			
			try {
				System.out.println(n*i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class MyThread1 extends Thread{
	
	public void run() {
		Table.multiply(5);
	}
}
class MyThread_1 extends Thread{
		public void run() {
		Table.multiply(2);
	}
}
public class multithread_test {

	public static void main(String[] args) {
		Table t=new Table();
		MyThread1 th=new MyThread1();
		MyThread_1 th1=new MyThread_1();
		
		th.start();
		th1.start();
	}
}
