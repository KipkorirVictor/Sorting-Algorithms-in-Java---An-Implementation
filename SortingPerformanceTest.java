package stdtwo;


import java.util.Random;
import java.util.Arrays;

/**
 * Test driver class to measure the execution time of various sorting algorithms 
 * with different input sizes.
 */
public class SortingPerformanceTest {

    // Table to store the results of the sorting performance tests
    static Object[][] resultTable = new Object[5][4];

    public static void main(String[] args) {
        // Set up headers for the results table
        resultTable[0][0] = "Array Size";
        resultTable[0][1] = "Selection Sort (ms)";
        resultTable[0][2] = "Bubble Sort (ms)";
        resultTable[0][3] = "Insertion Sort (ms)";

        // Array sizes to test
        int[] testSizes = {10, 100, 1000, 10000};

        // Loop through each array size and perform sorting tests
        for (int i = 0; i < testSizes.length; i++) {
            int size = testSizes[i];
            Integer[] testArray = new Integer[size];
            
            // Generate random integers for the array
            Random rand = new Random();
            for (int j = 0; j < size; j++) {
                testArray[j] = rand.nextInt(size * 10); // Random integers between 0 and size*10
            }

            // Record array size in the results table
            resultTable[i + 1][0] = size;

            // Measure and record execution time for Selection Sort
            SelectionSort<Integer> selectionSort = new SelectionSort<>();
            long startTime = System.currentTimeMillis();
            selectionSort.sort(Arrays.copyOf(testArray, testArray.length), 0);
            long endTime = System.currentTimeMillis();
            resultTable[i + 1][1] = (endTime - startTime); // Time in milliseconds

            // Measure and record execution time for Bubble Sort
            BubbleSort<Integer> bubbleSort = new BubbleSort<>();
            startTime = System.currentTimeMillis();
            bubbleSort.sort(Arrays.copyOf(testArray, testArray.length), testArray.length);
            endTime = System.currentTimeMillis();
            resultTable[i + 1][2] = (endTime - startTime); // Time in milliseconds

            // Measure and record execution time for Insertion Sort
            InsertionSort<Integer> insertionSort = new InsertionSort<>();
            startTime = System.currentTimeMillis();
            insertionSort.sort(Arrays.copyOf(testArray, testArray.length), testArray.length);
            endTime = System.currentTimeMillis();
            resultTable[i + 1][3] = (endTime - startTime); // Time in milliseconds
        }

        // Display the results in a table format
        displayResultsTable();
    }

    /**
     * Displays the results of the sorting performance tests in a formatted table.
     */
    public static void displayResultsTable() {
        for (Object[] row : resultTable) {
            for (Object cell : row) {
                System.out.printf("%-25s", cell);
            }
            System.out.println();
        }
    }
}
