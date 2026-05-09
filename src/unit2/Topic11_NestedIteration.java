package unit2;

/*
 * AP Topic 2.11 – Nested Iteration
 *
 * Students learn:
 *   - A loop placed INSIDE another loop is called a nested loop.
 *   - For each single iteration of the OUTER loop, the INNER loop runs to
 *     COMPLETION (all of its iterations).
 *   - Total number of inner-body executions = outer iterations × inner iterations.
 *     Example: outer runs 3 times, inner runs 4 times → body runs 3 × 4 = 12 times.
 *   - Be careful NOT to modify the outer loop's control variable inside the inner loop.
 *   - Nested loops are used for 2-D structures: grids, tables, matrices, pair comparisons.
 */
public class Topic11_NestedIteration {

    /**
     * TODO: Print a multiplication table of size × size using nested for loops.
     *
     *   Outer loop:  row from 1 to size (inclusive)
     *   Inner loop:  col from 1 to size (inclusive)
     *     Print row * col formatted to take up a consistent width.
     *     Use System.out.printf("%4d", row * col) to align columns.
     *   After the inner loop ends (i.e., after each row), print a newline:
     *     System.out.println();
     *
     * Parameters:
     *   size – the dimension of the table (size × size grid)
     *
     * Returns: void (prints directly)
     *
     * Example: printMultiplicationTable(3) prints:
     *    1   2   3
     *    2   4   6
     *    3   6   9
     */
    public static void printMultiplicationTable(int size) {
        // TODO: implement using nested for loops; outer = row, inner = col
    }

    /**
     * TODO: Return true if any value appears more than once in arr.
     *
     *   Algorithm (nested loop pair comparison):
     *     Outer loop: i from 0 to arr.length - 1
     *       Inner loop: j from i + 1 to arr.length - 1
     *         if arr[i] == arr[j]:
     *           return true    // found a duplicate — exit immediately
     *     return false         // no duplicates found after all pairs checked
     *
     *   Note: starting j at i+1 (not 0) avoids comparing an element with itself
     *   and avoids checking the same pair twice.
     *
     * Parameters:
     *   arr – an int array
     *
     * Returns: boolean – true if any duplicate exists, false if all values are unique
     *
     * Example:
     *   hasDuplicate(new int[]{1, 2, 3, 2})  →  true   (2 appears at index 1 and 3)
     *   hasDuplicate(new int[]{1, 2, 3})     →  false
     *   hasDuplicate(new int[]{5, 5})        →  true
     *   hasDuplicate(new int[]{})            →  false  (empty array)
     */
    public static boolean hasDuplicate(int[] arr) {
        // TODO: implement using nested for loops; return true as soon as a duplicate is found
        return false;
    }

    public static void main(String[] args) {
        printMultiplicationTable(3);
        System.out.println(hasDuplicate(new int[]{1, 2, 3, 2}));  // expected: true
        System.out.println(hasDuplicate(new int[]{1, 2, 3}));     // expected: false
    }
}
