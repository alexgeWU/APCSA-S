package unit2;

/*
 * AP Topic 2.2 – Boolean Expressions
 *
 * Students learn that relational operators produce boolean (true/false) values:
 *   ==   equal to          (on primitives: compares value; on objects: compares reference)
 *   !=   not equal to
 *   <    less than
 *   >    greater than
 *   <=   less than or equal
 *   >=   greater than or equal
 *
 * IMPORTANT: Using == on String (or any reference type) checks whether two
 * variables point to the SAME object in memory, NOT whether they contain the
 * same characters.  Always use .equals() to compare String content.
 *
 * Boolean expressions evaluate to exactly true or false and can be used
 * directly as conditions in if statements and loops.
 */
public class Topic2_BooleanExpressions {

    /**
     * TODO: Return true if value is greater than or equal to low
     *       AND less than or equal to high; return false otherwise.
     *       Use the >= and <= relational operators combined with &&.
     *
     * Parameters:
     *   value – the integer to test
     *   low   – the inclusive lower bound
     *   high  – the inclusive upper bound
     *
     * Returns: boolean – true if low <= value <= high
     *
     * Example:
     *   isInRange(5, 1, 10)   →  true
     *   isInRange(11, 1, 10)  →  false
     *   isInRange(1, 1, 10)   →  true   (boundary: equal to low)
     *   isInRange(10, 1, 10)  →  true   (boundary: equal to high)
     */
    public static boolean isInRange(int value, int low, int high) {
        // TODO: implement
        return false;
    }

    /**
     * TODO: Return true if age is between 13 and 19 inclusive, false otherwise.
     *       Use a compound boolean expression with >= and <= and &&.
     *       Do NOT use multiple if statements — a single return statement with
     *       a boolean expression is the AP-style approach.
     *
     * Parameters:
     *   age – the age to check
     *
     * Returns: boolean – true if 13 <= age <= 19
     *
     * Example:
     *   isTeen(13)  →  true   (lower boundary)
     *   isTeen(15)  →  true
     *   isTeen(19)  →  true   (upper boundary)
     *   isTeen(12)  →  false
     *   isTeen(20)  →  false
     */
    public static boolean isTeen(int age) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isInRange(5, 1, 10));   // expected: true
        System.out.println(isInRange(11, 1, 10));  // expected: false
        System.out.println(isTeen(15));             // expected: true
        System.out.println(isTeen(20));             // expected: false
    }
}
