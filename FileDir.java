import java.io.File;
import java.io.IOException;

public class FileDir {
    public static void main(String[] args) {
        File file = new File(".");
        String[] files = file.list();

        System.out.println("Files in directory:" + file.getAbsolutePath());
        for (String fileName : files) {
            System.out.println(fileName);
        }

        // Example of creating a new directory
        String newDirPath = "new_directory";
        File newDir = new File(newDirPath);
        if (!newDir.exists()) {
            if (newDir.mkdir()) {
                System.out.println("Directory created: " + newDirPath);
            } else {
                System.out.println("Failed to create directory: " + newDirPath);
            }
        } else {
            System.out.println("Directory already exists: " + newDirPath);
        }

        // // Example of deleting a directory
        // if (newDir.exists()) {
        //     if (newDir.delete()) {
        //         System.out.println("Directory deleted: " + newDirPath);
        //     } else {
        //         System.out.println("Failed to delete directory: " + newDirPath);
        //     }
        // }
        
        // Example of creating a new file in the new directory
        String newFilePath = newDirPath + File.separator + "new_file.txt";
        File newFile = new File(newFilePath);
        try {
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFilePath);
            } else {
                System.out.println("File already exists: " + newFilePath);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while creating the file: " + e.getMessage());
        }
    }
}
