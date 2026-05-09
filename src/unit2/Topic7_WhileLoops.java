package unit2;

/*
 * AP Topic 2.7 – while Loops
 *
 * Students learn:
 *   - Syntax:  while (condition) { body }
 *   - The condition is checked BEFORE each iteration (including the first).
 *     If the condition is false on entry, the body NEVER executes.
 *   - The loop body must eventually make the condition false; if it never does,
 *     the program runs forever (infinite loop — a common bug).
 *   - Off-by-one errors are frequent: carefully decide whether the condition
 *     uses < vs <= and where the update step goes.
 *   - A while loop is preferred over a for loop when the number of iterations
 *     is not known in advance (e.g., reading until a sentinel value).
 */
public class Topic7_WhileLoops {

    /**
     * TODO: Use a while loop to sum the individual digits of a non-negative integer.
     *
     *   Algorithm:
     *     Initialize sum = 0
     *     while n > 0:
     *       digit = n % 10      // last digit (e.g., 123 % 10 = 3)
     *       sum  += digit
     *       n    = n / 10       // remove last digit (e.g., 123 / 10 = 12)
     *     return sum
     *
     * Parameters:
     *   n – a non-negative integer (assume n >= 0)
     *
     * Returns: int – the sum of all digits
     *
     * Example:
     *   sumDigits(123)  →  6   (1 + 2 + 3)
     *   sumDigits(9)    →  9
     *   sumDigits(0)    →  0
     *   sumDigits(999)  →  27
     */
    public static int sumDigits(int n) {
        // TODO: implement using a while loop with % and / operators
        return 0;
    }

    /**
     * TODO: Implement the Collatz sequence and count steps to reach 1.
     *
     *   Algorithm:
     *     Initialize steps = 0
     *     while n != 1:
     *       if n is even (n % 2 == 0)  →  n = n / 2
     *       else                        →  n = 3 * n + 1
     *       steps++
     *     return steps
     *
     *   The Collatz conjecture states that this always eventually reaches 1
     *   (unproven in general, but true for all tested values).
     *
     * Parameters:
     *   n – a positive integer >= 1
     *
     * Returns: int – the number of steps taken to reach 1
     *
     * Example:
     *   collatz(1)  →  0   (already 1)
     *   collatz(2)  →  1   (2 → 1)
     *   collatz(6)  →  8   (6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1)
     *   collatz(27) →  111
     */
    public static int collatz(int n) {
        // TODO: implement the Collatz sequence loop, count and return steps
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(123));  // expected: 6
        System.out.println(sumDigits(0));    // expected: 0
        System.out.println(collatz(6));      // expected: 8
        System.out.println(collatz(1));      // expected: 0
    }
}
