package basic;
import java.text.NumberFormat;

public class NumberFormatExample {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        // Set grouping used to true
        nf.setGroupingUsed(true);
        System.out.println(nf.format(1234567890.12345));

        NumberFormat nf2 = NumberFormat.getInstance();
        // Set minimum fraction digits
        nf2.setMinimumFractionDigits(2);
        System.out.println(nf2.format(1234567890.12345));

        // Set maximum fraction digits
        nf2.setMaximumFractionDigits(2);
        System.out.println(nf2.format(1234567890.12345));
    }
}
