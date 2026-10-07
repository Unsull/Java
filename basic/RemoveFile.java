package basic;
import java.io.File;
import java.io.IOException;

public class RemoveFile {
    public static void main(String[] args) {
        // create a new file to demonstrate deletion 
        File file = new File("delete_me.txt");
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

        // Example of deleting a file
        try {
            File fileToDelete = new File("delete_me.txt");
            if (fileToDelete.exists()) {
                if (fileToDelete.delete()) {
                    System.out.println("File deleted: " + fileToDelete.getName());
                } else {
                    System.out.println("Failed to delete file: " + fileToDelete.getName());
                }
            } else {
                System.out.println("File does not exist: " + fileToDelete.getName());
            }
        } catch (Exception e) {
            System.out.println("An error occurred while deleting the file.");
            e.printStackTrace();
        }
    }
}
