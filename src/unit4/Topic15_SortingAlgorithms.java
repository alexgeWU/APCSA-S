package unit4;

/*
 * Topic 4.15 – Sorting Algorithms
 *
 * Learning Goals:
 * - Selection sort: repeatedly find the minimum of the unsorted portion and
 *   swap it into place — O(n²); always makes the same number of comparisons.
 * - Insertion sort: take the next element and insert it into the correct position
 *   in the already-sorted portion — O(n²) worst case, O(n) for nearly-sorted data.
 * - Both algorithms sort in place (no new array needed).
 */
public class Topic15_SortingAlgorithms {

    /**
     * Sorts arr in ascending order using selection sort. Modifies arr in place.
     *
     * TODO:
     *   for (int i = 0; i < arr.length - 1; i++) {
     *       // Find index of minimum element in arr[i..arr.length-1]
     *       int minIndex = i;
     *       for (int j = i + 1; j < arr.length; j++) {
     *           if (arr[j] < arr[minIndex]) minIndex = j;
     *       }
     *       // Swap arr[i] with arr[minIndex]
     *       int temp = arr[i];
     *       arr[i] = arr[minIndex];
     *       arr[minIndex] = temp;
     *   }
     *
     * Example:
     *   selectionSort({5, 3, 1, 4, 2}) → arr becomes {1, 2, 3, 4, 5}
     *   Pass 1: min is 1 at index 2, swap with index 0 → {1, 3, 5, 4, 2}
     *   Pass 2: min is 2 at index 4, swap with index 1 → {1, 2, 5, 4, 3}  ...etc.
     */
    public static void selectionSort(int[] arr) {
        // TODO: Outer loop i from 0 to arr.length-2.
        //       Inner loop finds minIndex from i+1 to arr.length-1.
        //       Swap arr[i] with arr[minIndex] using a temp variable.
    }

    /**
     * Sorts arr in ascending order using insertion sort. Modifies arr in place.
     *
     * TODO:
     *   for (int i = 1; i < arr.length; i++) {
     *       int key = arr[i];   // the element to be inserted
     *       int j = i - 1;
     *       // Shift elements larger than key one position to the right
     *       while (j >= 0 && arr[j] > key) {
     *           arr[j + 1] = arr[j];
     *           j--;
     *       }
     *       arr[j + 1] = key;   // insert key into its correct position
     *   }
     *
     * Example:
     *   insertionSort({5, 3, 1, 4, 2}) → arr becomes {1, 2, 3, 4, 5}
     *   i=1: key=3, shift 5 right → {5,5,1,4,2}, place 3 → {3,5,1,4,2}
     *   i=2: key=1, shift 5 and 3 → place 1   → {1,3,5,4,2}  ...etc.
     */
    public static void insertionSort(int[] arr) {
        // TODO: Outer loop i from 1 to arr.length-1.
        //       Store key = arr[i], inner while shifts arr[j] right while arr[j] > key.
        //       Place key at arr[j+1] after the while loop.
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 1, 4, 2};
        selectionSort(a);
        for (int val : a) System.out.print(val + " ");
        System.out.println();

        int[] b = {5, 3, 1, 4, 2};
        insertionSort(b);
        for (int val : b) System.out.print(val + " ");
        System.out.println();
    }
}
