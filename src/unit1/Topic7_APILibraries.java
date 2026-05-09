package unit1;

/**
 * Topic 1.7 – Application Program Interface (API) and Libraries
 *
 * AP Essential Knowledge:
 * - An API (Application Program Interface) defines how to use a library without knowing its internals.
 * - Java's standard library provides many pre-written classes (String, Math, etc.).
 * - We use library classes by calling their documented methods.
 * - We do not need to understand the implementation — only the method signatures and behaviors.
 *
 * Students will learn:
 * - How to call multiple methods from the String API and interpret their results.
 * - How to chain Math API methods to compute a value.
 */
public class Topic7_APILibraries {

    /**
     * Demonstrate at least three String API methods by printing their results.
     *
     * TODO: Declare a String variable (e.g., String s = "Hello, AP CS A!";).
     *       Call and print the results of at least 3 String API methods, each on its own labeled line.
     *       Required methods to demonstrate:
     *         1. s.length()         → prints the number of characters
     *         2. s.toUpperCase()    → prints the string in all caps
     *         3. s.contains("AP")   → prints true or false
     *       Print each result labeled, for example:
     *         Length: 14
     *         Uppercase: HELLO, AP CS A!
     *         Contains "AP": true
     */
    public static void exploreStringAPI() {
        // TODO: declare a String, call length(), toUpperCase(), contains(); print each result labeled
    }

    /**
     * Return Math.sqrt(Math.abs(x)) — the square root of the absolute value of x.
     *
     * @param x any double value (may be negative)
     * @return the square root of |x|
     *
     * TODO: Use two chained Math API calls:
     *         1. Math.abs(x)       → returns the absolute value (removes the negative sign)
     *         2. Math.sqrt(...)    → returns the square root of the result
     *       Return Math.sqrt(Math.abs(x)) in a single expression.
     *       Example: useMathAPI(-16.0) → Math.abs(-16.0) = 16.0 → Math.sqrt(16.0) = 4.0
     *       Example: useMathAPI(9.0)   → Math.abs(9.0)  = 9.0  → Math.sqrt(9.0)  = 3.0
     *       Example: useMathAPI(-2.0)  → Math.abs(-2.0) = 2.0  → Math.sqrt(2.0) ≈ 1.4142
     *
     * @param x the input value
     * @return Math.sqrt(Math.abs(x))
     */
    public static double useMathAPI(double x) {
        // TODO: return Math.sqrt(Math.abs(x))
        return 0;
    }

    public static void main(String[] args) {
        exploreStringAPI();
        System.out.println(useMathAPI(-16.0));
        System.out.println(useMathAPI(9.0));
        System.out.println(useMathAPI(-2.0));
    }
}
