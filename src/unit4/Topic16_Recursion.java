package unit4;

/*
 * Topic 4.16 – Recursion
 *
 * Learning Goals:
 * - A recursive method calls itself with a simpler input.
 * - Every recursive method needs a base case (stops recursion) and a recursive case.
 * - The recursive case must move toward the base case to avoid infinite recursion.
 * - Each call gets its own stack frame with its own local variables.
 */
public class Topic16_Recursion {

    /**
     * Returns the nth Fibonacci number (0-indexed).
     *
     * Base cases:
     *   fibonacci(0) → 0   (first number in the sequence)
     *   fibonacci(1) → 1   (second number in the sequence)
     *
     * Recursive case:
     *   fibonacci(n) → fibonacci(n-1) + fibonacci(n-2)
     *   Each call reduces n, eventually reaching the base cases.
     *
     * TODO:
     *   if (n == 0) return 0;
     *   if (n == 1) return 1;
     *   return fibonacci(n - 1) + fibonacci(n - 2);
     *
     * Example:
     *   Sequence:     0, 1, 1, 2, 3, 5, 8, ...
     *   Indices:      0  1  2  3  4  5  6
     *   fibonacci(6) → 8
     *   fibonacci(0) → 0
     */
    public static int fibonacci(int n) {
        // Base case: n == 0 return 0; n == 1 return 1.
        // Recursive case: return fibonacci(n-1) + fibonacci(n-2).
        return 0;
    }

    /**
     * Returns base raised to the power of exponent using recursion.
     *
     * Base case:
     *   exponent == 0 → return 1   (anything to the power 0 is 1)
     *
     * Recursive case:
     *   return base * power(base, exponent - 1)
     *   Each call reduces exponent by 1, approaching the base case.
     *
     * TODO:
     *   if (exponent == 0) return 1;
     *   return base * power(base, exponent - 1);
     *
     * Call stack example for power(2, 5):
     *   power(2,5) → 2 * power(2,4)
     *   power(2,4) → 2 * power(2,3)
     *   power(2,3) → 2 * power(2,2)
     *   power(2,2) → 2 * power(2,1)
     *   power(2,1) → 2 * power(2,0)
     *   power(2,0) → 1                 ← base case
     *   Unwinds: 2*1=2, 2*2=4, 2*4=8, 2*8=16, 2*16=32
     *
     * Example:
     *   power(2, 5) → 32
     *   power(3, 0) → 1
     */
    public static int power(int base, int exponent) {
        // Base case: exponent == 0, return 1.
        // Recursive case: return base * power(base, exponent - 1).
        return 0;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 6; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        System.out.println(power(2, 5));
        System.out.println(power(3, 0));
    }
}
