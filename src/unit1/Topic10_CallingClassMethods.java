package unit1;

/**
 * Topic 1.10 – Calling Class Methods
 *
 * AP Essential Knowledge:
 * - Class methods (static methods) belong to the class, not to any specific object instance.
 * - They are called using the class name: ClassName.methodName(arguments)
 * - You do not need to create an object to call a static method.
 * - The return value of a method call must be stored in a variable or used immediately.
 *
 * Students will learn:
 * - How to define and call a static method using the class name.
 * - How to use a static utility method (repeat) and verify its output by calling it from main.
 */
public class Topic10_CallingClassMethods {

    /**
     * Return the largest of three integer values.
     *
     * @param a the first integer
     * @param b the second integer
     * @param c the third integer
     * @return the maximum of a, b, and c
     *
     * TODO: Use nested if-else (or two separate Math.max calls) to find and return the largest.
     *       Approach A (if-else):
     *         if (a >= b && a >= c) return a;
     *         else if (b >= a && b >= c) return b;
     *         else return c;
     *       Approach B (Math.max): return Math.max(a, Math.max(b, c));
     *       Example: max(3, 7, 5) → 7
     *       Example: max(10, 10, 9) → 10
     *       In main, call this as: Topic10_CallingClassMethods.max(3, 7, 5)
     */
    public static int max(int a, int b, int c) {
        // TODO: return the largest of a, b, c
        return 0;
    }

    /**
     * Return the String s repeated times number of times.
     *
     * @param s     the string to repeat
     * @param times the number of repetitions (assumed >= 0)
     * @return s concatenated times times; empty string if times == 0
     *
     * TODO: Use a for loop to build and return a new String by concatenating s
     *       to a result variable on each iteration.
     *       Start with: String result = "";
     *       Loop times times: result += s;
     *       Return result.
     *       Example: repeat("hi", 3) → "hihihi"
     *       Example: repeat("ab", 1) → "ab"
     *       Example: repeat("x", 0)  → ""
     *       In main, call this as: Topic10_CallingClassMethods.repeat("hi", 3)
     */
    public static String repeat(String s, int times) {
        // TODO: use a for loop to concatenate s to result 'times' times, then return result
        return "";
    }

    public static void main(String[] args) {
        System.out.println(Topic10_CallingClassMethods.max(3, 7, 5));
        System.out.println(Topic10_CallingClassMethods.max(10, 10, 9));
        System.out.println(Topic10_CallingClassMethods.repeat("hi", 3));
        System.out.println(Topic10_CallingClassMethods.repeat("ab", 1));
    }
}
