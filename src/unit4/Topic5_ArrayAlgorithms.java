package unit4;

/*
 * Topic 4.5 – Implementing Array Algorithms
 *
 * Learning Goals:
 * - Apply standard algorithms to arrays: find min/max, compute sum/average,
 *   count frequency, check for existence, reverse an array.
 * - Know how to short-circuit a search with an early return.
 * - Understand the difference between returning a new array vs. modifying in place.
 */
public class Topic5_ArrayAlgorithms {

    /**
     * Returns true if target exists in arr, false otherwise.
     *
     * TODO: Use a for-each loop (or index-based loop) to examine each element.
     *   - If any element equals target, return true immediately (short-circuit).
     *   - After the loop completes without a match, return false.
     *
     * Example:
     *   contains({3, 1, 4, 1, 5}, 4)  → true   (4 is at index 2)
     *   contains({3, 1, 4, 1, 5}, 9)  → false  (9 is not in the array)
     *   contains({}, 1)               → false
     */
    public static boolean contains(int[] arr, int target) {
        // TODO: for (int val : arr) { if (val == target) return true; }
        //       return false;
        return false;
    }

    /**
     * Returns a new array that is the reverse of arr. Does NOT modify the original.
     *
     * TODO:
     *   1. Create a new int array of the same size: int[] result = new int[arr.length];
     *   2. Use an index-based for loop (i from 0 to arr.length-1).
     *      Set result[i] = arr[arr.length - 1 - i];
     *   3. Return result.
     *      The original arr must remain unchanged.
     *
     * Example:
     *   reverseArray({1, 2, 3, 4, 5}) → {5, 4, 3, 2, 1}
     *   reverseArray({7})             → {7}
     */
    public static int[] reverseArray(int[] arr) {
        // TODO: Create result[], fill using result[i] = arr[arr.length - 1 - i], return result.
        return null;
    }

    public static void main(String[] args) {
        int[] data = {3, 1, 4, 1, 5};
        System.out.println(contains(data, 4));
        System.out.println(contains(data, 9));

        int[] reversed = reverseArray(data);
        for (int val : reversed) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
