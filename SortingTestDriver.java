package stdtwo;

import java.util.Arrays;

/**
 * Test driver class to demonstrate the usage of various sorting algorithms.
 */
public class SortingTestDriver {

    public static void main(String[] args) {
        // Sample input array of names
        String[] names = {"Janet", "Bob", "Tom", "Alan", "Ellen", "Karen", "Wendy"};
        
        // Create instances of the sorting classes
        BubbleSort<String> bubbleSort = new BubbleSort<>();
        SelectionSort<String> selectionSort = new SelectionSort<>();
        InsertionSort<String> insertionSort = new InsertionSort<>();

        // Print original array
        System.out.println("Original Array: " + Arrays.toString(names));
        
        // Test Bubble Sort
        String[] bubbleSortedArray = bubbleSort.sort(Arrays.copyOf(names, names.length), names.length);
        System.out.println("Sorted with Bubble Sort: " + Arrays.toString(bubbleSortedArray));

        // Test Selection Sort
        String[] selectionSortedArray = selectionSort.sort(Arrays.copyOf(names, names.length), 0);
        System.out.println("Sorted with Selection Sort: " + Arrays.toString(selectionSortedArray));

        // Test Insertion Sort
        String[] insertionSortedArray = insertionSort.sort(Arrays.copyOf(names, names.length), names.length);
        System.out.println("Sorted with Insertion Sort: " + Arrays.toString(insertionSortedArray));
    }
}
