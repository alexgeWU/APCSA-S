package unit1;

/**
 * Topic 1.8 – Documentation with Comments
 *
 * AP Essential Knowledge:
 * - Single-line comments use // and continue to the end of the line.
 * - Multi-line comments use /* and end with * /
 * - Javadoc comments use /** and end with * / — they document classes and methods.
 * - Javadoc tags: @param (describe a parameter), @return (describe the return value),
 *   @precondition (document an assumed condition that must be true before calling the method).
 * - Good comments explain WHY something is done, not just what the code does.
 *
 * Students will learn:
 * - How to write a complete Javadoc comment with @param, @return, and @precondition.
 * - How to use inline comments to explain each logical step of an algorithm.
 */
public class Topic8_Documentation {

    /**
     * TODO: Replace this placeholder Javadoc with a complete Javadoc comment that includes:
     *       - A one-sentence description of what this method does.
     *       - @param numerator   describe what this parameter represents
     *       - @param denominator describe what this parameter represents
     *       - @return            describe what the method returns
     *       - @precondition      state that denominator must not be zero
     *
     * Then implement the method body: return numerator / denominator;
     * (This uses integer division — the result is truncated.)
     * Example: divide(10, 3) → 3
     * Example: divide(7, 2)  → 3
     */
    public static int divide(int numerator, int denominator) {
        // TODO: add full Javadoc above, then return numerator / denominator
        return 0;
    }

    /**
     * Determine whether a given year is a leap year.
     *
     * @param year the year to check (e.g., 2000, 1900, 2024)
     * @return true if year is a leap year, false otherwise
     *
     * TODO: Implement the leap year logic using the three-rule check.
     *       Add a single-line comment above EACH of the three conditions explaining it.
     *       Leap year rules:
     *         Rule 1: The year IS divisible by 4                → could be a leap year
     *         Rule 2: BUT IF also divisible by 100              → NOT a leap year (exception)
     *         Rule 3: UNLESS also divisible by 400              → IS a leap year (exception to exception)
     *       Combined boolean: (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)
     *       Example: isLeapYear(2024) → true   (divisible by 4, not by 100)
     *       Example: isLeapYear(1900) → false  (divisible by 100 but not 400)
     *       Example: isLeapYear(2000) → true   (divisible by 400)
     *       Example: isLeapYear(2023) → false  (not divisible by 4)
     */
    public static boolean isLeapYear(int year) {
        // TODO: add one-line comments above each logical step, then return the boolean result
        return false;
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 3));
        System.out.println(divide(7, 2));
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
    }
}
