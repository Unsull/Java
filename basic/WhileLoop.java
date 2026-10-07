package basic;
public class WhileLoop {
    public static void main(String[] args) {
        // Example 1: Simple while loop
        System.out.println("Example 1: Simple while loop");
        int i = 0;
        while (i < 5) {
            System.out.println("Iteration: " + i);
            i++;
        }

        System.out.println("------------------------------");

        // Example 2: While loop with a condition
        System.out.println("Example 2: While loop with a condition");
        int number = 10;
        while (number > 0) {
            System.out.println("Number: " + number);
            number--;
        }

        System.out.println("------------------------------");

        // Example 3: While loop with user input (simulated)
        System.out.println("Example 3: While loop with user input (simulated)");
        String[] inputs = {"Hello", "World", "Exit"};
        int index = 0;
        while (!inputs[index].equals("Exit")) {
            System.out.println("Input: " + inputs[index]);
            index++;
        }

        System.out.println("------------------------------");

        // Example 4: Do-while loop
        int count = 0;
        System.out.println("Example 4: Do-while loop");
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count < 5);

        System.out.println("------------------------------");

        // Example 5: While loop with a break statement
        System.out.println("Example 5: While loop with a break statement");
        int j = 0;
        while (true) {
            System.out.println("j: " + j);
            j++;
            if (j >= 5) {
                break;
            }
        }

        System.out.println("------------------------------");

        // Example 6: While loop with a continue statement
        System.out.println("Example 6: While loop with a continue statement");
        int k = 0;
        while (k < 10) {
            k++;
            if (k % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println("Odd number: " + k);
        }

        System.out.println("------------------------------");

        // Example 7: Nested while loops
        System.out.println("Example 7: Nested while loops");
        int m = 1;
        while (m <= 3) {
            int n = 1;
            while (n <= 3) {
                System.out.println("m: " + m + ", n: " + n);
                n++;
            }
            m++;
        }

    }
}
