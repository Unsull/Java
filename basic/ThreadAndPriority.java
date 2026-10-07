package basic;
import java.lang.Thread;

class MyRunnable implements Runnable {
    private int threadNumber;

    public MyRunnable(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadNumber + " is running with priority " + Thread.currentThread().getPriority());
    }
}

public class ThreadAndPriority {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(1));
        Thread thread2 = new Thread(new MyRunnable(2));
        Thread thread3 = new Thread(new MyRunnable(3));

        thread1.setPriority(Thread.MIN_PRIORITY); // Set minimum priority
        thread2.setPriority(Thread.NORM_PRIORITY); // Set normal priority
        thread3.setPriority(Thread.MAX_PRIORITY); // Set maximum priority

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished execution.");
    }
}
