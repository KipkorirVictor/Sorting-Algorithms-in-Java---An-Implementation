package stdtwo;


/**
 * Generic Insertion Sort class that sorts an array of elements
 * which implement the Comparable interface.
 *
 * @param <T> The type of elements to be sorted, which must implement Comparable.
 */
public class InsertionSort<T extends Comparable<T>> {

    /**
     * Recursive method to perform Insertion Sort on the given array.
     *
     * @param array The array to be sorted.
     * @param n     The number of elements to be sorted, starting from the beginning.
     * @return The sorted array.
     */
    public T[] sort(T[] array, int n) {
        // Base case: If there is only one element, the array is already sorted
        if (n <= 1) {
            return array;
        }

        // Recursively sort the first n-1 elements
        sort(array, n - 1);

        // Insert the last element at its correct position in the sorted array
        T lastElement = array[n - 1];
        int j = n - 2;

        // Shift elements of array[0..n-2] that are greater than lastElement
        while (j >= 0 && array[j].compareTo(lastElement) > 0) {
            array[j + 1] = array[j];
            j--;
        }
        
        // Place the lastElement in its correct position
        array[j + 1] = lastElement;

        return array;
    }
}
