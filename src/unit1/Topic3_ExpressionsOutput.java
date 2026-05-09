package unit1;

/**
 * Topic 1.3 – Expressions and Output
 *
 * AP Essential Knowledge:
 * - Arithmetic operators: + (add), - (subtract), * (multiply), / (divide), % (modulo/remainder).
 * - Integer division truncates (drops the decimal): 7 / 2 = 3, not 3.5.
 * - Operator precedence follows PEMDAS: *, /, % before + and -.
 * - System.out.print does NOT add a newline; System.out.println DOES add a newline.
 * - The + operator with a String performs concatenation, not addition.
 *
 * Students will learn:
 * - How to evaluate arithmetic expressions with integer division and modulo.
 * - How to format output using string concatenation with System.out.println.
 */
public class Topic3_ExpressionsOutput {

    /**
     * Evaluate and return the result of: (a * b) + (a / b) - (a % b)
     *
     * @param a the first integer operand
     * @param b the second integer operand (assumed non-zero)
     * @return the integer result of (a * b) + (a / b) - (a % b)
     *
     * TODO: Return the expression (a * b) + (a / b) - (a % b).
     *       Remember that all operands are int, so division truncates.
     *       Example: a=7, b=2
     *         a * b = 14
     *         a / b = 3   (integer division: 7/2 truncates to 3)
     *         a % b = 1   (7 mod 2 = 1)
     *         result = 14 + 3 - 1 = 16
     *       Example: a=10, b=3
     *         10*3=30, 10/3=3, 10%3=1 → 30 + 3 - 1 = 32
     */
    public static int evaluateExpression(int a, int b) {
        // TODO: return (a * b) + (a / b) - (a % b)
        return 0;
    }

    /**
     * Print two lines of formatted output using string concatenation.
     *
     * @param name the person's name
     * @param age  the person's age
     *
     * TODO: Print exactly two lines using System.out.println and string concatenation (+):
     *       Line 1: "Name: [name], Age: [age]"
     *       Line 2: "In 10 years: [age + 10]"
     *       Example: printFormatted("Alice", 16)
     *         Name: Alice, Age: 16
     *         In 10 years: 26
     *       Be careful: age + 10 inside a concatenation — use parentheses if needed
     *       to avoid "Age: 1610" (string + int concatenation gotcha).
     */
    public static void printFormatted(String name, int age) {
        // TODO: print "Name: [name], Age: [age]" then "In 10 years: [age+10]"
    }

    public static void main(String[] args) {
        System.out.println(evaluateExpression(7, 2));
        System.out.println(evaluateExpression(10, 3));
        printFormatted("Alice", 16);
    }
}
