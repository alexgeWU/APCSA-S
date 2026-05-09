package unit4;

/*
 * Topic 4.3 – Array Creation and Access
 *
 * Learning Goals:
 * - Declare and create arrays: Type[] name = new Type[size];
 * - Access elements using indices 0 to length-1.
 * - Know that array.length gives the number of elements.
 * - Understand default values: 0 for int, 0.0 for double, false for boolean, null for objects.
 * - Know that accessing an out-of-range index throws ArrayIndexOutOfBoundsException.
 */
public class Topic3_ArrayCreationAccess {

    /**
     * Creates and returns a new int array of the given size, with every element set to value.
     *
     * TODO:
     *   1. Create a new int array: int[] result = new int[size];
     *   2. Use a for loop (i from 0 to size-1) to set result[i] = value;
     *   3. Return result.
     *
     * Example:
     *   createFilledArray(4, 7) → {7, 7, 7, 7}
     *   createFilledArray(3, 0) → {0, 0, 0}
     */
    public static int[] createFilledArray(int size, int value) {
        // TODO: Create the array, fill it with a for loop, then return it.
        return null;
    }

    /**
     * Demonstrates safe and unsafe array access.
     *
     * TODO:
     *   1. Print the first element:  arr[0]
     *   2. Print the last element:   arr[arr.length - 1]
     *   3. Print the middle element: arr[arr.length / 2]
     *   4. In a try block, access arr[arr.length] (one past the end — this is always out of bounds).
     *      In the catch block for ArrayIndexOutOfBoundsException, print:
     *      "Caught: index out of bounds"
     *
     * Example with arr = {10, 20, 30, 40}:
     *   First:   10
     *   Last:    40
     *   Middle:  30
     *   Caught: index out of bounds
     */
    public static void demonstrateArrayAccess(int[] arr) {
        // TODO: Print arr[0], arr[arr.length-1], arr[arr.length/2].
        // TODO: Wrap arr[arr.length] in a try-catch(ArrayIndexOutOfBoundsException e)
        //       and print "Caught: index out of bounds" in the catch block.
    }

    public static void main(String[] args) {
        int[] filled = createFilledArray(4, 7);
        // Print the filled array
        for (int val : filled) {
            System.out.print(val + " ");
        }
        System.out.println();

        int[] sample = {10, 20, 30, 40};
        demonstrateArrayAccess(sample);
    }
}
