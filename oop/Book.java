package oop;

public class Book {
    String name;
    String color;
    int price;
    final String isbn = "1101"; // final variables cannot be modified after initialization, so we cannot provide a setter for the author variable.
    Author author;

    // static means this variable belongs to the Book class.
    // Every Book object shares the same counter value.
    static int counter;

    String getInfo() {
        return "Name: " + name + ", Color: " + color + ", Price: " + price;
    }

    void printInfo() {
        System.out.printf("Name is %s %n", name);
        System.out.printf("Color is %s %n", color);
        System.out.printf("Price is %d %n", price);
    }

    void amount(int amount) {
        System.out.printf("Amount is %d %n", (price * amount));
    }

    void printIsbn() {
        System.out.printf("isbn = %s %n", isbn);
    }
}
