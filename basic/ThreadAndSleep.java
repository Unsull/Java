package basic;
public class ThreadAndSleep {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(1), "Thread-1");
        thread1.start();

        try {
            String output = "";

            for (int i = 1; i <= 100; i++) {
                output += "=";
                System.out.print("\r" + i + "% " + output);
                Thread.sleep(50);
            }
            System.out.println();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
