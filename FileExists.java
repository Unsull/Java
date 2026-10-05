import java.io.File;

public class FileExists {
    public static void main(String[] args) {
        // Example of checking if a directory exists
        String dirPath = "new_directory";   
        File dir = new File(dirPath);
        if (dir.exists() && dir.isDirectory()) {
            System.out.println("Directory exists: " + dirPath);
        } else {
            System.out.println("Directory does not exist: " + dirPath);
        }

        // Example of checking if a file exists
        String filePath = "new_directory/new_file.txt";
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("File exists: " + filePath);
        } else {
            System.out.println("File does not exist: " + filePath);
        }

        // Example of checking if a file is readable and writable
        if (file.exists()) {
            if (file.canRead()) {
                System.out.println("File is readable: " + filePath);
            } else {
                System.out.println("File is not readable: " + filePath);
            }

            if (file.canWrite()) {
                System.out.println("File is writable: " + filePath);
            } else {
                System.out.println("File is not writable: " + filePath);
            }
        }
    }
}
