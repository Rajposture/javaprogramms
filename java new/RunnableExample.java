// Multithreading using Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable thread running: " + i);
            try {
                Thread.sleep(500); // pause for 0.5 sec
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable(); // create object

        Thread t1 = new Thread(obj); // wrap in Thread
        Thread t2 = new Thread(obj); // another thread

        t1.start(); // start first thread
        t2.start(); // start second thread
    }
}


