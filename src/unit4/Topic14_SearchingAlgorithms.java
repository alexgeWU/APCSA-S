package unit4;

/*
 * Topic 4.14 – Searching Algorithms
 *
 * Learning Goals:
 * - Linear search: examine each element in order — O(n); works on any array.
 * - Binary search: requires a SORTED array; eliminates half the search space each
 *   step — O(log n); compare target to middle, move left or right accordingly.
 * - Return the index of the target, or -1 if not found.
 */
public class Topic14_SearchingAlgorithms {

    /**
     * Searches arr for target using linear (sequential) search.
     * Returns the index of the first occurrence, or -1 if not found.
     *
     * TODO:
     *   for (int i = 0; i < arr.length; i++) {
     *       if (arr[i] == target) return i;   // found — return immediately
     *   }
     *   return -1;   // target was not in the array
     *
     * Example:
     *   linearSearch({3, 1, 4, 1, 5}, 4) → 2  (arr[2] == 4)
     *   linearSearch({3, 1, 4, 1, 5}, 9) → -1 (9 not found)
     */
    public static int linearSearch(int[] arr, int target) {
        // TODO: Loop through arr; return index on match, return -1 after loop.
        return 0;
    }

    /**
     * Searches a SORTED array for target using binary search.
     * Returns the index of target, or -1 if not found.
     *
     * TODO:
     *   int low = 0, high = sortedArr.length - 1;
     *   while (low <= high) {
     *       int mid = (low + high) / 2;
     *       if (sortedArr[mid] == target) return mid;       // found
     *       else if (target < sortedArr[mid]) high = mid - 1;  // search left half
     *       else                             low  = mid + 1;   // search right half
     *   }
     *   return -1;  // not found
     *
     * Example:
     *   binarySearch({1, 3, 5, 7, 9}, 7) → 3  (arr[3] == 7)
     *   binarySearch({1, 3, 5, 7, 9}, 6) → -1
     *
     * NOTE: Array MUST be sorted; binary search gives wrong results on unsorted data.
     */
    public static int binarySearch(int[] sortedArr, int target) {
        // TODO: Initialize low and high, loop while low <= high, compute mid,
        //       compare and adjust low/high, return -1 if not found.
        return 0;
    }

    public static void main(String[] args) {
        int[] data = {3, 1, 4, 1, 5};
        System.out.println(linearSearch(data, 4));
        System.out.println(linearSearch(data, 9));

        int[] sorted = {1, 3, 5, 7, 9};
        System.out.println(binarySearch(sorted, 7));
        System.out.println(binarySearch(sorted, 6));
    }
}
