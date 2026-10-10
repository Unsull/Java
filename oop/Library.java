package oop;

public class Library {
    public static void main(String[] args) {
        Document c = new Document("Java 102");
        System.out.println(c);
        System.out.println();

        // หาใน Document (ลูก) แล้วค่อยไปหา BookGroup (แม่) อันไหนมีก่อนเอาอันนั้น
        c.info();
        System.out.println();

        Document c2 = new Document("PHP", 100);
        System.out.println(c2);
        System.out.println();

        PrinterEpson printer1 = new PrinterEpson();
        printer1.print();
        printer1.checkPower();
        System.out.println();

        PrinterCannon cannon1 = new PrinterCannon();
        cannon1.print();

        // method from Printer (parent)
        cannon1.test();
        int n = cannon1.getPower();
        System.out.println("Power: " + n);
        System.out.println();
    }
}
