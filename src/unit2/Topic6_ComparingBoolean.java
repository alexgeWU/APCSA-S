package unit2;

/*
 * AP Topic 2.6 – Comparing Boolean Expressions
 *
 * Students learn:
 *   - Two boolean expressions are EQUIVALENT if they produce the same result
 *     for every possible combination of input values (truth table identical).
 *   - De Morgan's Laws (very commonly tested on the AP exam):
 *       !(a && b)  ≡  !a || !b
 *       !(a || b)  ≡  !a && !b
 *   - String comparison pitfall:
 *       ==        compares REFERENCES (memory addresses) — two String variables
 *                 can hold identical text but be different objects → == gives false
 *       .equals() compares the CONTENT character by character → correct for text
 *
 * Always use .equals() (or .equalsIgnoreCase()) when comparing String values.
 */
public class Topic6_ComparingBoolean {

    /**
     * TODO: Demonstrate both of De Morgan's Laws by computing and printing four values.
     *
     *   Law 1:
     *     Compute  result1 = !(a && b)
     *     Compute  result2 = !a || !b
     *     Print:   "!(a && b) = " + result1
     *     Print:   "!a || !b  = " + result2
     *     (result1 and result2 will always be equal — that is De Morgan's first law)
     *
     *   Law 2:
     *     Compute  result3 = !(a || b)
     *     Compute  result4 = !a && !b
     *     Print:   "!(a || b) = " + result3
     *     Print:   "!a && !b  = " + result4
     *     (result3 and result4 will always be equal — that is De Morgan's second law)
     *
     * Parameters:
     *   a, b – the two boolean inputs to test
     *
     * Returns: void (prints results to demonstrate the equivalence)
     *
     * Example:
     *   demonstrateDeMorgan(true, false)
     *     prints:  !(a && b) = true
     *              !a || !b  = true
     *              !(a || b) = false
     *              !a && !b  = false
     */
    public static void demonstrateDeMorgan(boolean a, boolean b) {
        // TODO: implement — compute the four expressions and print them
    }

    /**
     * TODO: Compare s1 and s2 in two ways and print both results.
     *
     *   1. Reference comparison:
     *      boolean refEqual = (s1 == s2);
     *      Print: "Reference equal: " + refEqual
     *
     *   2. Content comparison:
     *      boolean contentEqual = s1.equals(s2);
     *      Print: "Content equal: " + contentEqual
     *
     *   Then return the result of .equals() (content comparison).
     *
     *   This method shows why == can give a misleading false even when two
     *   String variables contain identical text.
     *
     * Parameters:
     *   s1, s2 – the two String values to compare
     *
     * Returns: boolean – true if s1 and s2 have the same content (.equals())
     *
     * Example:
     *   String a = new String("hello");
     *   String b = new String("hello");
     *   stringsEquivalent(a, b)
     *     prints:  Reference equal: false   (different objects)
     *              Content equal: true
     *     returns: true
     */
    public static boolean stringsEquivalent(String s1, String s2) {
        // TODO: implement — compare with == and .equals(), print both, return .equals() result
        return false;
    }

    public static void main(String[] args) {
        demonstrateDeMorgan(true, false);
        System.out.println("---");
        String a = new String("hello");
        String b = new String("hello");
        stringsEquivalent(a, b);
    }
}
