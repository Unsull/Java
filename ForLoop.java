public class ForLoop {
    public static void main(String[] args) {
        // Example 1: Simple for loop
        System.out.println("Example 1: Simple for loop");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        System.out.println("------------------------------");

        // Example 2: For loop with an array
        System.out.println("Example 2: For loop with an array");
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit: " + fruits[i]);
        }

        System.out.println("------------------------------");

        // Example 3: For-each loop
        System.out.println("Example 3: For-each loop");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        System.out.println("------------------------------");

        // Example 4: Nested for loops
        System.out.println("Example 4: Nested for loops");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
