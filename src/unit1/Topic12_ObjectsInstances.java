package unit1;

/**
 * Topic 1.12 – Objects: Instances of Classes
 *
 * AP Essential Knowledge:
 * - A class is a blueprint (template) for creating objects.
 * - An object is an instance of a class — it has its own state and behavior.
 * - Reference variables store the memory address (reference) of an object, not the object itself.
 * - == on objects compares references (addresses), NOT content.
 * - .equals() compares the content of objects (for String and most library classes).
 * - null means a reference variable does not point to any object.
 *
 * Students will learn:
 * - The difference between == (reference equality) and .equals() (content equality).
 * - That calling a method on a null reference throws a NullPointerException.
 */
public class Topic12_ObjectsInstances {

    /**
     * Demonstrate the difference between == and .equals() with two String instances.
     *
     * TODO: Create two String objects using the constructor form (not string literals):
     *         String s1 = new String("hello");
     *         String s2 = new String("hello");
     *       Then print:
     *         1. The result of (s1 == s2) — this compares references, should be FALSE
     *            Label it: "s1 == s2: false"
     *         2. The result of s1.equals(s2) — this compares content, should be TRUE
     *            Label it: "s1.equals(s2): true"
     *       Explanation: s1 and s2 point to different objects in memory (different addresses),
     *       so == is false. But they contain the same characters, so .equals() is true.
     */
    public static void demonstrateInstances() {
        // TODO: create two new String("hello") objects, compare with == and .equals(), print both
    }

    /**
     * Demonstrate that null is not a real object and cannot have methods called on it.
     *
     * TODO: Follow these steps:
     *       1. Declare a String variable and assign null: String s = null;
     *       2. Print the variable: System.out.println("s = " + s);
     *          (This works — String concatenation handles null gracefully.)
     *       3. Inside a try block, call s.length() — this WILL throw NullPointerException.
     *       4. In the catch(NullPointerException e) block, print:
     *          "Caught NullPointerException: s is null and has no methods"
     *       This is a critical AP concept: null references cannot be used to call methods.
     */
    public static void showNullReference() {
        // TODO: declare String as null, print it, then call .length() inside try-catch
    }

    public static void main(String[] args) {
        demonstrateInstances();
        showNullReference();
    }
}
