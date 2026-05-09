package unit1;

import java.util.Scanner;

/**
 * Topic 1.4 – Assignment Statements and Input
 *
 * AP Essential Knowledge:
 * - The assignment operator = stores a value in a variable (right side evaluated first).
 * - Variables must be declared before they can be used.
 * - A temporary variable is needed to swap two values without losing one.
 * - Scanner (from java.util.Scanner) reads user input from System.in.
 * - Common Scanner methods: nextLine() for a String, nextInt() for an int.
 *
 * Students will learn:
 * - How to swap two variables using a temporary variable.
 * - How to read user input with Scanner and use it in output.
 */
public class Topic4_AssignmentInput {

    /**
     * Swap the values of x and y using a temporary variable, then return the new x.
     *
     * @param x the first integer
     * @param y the second integer
     * @return the new value of x after swapping (which equals the original y)
     *
     * TODO: Use a third variable called temp to hold x while you swap.
     *       Example: swapAndReturn(3, 7) → returns "x = 7, y = 3"
     *       Example: swapAndReturn(10, 4) → returns "x = 4, y = 10"
     */
    public static String swapAndReturn(int x, int y) {
        // TODO: swap x and y using a temp variable
        return "";
    }

    /**
     * Prompt the user for their name using Scanner, then print a greeting.
     *
     * USE THIS PAGE:
     * https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
     * TODO: Follow these steps:
     *       1. Create a Scanner
     *       2. Print the prompt (no newline) requesting the user's name
     *       3. Read a line of input
     *       4. Print: "Hello, [name]!"
     *       5. Close the scanner
     */
    public static void readAndPrintName() {
        // TODO: use Scanner to read a name from System.in, then print "Hello, [name]!"
    }

    public static void main(String[] args) {
        System.out.println(swapAndReturn(3, 7));
        System.out.println(swapAndReturn(10, 4));
        readAndPrintName();
    }
}
