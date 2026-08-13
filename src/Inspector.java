public class Inspector {
    public static void main(String[] args) {
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("JVM name: " + System.getProperty("java.vm.name"));
        System.out.println("OS / chip: " + System.getProperty("os.name")
            + " / " + System.getProperty("os.arch"));

        Runtime rt = Runtime.getRuntime();
        long mb = 1024 * 1024;
        System.out.println("CPU cores: " + rt.availableProcessors());
        System.out.println("Heap ceiling: " + rt.maxMemory() / mb + " MB");
        System.out.println("Heap in use: " + (rt.totalMemory() - rt.freeMemory()) / mb
                + " MB");

        int[] big = new int[10_000_000];
        System.out.println("-- allocated an array of 10 million ints --");
        System.out.println("Heap in use: " + (rt.totalMemory() - rt.freeMemory()) / mb
                + " MB");
        System.out.println("(the array is still reachable here: "
                + big.length + " slots)");
    }
}
