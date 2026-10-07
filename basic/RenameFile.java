package basic;
import java.io.File;
import java.io.IOException;

public class RenameFile {
    public static void main(String[] args) {  
        File file = new File("test.txt");

        // Check if the file exists, if not, create it
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred while creating the file.");
                e.printStackTrace();
            }
        } 
        else {
            // Rename the file
            File renamedFile = new File("renamed_test.txt");
            if (file.renameTo(renamedFile)) {
                System.out.println("File renamed to: " + renamedFile.getName());
            } else {
                System.out.println("Failed to rename the file.");
            }
        }
    }
}
