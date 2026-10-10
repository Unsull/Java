package oop;

public class Document extends DocGroup {
    String name;
    int price;

    // constructor
    public Document(String name) {
        this.name = name;
        System.out.println("object creat, " + this.name);
    }

    // constructor overloading
    public Document(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("name: " + this.name + ", price: " + this.price);
    }

    void info() {
        System.out.println("child info");
    }
}
