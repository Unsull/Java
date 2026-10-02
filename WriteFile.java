import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        String filePath = "output.txt"; // Specify the file path

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Hello, World!");
            writer.newLine();
            writer.write("This is a sample text written to a file.");
            writer.newLine();
            writer.write("Writing to files in Java is straightforward.");
            System.out.println("Data has been written to " + filePath);
        } 
        catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
