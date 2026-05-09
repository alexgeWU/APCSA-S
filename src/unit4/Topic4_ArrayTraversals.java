package unit4;

/*
 * Topic 4.4 – Array Traversals
 *
 * Learning Goals:
 * - Traverse arrays with an index-based for loop (allows element modification).
 * - Traverse arrays with a for-each loop: for(Type e : arr) — read-only, cannot modify elements.
 * - Traverse forwards (0 to length-1) or backwards (length-1 to 0).
 * - Understand when to use each traversal style.
 */
public class Topic4_ArrayTraversals {

    /**
     * Prints each element of the array in reverse order, one per line.
     *
     * TODO: Use a for loop that starts at arr.length - 1 and counts DOWN to 0 (inclusive).
     *   Loop condition: i >= 0
     *   Loop update:    i--
     *   Inside the loop, print arr[i].
     *
     * Example:
     *   printReverse({1, 2, 3}) prints:
     *     3
     *     2
     *     1
     */
    public static void printReverse(int[] arr) {
        // TODO: for (int i = arr.length - 1; i >= 0; i--) { System.out.println(arr[i]); }
    }

    /**
     * Returns a new array where every element is doubled.
     *
     * TODO:
     *   1. Create a new int array of the same size as arr: int[] result = new int[arr.length];
     *   2. Use an index-based for loop (i from 0 to arr.length-1).
     *      Set result[i] = arr[i] * 2;
     *   3. Return result.
     *
     *   NOTE: A for-each loop cannot be used here because you need the index i
     *         to write into the result array at the correct position.
     *
     * Example:
     *   doubleAll({1, 2, 3})    → {2, 4, 6}
     *   doubleAll({5, 10, 15})  → {10, 20, 30}
     */
    public static int[] doubleAll(int[] arr) {
        // TODO: Create result array, loop with index, set result[i] = arr[i] * 2, return result.
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        printReverse(nums);

        int[] doubled = doubleAll(nums);
        for (int val : doubled) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
