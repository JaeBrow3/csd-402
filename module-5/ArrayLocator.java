public class ArrayLocator {

    // Returns the location [row, col] of the largest value in a 2D double array
    public static int[] locateLargest(double[][] array) {
        int maxRow = 0, maxCol = 0;
        double max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        return new int[]{maxRow, maxCol};
    }
    
    // Returns the location [row, col] of the largest value in a 2D int array
    public static int[] locateLargest(int[][] array) {
        int maxRow = 0, maxCol = 0;
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        return new int[]{maxRow, maxCol};
    }

    // Returns the location [row, col] of the smallest value in a 2D double array
    public static int[] locateSmallest(double[][] array) {
        int minRow = 0, minCol = 0;
        double min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }
        return new int[]{minRow, minCol};
    }

    // Returns the location [row, col] of the smallest value in a 2D int array
    public static int[] locateSmallest(int[][] array) {
        int minRow = 0, minCol = 0;
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }
        return new int[]{minRow, minCol};
    }

    public static void main(String[] args) {
        int[][] intArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        double[][] doubleArray = {
            {1.5, 2.2, 9.9},
            {0.5, 4.4, 2.1},
            {7.8, 6.6, 8.3}
        };

        int[] maxDoubleLoc = locateLargest(doubleArray);
        int[] maxIntLoc = locateLargest(intArray);
        int[] minDoubleLoc = locateSmallest(doubleArray);
        int[] minIntLoc = locateSmallest(intArray);
        
        
        System.out.printf("Largest double at [%d, %d]\n", maxDoubleLoc[0], maxDoubleLoc[1]);
        System.out.printf("Largest int at [%d, %d]\n", maxIntLoc[0], maxIntLoc[1]);
        System.out.printf("Smallest double at [%d, %d]\n", minDoubleLoc[0], minDoubleLoc[1]);
        System.out.printf("Smallest int at [%d, %d]\n", minIntLoc[0], minIntLoc[1]);
    }
}


