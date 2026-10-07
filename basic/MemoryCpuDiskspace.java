package basic;
import java.io.File;
import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class MemoryCpuDiskspace {
    public static void main(String[] args) {
        // Memory information
        OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        long totalPhysicalMemorySize = osBean.getTotalMemorySize();
        long freePhysicalMemorySize = osBean.getFreeMemorySize();
        long usedPhysicalMemorySize = totalPhysicalMemorySize - freePhysicalMemorySize;

        // CPU load information
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        double cpuLoad = osBean.getProcessCpuLoad() * 100;

        // disk space information
        File root = new File("/");
        long totalDiskSpace = root.getTotalSpace();
        long useableDiskSpace = root.getUsableSpace();
        long usedDiskSpace = totalDiskSpace - useableDiskSpace;

        // kb = 1024 bytes, mb = 1024 kb, gb = 1024 mb
        System.out.println("Memory Information:");
        System.out.println("Total Physical Memory: " + totalPhysicalMemorySize / (1024 * 1024) + " MB");
        System.out.println("Free Physical Memory: " + freePhysicalMemorySize / (1024 * 1024) + " MB");
        System.out.println("Used Physical Memory: " + usedPhysicalMemorySize / (1024 * 1024) + " MB");
        System.out.println();
        System.out.println("CPU Load Information:");
        System.out.printf("CPU Load: %.2f%%\n", cpuLoad);
        System.out.println();
        System.out.println("Disk Space Information:");
        System.out.println("Total Disk Space: " + totalDiskSpace / (1024 * 1024 * 1024) + " GB");
        System.out.println("Usable Disk Space: " + useableDiskSpace / (1024 * 1024 * 1024) + " GB");
        System.out.println("Used Disk Space: " + usedDiskSpace / (1024 * 1024 * 1024) + " GB");
    }
}
