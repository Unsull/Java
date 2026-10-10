package oop;

public class Home {
    public static void main(String[] args) {
        Book book = new Book();
        book.name = "Java Programming";
        book.color = "Red";
        book.price = 950;

        // Accessing and printing the attributes of book
        System.out.println("Book 1 name: " + book.name);
        System.out.println("Book 1 color: " + book.color);
        System.out.println("Book 1 price: " + book.price);
        System.out.println("------------------------------");

        // Calling the getInfo() method and printing the returned information
        System.out.println("Book 1 info: " + book.getInfo());
        System.out.println("------------------------------");

        // Calling the printInfo() method to print the book's information
        book.printInfo();
        System.out.println("------------------------------");

        // Calling the amount() method to print the book's amount
        book.amount(8);
        System.out.println("------------------------------");

        book.printIsbn();
        System.out.println("------------------------------");

        // counter is static, so it belongs to the Book class rather than b1 or b2.
        // Access a static field with the class name to make this ownership clear.
        Book.counter = 9;
        System.out.println("Book.counter = " + Book.counter);

        // Changing Book.counter changes the one shared value used by every Book object.
        Book.counter = 10;
        System.out.println("Book.counter = " + Book.counter);

        System.out.println("------------------------------");

        Book javaBook = new Book();
        javaBook.name = "Java";

        Author author = new Author();
        author.name = "James Gosling";

        Address address = new Address();
        address.city = "San Francisco";
        address.country = "USA";

        javaBook.author = author; // Book เชื่อมไปยัง Author
        author.address = address; // Author เชื่อมไปยัง Address

        System.out.println("name: " + javaBook.name + ", author: " + javaBook.author.name);
        System.out.println("city: " + javaBook.author.address.city + ", country: " + javaBook.author.address.country);

        // System.out.println("name: " + author.name +", age: " + author.age);
    }
}
