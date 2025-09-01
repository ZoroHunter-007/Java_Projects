// Example of Multithreading in Java
package Thread_Multithreaad;
class MyThread extends Thread {
    private String taskName;

    public MyThread(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Count: " + i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted.");
            }
        }
        System.out.println(taskName + " finished!");
    }
}

public class multithread_1 {
    public static void main(String[] args) {
        // Creating threads
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");

        // Starting threads
        t1.start();
        t2.start();

       
    }
}
