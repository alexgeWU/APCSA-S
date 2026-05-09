package unit2;

/*
 * AP Topic 2.3 – if Statements
 *
 * Students learn three forms of conditional execution:
 *   if            – one-way selection: block runs only when condition is true
 *   if-else       – two-way selection: one of exactly two blocks runs
 *   if-else-if    – multi-way selection (chain): the FIRST matching branch runs;
 *                   all remaining branches are skipped, even if they also match
 *
 * Best practice: always use braces {} even for single-statement bodies to
 * avoid logic errors when code is later modified.
 *
 * The order of branches in an else-if chain matters — put more specific
 * conditions before more general ones.
 */
public class Topic3_IfStatements {

    /**
     * TODO: Use an if-else-if chain to convert a numeric score to a letter grade.
     *       Check from highest to lowest to avoid overlap issues:
     *         score >= 90             →  "A"
     *         score >= 80 (and < 90)  →  "B"
     *         score >= 70 (and < 80)  →  "C"
     *         score >= 60 (and < 70)  →  "D"
     *         anything below 60       →  "F"  (the final else branch)
     *
     * Parameters:
     *   score – an integer exam score (assume 0–100)
     *
     * Returns: String – the letter grade
     *
     * Example:
     *   gradeToLetter(95)  →  "A"
     *   gradeToLetter(85)  →  "B"
     *   gradeToLetter(55)  →  "F"
     *   gradeToLetter(90)  →  "A"   (boundary — exactly 90 is an A)
     */
    public static String gradeToLetter(int score) {
        // TODO: implement using if-else-if chain
        return "";
    }

    /**
     * TODO: Use an if-else-if chain to classify an integer as positive, negative,
     *       or zero and return the corresponding label string.
     *         n > 0   →  "positive"
     *         n < 0   →  "negative"
     *         n == 0  →  "zero"
     *
     * Parameters:
     *   n – any integer
     *
     * Returns: String – "positive", "negative", or "zero"
     *
     * Example:
     *   classifyNumber(7)   →  "positive"
     *   classifyNumber(-5)  →  "negative"
     *   classifyNumber(0)   →  "zero"
     */
    public static String classifyNumber(int n) {
        // TODO: implement using if-else
        return "";
    }

    public static void main(String[] args) {
        System.out.println(gradeToLetter(85));      // expected: B
        System.out.println(gradeToLetter(55));      // expected: F
        System.out.println(classifyNumber(-5));     // expected: negative
        System.out.println(classifyNumber(0));      // expected: zero
    }
}
