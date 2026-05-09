package unit4;

/*
 * Topic 4.17 – Recursive Searching and Sorting
 *
 * Learning Goals:
 * - Recursive binary search: each call eliminates half the search space.
 * - Merge sort: divide array in half, recursively sort each half, merge the two
 *   sorted halves — O(n log n); divide-and-conquer strategy.
 * - On the AP exam, recursion in searching/sorting is assessed on multiple-choice only.
 */
public class Topic17_RecursiveSearchingSorting {

    /**
     * Recursively searches a sorted array for target within the range [low, high].
     *
     * Base case:
     *   low > high → return -1 (search space is empty; target not found)
     *
     * Recursive cases:
     *   mid = (low + high) / 2
     *   arr[mid] == target → return mid
     *   target < arr[mid]  → recurse on left half:  recursiveBinarySearch(arr, target, low, mid-1)
     *   target > arr[mid]  → recurse on right half: recursiveBinarySearch(arr, target, mid+1, high)
     *
     * TODO:
     *   if (low > high) return -1;
     *   int mid = (low + high) / 2;
     *   if (arr[mid] == target) return mid;
     *   else if (target < arr[mid]) return recursiveBinarySearch(arr, target, low, mid - 1);
     *   else                        return recursiveBinarySearch(arr, target, mid + 1, high);
     *
     * Example:
     *   recursiveBinarySearch({1,3,5,7,9}, 7, 0, 4) → 3
     *   recursiveBinarySearch({1,3,5,7,9}, 6, 0, 4) → -1
     */
    public static int recursiveBinarySearch(int[] arr, int target, int low, int high) {
        // Base case: if low > high, return -1.
        // Compute mid, compare arr[mid] to target, recurse on appropriate half.
        return 0;
    }

    /**
     * Sorts arr[left..right] in place using merge sort.
     *
     * Base case:
     *   left >= right → return (a single element is already sorted)
     *
     * Recursive case:
     *   mid = (left + right) / 2
     *   mergeSort(arr, left, mid)        // sort left half
     *   mergeSort(arr, mid + 1, right)   // sort right half
     *   merge(arr, left, mid, right)     // merge the two sorted halves
     *
     * TODO:
     *   if (left >= right) return;
     *   int mid = (left + right) / 2;
     *   mergeSort(arr, left, mid);
     *   mergeSort(arr, mid + 1, right);
     *   merge(arr, left, mid, right);
     *
     * Example:
     *   mergeSort({5,3,1,4,2}, 0, 4) → arr becomes {1,2,3,4,5}
     *   Divide: {5,3,1} and {4,2}
     *   Recursively sort each half, then merge.
     */
    public static void mergeSort(int[] arr, int left, int right) {
        // Base case: left >= right, return.
        // Find mid, recurse on both halves, then call merge.
    }

    /**
     * Merges two sorted subarrays: arr[left..mid] and arr[mid+1..right].
     * Helper method for mergeSort.
     *
     * TODO:
     *   1. Compute sizes: leftSize = mid - left + 1, rightSize = right - mid.
     *   2. Copy data into temp arrays leftArr[] and rightArr[].
     *   3. Merge: compare leftArr[i] and rightArr[j], copy the smaller into arr[k].
     *   4. Copy any remaining elements from either temp array.
     */
    private static void merge(int[] arr, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];

        // TODO: Copy arr[left..mid] into leftArr and arr[mid+1..right] into rightArr.
        // TODO: Merge leftArr and rightArr back into arr[left..right] in sorted order.
        //       Use three index variables: i (left), j (right), k (merged position starting at left).
        //       while (i < leftSize && j < rightSize):
        //           if leftArr[i] <= rightArr[j]: arr[k++] = leftArr[i++]
        //           else:                          arr[k++] = rightArr[j++]
        //       Copy remaining elements of leftArr, then remaining elements of rightArr.
    }

    public static void main(String[] args) {
        int[] sorted = {1, 3, 5, 7, 9};
        System.out.println(recursiveBinarySearch(sorted, 7, 0, sorted.length - 1));
        System.out.println(recursiveBinarySearch(sorted, 6, 0, sorted.length - 1));

        int[] arr = {5, 3, 1, 4, 2};
        mergeSort(arr, 0, arr.length - 1);
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }
}
