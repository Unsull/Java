public class LoopAvg {
    public static void main(String[] args) {
        // Example 1: Calculate the average of numbers using a for loop
        System.out.println("Example 1: Calculate the average of numbers using a for loop");
        int sum = 0;
        int count = 5;
        for (int i = 1; i <= count; i++) {
            sum += i; // Adding numbers from 1 to count
        }
        double average = (double) sum / count;
        System.out.println("Average: " + average);

        System.out.println("------------------------------");

        // Example 2: Calculate the average of numbers using a while loop
        System.out.println("Example 2: Calculate the average of numbers using a while loop");
        sum = 0;
        count = 5;
        int j = 1;
        while (j <= count) {
            sum += j; // Adding numbers from 1 to count
            j++;
        }
        average = (double) sum / count;
        System.out.println("Average: " + average);

        System.out.println("------------------------------");

        // Example 3: Calculate the average of numbers using a do-while loop
        System.out.println("Example 3: Calculate the average of numbers using a do-while loop");
        sum = 0;
        count = 5;
        int k = 1;
        do {
            sum += k; // Adding numbers from 1 to count
            k++;
        } while (k <= count);

        average = (double) sum / count;
        System.out.println("Average: " + average);

        System.out.println("------------------------------");

        // Example 4: Calculate the average of an array of numbers using a for-each loop
        System.out.println("Example 4: Calculate the average of an array of numbers using a for-each loop");
        sum = 0;    
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            sum += num; // Adding each number in the array
        }
        average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
    }
}
