import java.util.Arrays;

public class AverageOverloads {

    // ---- Overloaded average methods ----
    public static short average(short[] array) {
        check(array);
        long sum = 0;
        for (short v : array) sum += v;
        return (short) Math.round((double) sum / array.length);
    }

    public static int average(int[] array) {
        check(array);
        long sum = 0;
        for (int v : array) sum += v;
        return (int) Math.round((double) sum / array.length);
    }

    public static long average(long[] array) {
        check(array);
        long sum = 0;
        for (long v : array) sum += v;
        return Math.round((double) sum / array.length);
    }

    public static double average(double[] array) {
        check(array);
        double sum = 0.0;
        for (double v : array) sum += v;
        return sum / array.length;
    }

    // ---- Test driver ----
    public static void main(String[] args) {
        short[]  shorts  = {10, 20, 30};                    // size 3
        int[]    ints    = {1000, 2000, 3000, 4000};        // size 4
        long[]   longs   = {1000000000L, 2000000000L};      // size 2
        double[] doubles = {1.5, 2.5, 3.5, 4.5, 5.5};       // size 5

        printResult("short[]", shorts, average(shorts));
        printResult("int[]", ints, average(ints));
        printResult("long[]", longs, average(longs));
        printResult("double[]", doubles, average(doubles));
    }

    // ---- Helpers ----
    private static void check(Object array) {
        if (array == null || java.lang.reflect.Array.getLength(array) == 0)
            throw new IllegalArgumentException("Array must not be null or empty.");
    }

    private static void printResult(String label, short[] arr, short avg) {
        System.out.println("Type: " + label);
        System.out.println("Elements: " + Arrays.toString(arr));
        System.out.println("Average: " + avg);
        System.out.println("----------------------------------------");
    }

    private static void printResult(String label, int[] arr, int avg) {
        System.out.println("Type: " + label);
        System.out.println("Elements: " + Arrays.toString(arr));
        System.out.println("Average: " + avg);
        System.out.println("----------------------------------------");
    }

    private static void printResult(String label, long[] arr, long avg) {
        System.out.println("Type: " + label);
        System.out.println("Elements: " + Arrays.toString(arr));
        System.out.println("Average: " + avg);
        System.out.println("----------------------------------------");
    }

    private static void printResult(String label, double[] arr, double avg) {
        System.out.println("Type: " + label);
        System.out.println("Elements: " + Arrays.toString(arr));
        System.out.printf("Average: %.3f%n", avg);
        System.out.println("----------------------------------------");
    }
}