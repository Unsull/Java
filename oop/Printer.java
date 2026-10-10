package oop;

abstract public class Printer {
    public abstract void print();
    
    public int getPower() {
        return 999;
    }

    protected void test() {
        System.out.println("test");
    }
}