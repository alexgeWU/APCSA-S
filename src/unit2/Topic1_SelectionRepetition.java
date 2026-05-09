package unit2;

/*
 * AP Topic 2.1 – Algorithms with Selection and Repetition
 *
 * Students learn that all algorithms are built from three building blocks:
 *   1. Sequencing  – steps execute in order, one after another
 *   2. Selection   – a true/false decision (if/else) determines which path runs
 *   3. Repetition  – a loop reruns a block of code while a condition holds
 *
 * The ORDER of these constructs matters: changing the order changes the result.
 * This file practices combining selection inside repetition loops.
 */
public class Topic1_SelectionRepetition {

    /**
     * TODO: Use a for or while loop (repetition) to iterate from 1 to max (inclusive).
     *       Inside the loop, use an if statement (selection) to check whether the
     *       current number is even (hint: number % 2 == 0).
     *       If it is even, print it on its own line with System.out.println().
     *
     * Parameters:
     *   max – the upper bound (inclusive) to iterate up to
     *
     * Returns: void (prints directly)
     *
     * Example:
     *   printEvenNumbers(10)  →  prints 2, 4, 6, 8, 10 each on its own line
     *   printEvenNumbers(5)   →  prints 2, 4
     */
    public static void printEvenNumbers(int max) {
        // TODO: implement
    }

    /**
     * TODO: Use a loop (repetition) to walk through the values array from index 0.
     *       Inside the loop, use an if statement (selection) to check whether the
     *       current element is negative (value < 0).
     *       If it is negative, STOP the loop immediately (break or return).
     *       Accumulate the sum of all elements BEFORE the first negative value.
     *       Return that sum.
     *
     * Parameters:
     *   values – an int array that may contain negative numbers
     *
     * Returns: int – the sum of elements before the first negative value
     *
     * Example:
     *   sumUntilNegative(new int[]{3, 5, -1, 2})  →  8   (3+5, stops at -1)
     *   sumUntilNegative(new int[]{1, 2, 3})       →  6   (no negative, sums all)
     *   sumUntilNegative(new int[]{-4, 1, 2})      →  0   (first element is negative)
     */
    public static int sumUntilNegative(int[] values) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Even numbers up to 10:");
        printEvenNumbers(10);

        int[] data = {3, 5, -1, 2};
        System.out.println("Sum until negative: " + sumUntilNegative(data)); // expected: 8
    }
}
