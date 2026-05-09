package unit4;

/*
 * Topic 4.2 – Introduction to Using Data Sets
 *
 * Learning Goals:
 * - Understand that data sets are organized collections of data.
 * - Know that knowledge can be extracted from data through computation.
 * - Recognize that data must be organized and interpreted to produce useful information.
 */
public class Topic2_DataSets {

    /**
     * Returns the median value of a SORTED integer array.
     *
     * TODO: Implement the following logic:
     *   - If the array length is odd, return the middle element as a double.
     *     Middle index = data.length / 2
     *   - If the array length is even, return the average of the two middle elements.
     *     Lower middle index = data.length / 2 - 1
     *     Upper middle index = data.length / 2
     *     Average = (data[lower] + data[upper]) / 2.0   ← use 2.0 to force double division
     *
     * Examples:
     *   findMedian({1, 2, 3})       → 2.0   (odd length, middle element is index 1)
     *   findMedian({1, 2, 3, 4})    → 2.5   (even length, (2+3)/2.0 = 2.5)
     *   findMedian({5})             → 5.0
     */
    public static double findMedian(int[] sortedData) {
        // TODO: Check if sortedData.length % 2 == 1 (odd) or == 0 (even).
        //       Return the appropriate value as described above.
        return 0;
    }

    /**
     * Returns a summary string for an integer array.
     *
     * TODO: Use loops to compute:
     *   - count : sortedData.length (or data.length)
     *   - min   : initialize to data[0], then loop to find smallest value
     *   - max   : initialize to data[0], then loop to find largest value
     *   - sum   : start at 0, add each element in a loop
     *
     *   Return the string in exactly this format:
     *     "Count: [n], Min: [min], Max: [max], Sum: [sum]"
     *
     * Example:
     *   summarizeData({3, 1, 4, 1, 5}) → "Count: 5, Min: 1, Max: 5, Sum: 14"
     */
    public static String summarizeData(int[] data) {
        // TODO: Declare and initialize count, min, max, sum.
        //       Loop through data[] to update min, max, and sum.
        //       Return the formatted string using string concatenation.
        return "";
    }

    public static void main(String[] args) {
        int[] odd = {1, 2, 3};
        int[] even = {1, 2, 3, 4};
        System.out.println(findMedian(odd));
        System.out.println(findMedian(even));

        int[] sample = {3, 1, 4, 1, 5};
        System.out.println(summarizeData(sample));
    }
}
