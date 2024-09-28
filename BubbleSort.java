package stdtwo;


/**
 * Generic Bubble Sort class that sorts an array of elements 
 * which implement the Comparable interface.
 *
 * @param <T> The type of elements to be sorted, which must implement Comparable.
 */
public class BubbleSort<T extends Comparable<T>> {

    /**
     * Helper method to swap two elements in the array.
     *
     * @param array The array in which elements are to be swapped.
     * @param i     The index of the first element.
     * @param j     The index of the second element.
     */
    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Recursive Bubble Sort method to sort the array.
     *
     * @param theArray The array to be sorted.
     * @param n        The number of elements to consider for sorting.
     * @return The sorted array.
     */
    public T[] sort(T[] theArray, int n) {
        // Base case: If only one element, array is already sorted
        if (n <= 1) {
            return theArray;
        }

        // Bubble the largest element to the end of the considered portion
        for (int i = 0; i < n - 1; i++) {
            if (theArray[i].compareTo(theArray[i + 1]) > 0) {
                swap(theArray, i, i + 1);
            }
        }

        // Recur for the rest of the array excluding the last sorted element
        return sort(theArray, n - 1);
    }
}
