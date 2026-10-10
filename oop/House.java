package oop;
public class House {
    public static void main(String[] args) {
        House h = new House();
        h.method1();

        h.info();
        h.info("Aaa");
    }

    void method1() {
        method2();;
    }

    void method2() {
        System.out.println("method2 doing...");
    }

    // Overload
    void info() {
        System.out.println("info");
    }

    void info(String s) {
        System.out.println("info " + s);
    }
}