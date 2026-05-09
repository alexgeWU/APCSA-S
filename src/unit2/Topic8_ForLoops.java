package unit2;

/*
 * AP Topic 2.8 – for Loops
 *
 * Students learn:
 *   - Syntax:  for (initialization; condition; update) { body }
 *       initialization – runs ONCE before the loop starts
 *       condition       – checked BEFORE each iteration; loop stops when false
 *       update          – runs AFTER each iteration (typically i++ or i--)
 *
 *   - Every for loop can be rewritten as a while loop (and vice versa).
 *     for loops are preferred when the number of iterations is known up front.
 *
 *   - Common off-by-one errors:
 *       i < n   runs n   times (indices 0 … n-1)
 *       i <= n  runs n+1 times (indices 0 … n)
 *     Read the problem carefully to decide which boundary to use.
 */
public class Topic8_ForLoops {

    /**
     * TODO: Use a for loop to compute n! (n factorial).
     *
     *   Algorithm:
     *     Initialize product = 1
     *     for i from 1 to n inclusive (i <= n):
     *       product = product * i
     *     return product
     *
     *   Special case: 0! = 1 (the loop body never runs when n == 0,
     *   so the initialized value of 1 is returned automatically — no extra if needed).
     *
     * Parameters:
     *   n – a non-negative integer
     *
     * Returns: int – n factorial
     *
     * Example:
     *   factorial(0)  →  1
     *   factorial(1)  →  1
     *   factorial(5)  →  120   (1 * 2 * 3 * 4 * 5)
     *   factorial(7)  →  5040
     */
    public static int factorial(int n) {
        // TODO: implement using a for loop
        return 0;
    }

    /**
     * TODO: Use a for loop to build a staircase of asterisks as a String.
     *
     *   Algorithm:
     *     Initialize result = ""
     *     for i from 1 to steps inclusive:
     *       append i asterisks to result
     *       append "\n" (newline) after each row
     *     return result
     *
     *   Hint for the inner row: use another loop (or String.repeat if known)
     *   to build a row of i asterisks, then append "\n".
     *
     * Parameters:
     *   steps – the number of rows in the staircase
     *
     * Returns: String – the complete staircase with each row ending in '\n'
     *
     * Example:
     *   buildStaircase(3)  →  "*\n**\n***\n"
     *   When printed:
     *     *
     *     **
     *     ***
     *
     *   buildStaircase(1)  →  "*\n"
     */
    public static String buildStaircase(int steps) {
        // TODO: implement using a for loop (outer) and inner loop or String repeat
        return "";
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));          // expected: 120
        System.out.println(factorial(0));          // expected: 1
        System.out.print(buildStaircase(3));       // expected staircase of 3 rows
    }
}
