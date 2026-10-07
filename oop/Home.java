package oop;

public class Home {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Java Programming";
        book1.color = "Red";
        book1.price = 950;

        // Accessing and printing the attributes of book1
        System.out.println("Book 1 name: " + book1.name);
        System.out.println("Book 1 color: " + book1.color);
        System.out.println("Book 1 price: " + book1.price);
        System.out.println("------------------------------");

        // Calling the getInfo() method and printing the returned information
        System.out.println("Book 1 info: " + book1.getInfo());
        System.out.println("------------------------------");

        // Calling the printInfo() method to print the book's information
        book1.printInfo();
        System.out.println("------------------------------");

        // Calling the amount() method to print the book's amount
        book1.amount(8);
        System.out.println("------------------------------");

        book1.printIsbn();
    }
}
