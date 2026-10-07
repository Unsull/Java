package basic;
public class IfElse{
    public static void main(String[] args){
        int number = 10;

        if(number > 0){
            System.out.println("The number is positive.");
        } else if(number < 0){
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        System.out.println("------------------------------");

        int score = 85;
        if(score >= 90){
            System.out.println("Grade: A");
        } else if(score >= 80){
            System.out.println("Grade: B");
        } else if(score >= 70){
            System.out.println("Grade: C");
        } else if(score >= 60){
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        System.out.println("------------------------------");

        int age = 20;
        boolean hasId = true;
        if(age >= 18 && hasId){
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        System.out.println("------------------------------");

        String day = "Saturday";
        if(day.equals("Saturday") || day.equals("Sunday")){
            System.out.println("It's the weekend!");
        } else {
            System.out.println("It's a weekday.");
        }
    }
}