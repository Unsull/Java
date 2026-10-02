public class SwitchCase {
    public static void main(String[] args) {
        int number = 10;

        switch (number) {
            case 1:
                System.out.println("The number is one.");
                break;
            case 2:
                System.out.println("The number is two.");
                break;
            case 3:
                System.out.println("The number is three.");
                break;
            default:
                System.out.println("The number is not one, two, or three.");
        }

        System.out.println("------------------------------");

        int score = 85;
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }

        System.out.println("------------------------------");

        int age = 20;
        boolean hasId = true;

        switch (age >= 18 && hasId ? "eligible" : "not eligible") {
            case "eligible":
                System.out.println("You are eligible to vote.");
                break;
            case "not eligible":
                System.out.println("You are not eligible to vote.");
                break;
        }

        System.out.println("------------------------------");

        String day = "Saturday";
        switch (day) {
            case "Saturday":
            case "Sunday":
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("It's a weekday.");
        }
    }
}
