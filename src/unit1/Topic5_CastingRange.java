package unit1;

/**
 * Topic 1.5 – Casting and Range of Variables
 *
 * AP Essential Knowledge:
 * - Casting converts a value from one type to another.
 * - (int) applied to a double TRUNCATES toward zero (does NOT round): (int) 9.99 = 9.
 * - Widening conversion (int → double) happens automatically: int a = 5; double d = a; // d = 5.0
 * - Narrowing conversion (double → int) requires an explicit cast: (int) 3.9 → 3
 * - int range: approximately −2,147,483,648 to 2,147,483,647 (~±2.1 billion).
 *
 * Students will learn:
 * - How to explicitly cast a double to int and understand truncation behavior.
 * - How to compute a decimal average from int inputs by casting to avoid integer division.
 */
public class Topic5_CastingRange {

    /**
     * Cast a double value to int (truncating toward zero) and return the result.
     *
     * @param value the double to truncate
     * @return the int result of casting value to int (truncation, not rounding)
     *
     * TODO: Use an explicit cast: return (int) value;
     *       Note: (int) truncates toward zero — it drops the fractional part entirely.
     *       Example: truncateToInt(9.99)  → 9
     *       Example: truncateToInt(3.1)   → 3
     *       Example: truncateToInt(-3.7)  → -3
     *       Example: truncateToInt(-0.5)  → 0
     */
    public static int truncateToInt(double value) {
        // TODO: cast value to int and return it
        return 0;
    }

    /**
     * Compute the average of three int values and return it as a double.
     *
     * @param a the first integer
     * @param b the second integer
     * @param c the third integer
     * @return the average of a, b, and c as a double (with decimal precision)
     *
     * TODO: Return the average of a, b, and c as a double.
     *       WARNING: (a + b + c) / 3 uses integer division and loses the decimal!
     */
    public static double computeAverage(int a, int b, int c) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(truncateToInt(9.99));
        System.out.println(truncateToInt(-3.7));
        System.out.println(computeAverage(1, 2, 3));
        System.out.println(computeAverage(1, 2, 4));
    }
}
