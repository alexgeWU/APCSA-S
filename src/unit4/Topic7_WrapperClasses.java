package unit4;

import java.util.ArrayList;

/*
 * Topic 4.7 – Wrapper Classes
 *
 * Learning Goals:
 * - Integer and Double wrap primitives as objects (required for ArrayList<E>).
 * - Autoboxing: automatic conversion from int → Integer (primitive to object).
 * - Unboxing: automatic conversion from Integer → int (object to primitive).
 * - Integer.parseInt(String) converts a String to an int.
 * - Double.parseDouble(String) converts a String to a double.
 * - Integer.MAX_VALUE and Integer.MIN_VALUE are useful constants.
 */
public class Topic7_WrapperClasses {

    /**
     * Parses two numeric strings, adds the resulting ints, and returns the sum.
     *
     * TODO:
     *   1. int a = Integer.parseInt(num1);
     *   2. int b = Integer.parseInt(num2);
     *   3. return a + b;
     *
     * Example:
     *   parseAndSum("15", "27") → 42
     *   parseAndSum("0", "100") → 100
     */
    public static int parseAndSum(String num1, String num2) {
        // TODO: Use Integer.parseInt on each string, then return their sum.
        return 0;
    }

    /**
     * Demonstrates autoboxing, unboxing, and using Integer inside an ArrayList.
     *
     * TODO:
     *   1. Autoboxing example:
     *        Integer boxed = 42;          // int literal 42 is autoboxed to Integer
     *        int unboxed = boxed;         // Integer is unboxed back to int
     *        System.out.println("Boxed: " + boxed + ", Unboxed: " + unboxed);
     *
     *   2. ArrayList with autoboxing:
     *        ArrayList<Integer> numbers = new ArrayList<Integer>();
     *        numbers.add(7);              // int 7 is autoboxed to Integer automatically
     *        int retrieved = numbers.get(0);  // Integer is unboxed to int
     *        System.out.println("From ArrayList: " + retrieved);
     *
     *   3. Print Integer.MAX_VALUE and Integer.MIN_VALUE.
     */
    public static void demonstrateAutoboxing() {
        // TODO: Implement the three steps described above.
    }

    public static void main(String[] args) {
        System.out.println(parseAndSum("15", "27"));
        demonstrateAutoboxing();
    }
}
