package unit2;

/*
 * AP Topic 2.4 – Nested if Statements
 *
 * Students learn:
 *   - An if (or if-else) can be placed INSIDE another if or else block.
 *     The inner if is only evaluated when the outer condition is true.
 *   - Dangling-else rule: an else always pairs with the NEAREST preceding if
 *     that doesn't already have an else.  Using braces {} eliminates ambiguity.
 *   - An if-else-if chain executes at most ONE branch, then skips the rest —
 *     useful when conditions are mutually exclusive.
 *
 * A good pattern: use an outer if to validate or categorize, then nested ifs
 * to handle sub-cases within each category.
 */
public class Topic4_NestedIf {

    /**
     * TODO: Classify a triangle by its side lengths using nested ifs.
     *
     *   STEP 1 – Validity check (outer if):
     *     A valid triangle requires that each side is less than the sum of the
     *     other two:  a < b+c  AND  b < a+c  AND  c < a+b.
     *     If NOT valid, return "not a triangle".
     *
     *   STEP 2 – Classification (nested if-else-if, only reached if valid):
     *     - All three sides equal        →  "equilateral"
     *     - Exactly two sides equal      →  "isosceles"
     *       (check: a==b || b==c || a==c, but not all three equal)
     *     - No two sides equal           →  "scalene"
     *
     * Parameters:
     *   a, b, c – the three side lengths (assume positive integers)
     *
     * Returns: String – "equilateral", "isosceles", "scalene", or "not a triangle"
     *
     * Example:
     *   classifyTriangle(3, 3, 3)  →  "equilateral"
     *   classifyTriangle(3, 3, 5)  →  "isosceles"
     *   classifyTriangle(3, 4, 5)  →  "scalene"
     *   classifyTriangle(1, 2, 10) →  "not a triangle"
     */
    public static String classifyTriangle(int a, int b, int c) {
        // TODO: implement using nested if statements
        return "";
    }

    /**
     * TODO: Calculate a ticket price using nested if statements.
     *
     *   Outer ifs handle age-based special pricing:
     *     if age < 12   →  price is $5.00  (child, always)
     *     if age >= 65  →  price is $7.00  (senior, always)
     *
     *   The else branch handles everyone in between (12 <= age < 65).
     *     NESTED inside that else:
     *       if isMember  →  price is $10.00
     *       else         →  price is $15.00
     *
     * Parameters:
     *   age      – the customer's age in years
     *   isMember – true if the customer has a membership
     *
     * Returns: double – the ticket price
     *
     * Example:
     *   ticketPrice(8,  true)   →  5.0   (child, membership irrelevant)
     *   ticketPrice(70, false)  →  7.0   (senior, membership irrelevant)
     *   ticketPrice(30, true)   →  10.0  (adult member)
     *   ticketPrice(30, false)  →  15.0  (adult non-member)
     */
    public static double ticketPrice(int age, boolean isMember) {
        // TODO: implement using nested if statements
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(classifyTriangle(3, 3, 3));  // expected: equilateral
        System.out.println(classifyTriangle(3, 4, 5));  // expected: scalene
        System.out.println(classifyTriangle(1, 2, 10)); // expected: not a triangle
        System.out.println(ticketPrice(30, true));      // expected: 10.0
        System.out.println(ticketPrice(8, false));      // expected: 5.0
    }
}
