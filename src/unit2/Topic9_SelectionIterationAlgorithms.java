package unit2;

/*
 * AP Topic 2.9 – Implementing Selection and Iteration Algorithms
 *
 * Students learn standard algorithmic patterns that appear repeatedly on the AP exam:
 *   - Check divisibility:     value % divisor == 0
 *   - Extract digits:         value % 10 (last digit), value / 10 (remove last digit)
 *   - Count items meeting a criterion: initialize counter = 0, increment inside if
 *   - Find minimum / maximum: initialize to first element, update inside loop with if
 *   - Compute sum / average:  initialize sum = 0, accumulate, divide by count at end
 *
 * These patterns are combined with for/while loops and if statements.
 * Mastering them is essential for the AP free-response questions.
 */
public class Topic9_SelectionIterationAlgorithms {

    /**
     * TODO: Use a for loop to find the largest value in arr.
     *
     *   Algorithm:
     *     Initialize max = arr[0]    // start with the first element
     *     for i from 1 to arr.length - 1:
     *       if arr[i] > max:
     *         max = arr[i]           // update max whenever a larger value is found
     *     return max
     *
     *   Note: assume arr is non-null and has at least one element.
     *
     * Parameters:
     *   arr – a non-empty int array
     *
     * Returns: int – the maximum value in the array
     *
     * Example:
     *   findMax(new int[]{3, 1, 4, 1, 5, 9, 2, 6})  →  9
     *   findMax(new int[]{-3, -1, -7})               →  -1
     *   findMax(new int[]{42})                        →  42
     */
    public static int findMax(int[] arr) {
        // TODO: implement using a for loop with an if statement to track the maximum
        return 0;
    }

    /**
     * TODO: Use a for loop to compute the arithmetic mean (average) of arr.
     *
     *   Algorithm:
     *     Initialize sum = 0
     *     for each element in arr:
     *       sum += element
     *     return (double) sum / arr.length
     *
     *   IMPORTANT: cast sum to double (or declare it as double) BEFORE dividing,
     *   otherwise integer division will truncate the result.
     *   Example of the pitfall: 7 / 2 == 3  (integer division)
     *                           (double)7 / 2 == 3.5  (correct)
     *
     * Parameters:
     *   arr – a non-empty int array
     *
     * Returns: double – the average value
     *
     * Example:
     *   computeAverage(new int[]{1, 2, 3, 4, 5})  →  3.0
     *   computeAverage(new int[]{10, 20})          →  15.0
     *   computeAverage(new int[]{7})               →  7.0
     */
    public static double computeAverage(int[] arr) {
        // TODO: implement using a for loop; remember to cast before dividing
        return 0;
    }

    public static void main(String[] args) {
        int[] data = {3, 1, 4, 1, 5, 9, 2, 6};
        System.out.println(findMax(data));           // expected: 9
        System.out.println(computeAverage(data));    // expected: 3.875
        int[] simple = {1, 2, 3, 4, 5};
        System.out.println(computeAverage(simple));  // expected: 3.0
    }
}
