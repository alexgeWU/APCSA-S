package unit1;

/**
 * Topic 1.13 – Object Creation and Storage (Instantiation)
 *
 * AP Essential Knowledge:
 * - The new keyword allocates memory on the heap and invokes a constructor.
 * - The constructor has the same name as the class and initializes the object's state.
 * - The resulting reference (memory address) is stored in a reference variable.
 * - String literals ("hello") are also objects, but stored in the string pool.
 * - StringBuilder is a mutable alternative to String — it can be changed after creation.
 *
 * Students will learn:
 * - That both string literals and new String(...) create String objects.
 * - How to instantiate a StringBuilder and mutate it using .append().
 */
public class Topic13_Instantiation {

    /**
     * Create two String objects using different syntax, concatenate them, and print the result.
     *
     * TODO: Follow these steps:
     *       1. Create a String using a literal:       String s1 = "hello";
     *       2. Create a String using new:             String s2 = new String("world");
     *       3. Concatenate with a space between:      String combined = s1 + " " + s2;
     *       4. Print combined: System.out.println(combined);
     *       Expected output: hello world
     *       Both s1 and s2 are String objects — one created via the string pool,
     *       one via explicit constructor. Both behave the same way once created.
     */
    public static void createStringObjects() {
        // TODO: create s1 via literal, s2 via new String(...), concatenate, print
    }

    /**
     * Instantiate a StringBuilder, append to it twice, and print the final content.
     *
     * TODO: Follow these steps:
     *       1. Instantiate: StringBuilder sb = new StringBuilder("AP");
     *       2. Append using the dot operator: sb.append(" CS A");
     *       3. Append the current year:       sb.append(2025);
     *       4. Print the result:              System.out.println(sb);
     *       Expected output: AP CS A2025
     *       Note: StringBuilder is mutable — .append() MODIFIES the same object in place.
     *       This is unlike String, where every operation creates a NEW String object.
     */
    public static void showObjectAssignment() {
        // TODO: new StringBuilder("AP"), .append(" CS A"), .append(2025), print
    }

    public static void main(String[] args) {
        createStringObjects();
        showObjectAssignment();
    }
}
