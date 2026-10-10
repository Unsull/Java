package oop;

public class PrinterEpson implements IPrinter{
    public void print() {
        System.out.println("Epson print");
    }

    public void checkPower() {
        System.out.println("Epson check power");
    }
}
