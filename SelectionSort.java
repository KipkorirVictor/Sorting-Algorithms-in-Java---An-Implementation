package stdtwo;



/**
 * Generic Selection Sort class that sorts an array of elements
 * which implement the Comparable interface.
 *
 * @param <T> The type of elements to be sorted, which must implement Comparable.
 */
public class SelectionSort<T extends Comparable<T>> {

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
     * Recursive method to perform Selection Sort on the given array.
     *
     * @param array The array to be sorted.
     * @param step  The current index to sort from; initially 0 for the whole array.
     * @return The sorted array.
     */
    public T[] sort(T[] array, int step) {
        // Base case: If we reach the last element, the array is fully sorted
        if (step >= array.length - 1) {
            return array;
        }

        // Find the index of the minimum element in the unsorted part of the array
        int minIndex = step;
        for (int i = step + 1; i < array.length; i++) {
            if (array[i].compareTo(array[minIndex]) < 0) {
                minIndex = i;
            }
        }

        // Swap the found minimum element with the first element of the unsorted part
        swap(array, step, minIndex);

        // Recur for the next part of the array
        return sort(array, step + 1);
    }
}
