public class OperatingInfo {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String osArch = System.getProperty("os.arch");

        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        String userDir = System.getProperty("user.dir");

        String javaVersion = System.getProperty("java.version");
        String javaVendor = System.getProperty("java.vendor");
        String javaVendorURL = System.getProperty("java.vendor.url");
        String javaHome = System.getProperty("java.home");
        String javaClassPath = System.getProperty("java.class.path");
        String javaLibraryPath = System.getProperty("java.library.path");
        String javaIoTmpDir = System.getProperty("java.io.tmpdir");
        String javaExtDirs = System.getProperty("java.ext.dirs");
        String fileSeparator = System.getProperty("file.separator");
        String pathSeparator = System.getProperty("path.separator");

        System.out.println("Operating System Information:");
        System.out.println("OS Name: " + osName);
        System.out.println("OS Version: " + osVersion);
        System.out.println("OS Architecture: " + osArch);
        System.out.println();
        System.out.println("User Information:");
        System.out.println("User Name: " + userName);
        System.out.println("User Home Directory: " + userHome);
        System.out.println("User Current Working Directory: " + userDir);
        System.out.println();
        System.out.println("Java Environment Information:");
        System.out.println("Java Version: " + javaVersion);
        System.out.println("Java Vendor: " + javaVendor);
        System.out.println("Java Vendor URL: " + javaVendorURL);
        System.out.println("Java Home Directory: " + javaHome);
        System.out.println("Java Class Path: " + javaClassPath);
        System.out.println("Java Library Path: " + javaLibraryPath);
        System.out.println("Java Temporary Directory: " + javaIoTmpDir);
        System.out.println("Java Extension Directories: " + javaExtDirs);
        System.out.println();
        System.out.println("File Separator: " + fileSeparator);
        System.out.println("Path Separator: " + pathSeparator);
    }
}
