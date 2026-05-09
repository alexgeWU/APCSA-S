package unit1;

/**
 * Topic 1.6 – Compound Assignment Operators
 *
 * AP Essential Knowledge:
 * - Compound assignment operators are shorthand: x += 5 means x = x + 5.
 * - The operators are: += (add), -= (subtract), *= (multiply), /= (divide), %= (modulo).
 * - ++ increments a variable by 1 (x++ or ++x); -- decrements by 1.
 * - The original variable is modified in place by these operators.
 *
 * Students will learn:
 * - How to chain compound assignment operations step by step.
 * - How to use -= in a loop to count iterations until a threshold is reached.
 */
public class Topic6_CompoundAssignment {

    /**
     * Apply a series of compound assignment operations to n and return the result.
     *
     * @param n the starting integer value
     * @return the result after applying all four compound operations in order
     *
     * TODO: Save the original value of n first (int original = n;).
     *       Then apply these four operations IN ORDER using compound assignment:
     *         1. n *= 3       (multiply n by 3)
     *         2. n += 10      (add 10 to n)
     *         3. n -= original  (subtract the ORIGINAL n, not the current n)
     *         4. n %= 7       (take n mod 7)
     *       Return n after all four steps.
     *       Example: n=4
     *         original = 4
     *         n *= 3  → n = 12
     *         n += 10 → n = 22
     *         n -= 4  → n = 18
     *         n %= 7  → n = 4   (18 % 7 = 4)
     *         return 4
     *       Example: n=5
     *         original=5, 5*3=15, 15+10=25, 25-5=20, 20%7=6 → return 6
     */
    public static int applyCompoundOps(int n) {
        // TODO: save original, then apply *= 3, += 10, -= original, %= 7; return n
        return 0;
    }

    /**
     * Count how many steps it takes to count down from start to 0 or below using -= 3.
     *
     * @param start the starting integer (assumed positive and divisible by 3 for clean examples)
     * @return the number of -= 3 steps taken before reaching 0 or below
     *
     * TODO: Use a while loop. Each iteration, subtract 3 from start (start -= 3)
     *       and increment a counter. Stop when start <= 0.
     *       Return the counter (number of steps taken).
     *       Example: start=9
     *         Step 1: start = 9 - 3 = 6  (counter = 1)
     *         Step 2: start = 6 - 3 = 3  (counter = 2)
     *         Step 3: start = 3 - 3 = 0  (counter = 3, 0 <= 0 so stop)
     *         return 3
     *       Example: start=10
     *         10→7→4→1→-2 → 4 steps → return 4
     */
    public static int countDownByThree(int start) {
        // TODO: while loop using -= 3, count steps until start <= 0
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(applyCompoundOps(4));
        System.out.println(applyCompoundOps(5));
        System.out.println(countDownByThree(9));
        System.out.println(countDownByThree(10));
    }
}
