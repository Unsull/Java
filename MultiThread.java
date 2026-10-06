public class MultiThread {
    public static void main(String[] args) {
        // Get the number of available processors
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println("Available processors: " + availableProcessors);        System.out.println();

        // Create and start multiple threads
        for (int i = 0; i < 100; i++) {
            final int threadNumber = i;
            Thread thread = new Thread(() -> {
                System.out.println("Thread " + threadNumber + " is running");
            });
            thread.start();
        }
    }
}
