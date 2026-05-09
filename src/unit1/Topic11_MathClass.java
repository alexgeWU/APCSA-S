package unit1;

/**
 * Topic 1.11 – Math Class
 *
 * AP Essential Knowledge:
 * - Math is a built-in Java class with static utility methods — call with Math.methodName().
 * - Math.abs(x)       → absolute value of x
 * - Math.pow(a, b)    → a raised to the power b (returns double)
 * - Math.sqrt(x)      → square root of x (returns double)
 * - Math.random()     → a random double in [0.0, 1.0) — includes 0, excludes 1
 * - Math.min(a, b)    → smaller of a and b
 * - Math.max(a, b)    → larger of a and b
 *
 * Students will learn:
 * - How to apply Math.sqrt and Math.pow together to compute a hypotenuse.
 * - How to use Math.random() with scaling and casting to generate integers in a range.
 */
public class Topic11_MathClass {

    /**
     * Compute the hypotenuse of a right triangle given leg lengths a and b.
     *
     * @param a the length of one leg
     * @param b the length of the other leg
     * @return the hypotenuse: sqrt(a² + b²)
     *
     * TODO: Use the Pythagorean theorem: c = sqrt(a^2 + b^2)
     *       Implementation: return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
     *       Math.pow(a, 2) computes a². Math.sqrt computes the square root.
     *       Example: hypotenuse(3.0, 4.0) → 5.0
     *       Example: hypotenuse(5.0, 12.0) → 13.0
     *       Example: hypotenuse(1.0, 1.0) → 1.4142135623730951
     */
    public static double hypotenuse(double a, double b) {
        // TODO: return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))
        return 0;
    }

    /**
     * Return a random integer between min and max, inclusive.
     *
     * @param min the minimum value (inclusive)
     * @param max the maximum value (inclusive), assumed >= min
     * @return a random int in the range [min, max]
     *
     * TODO: Use Math.random() to generate a random int in [min, max] inclusive.
     *       Formula: (int)(Math.random() * (max - min + 1)) + min
     *       Step-by-step:
     *         Math.random()                  → random double in [0.0, 1.0)
     *         * (max - min + 1)              → scales to [0.0, (max-min+1))
     *         (int)(...)                     → truncates to int in [0, max-min]
     *         + min                          → shifts to [min, max]
     *       Example: randomInRange(1, 6) returns one of {1, 2, 3, 4, 5, 6}
     *       Example: randomInRange(0, 1) returns 0 or 1
     *       Note: the result will vary each run — that is expected behavior.
     */
    public static int randomInRange(int min, int max) {
        // TODO: return (int)(Math.random() * (max - min + 1)) + min
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(hypotenuse(3.0, 4.0));
        System.out.println(hypotenuse(5.0, 12.0));
        System.out.println(randomInRange(1, 6));
        System.out.println(randomInRange(0, 1));
    }
}
