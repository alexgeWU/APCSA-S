package unit1;

/**
 * Topic 1.14 – Calling Instance Methods
 *
 * AP Essential Knowledge:
 * - Instance methods are called on a specific object using the dot operator: object.method()
 * - They operate on (and may access) the state of that particular object.
 * - Calling an instance method on a null reference throws a NullPointerException at runtime.
 * - NullPointerException is a runtime exception — it is not caught by the compiler.
 *
 * Students will learn:
 * - How to call and use multiple instance methods on a String object.
 * - How to anticipate and handle NullPointerException using try-catch.
 */
public class Topic14_InstanceMethods {

    /**
     * Call three String instance methods and print each result with a label.
     *
     * TODO: Declare a String: String s = "Hello, World!";
     *       Then call and print three instance methods:
     *         1. s.length()        → number of characters (int)
     *            Print: "Length: 13"
     *         2. s.substring(7)    → substring from index 7 to the end
     *            Print: "Substring(7): World!"
     *         3. s.indexOf("World") → index where "World" starts
     *            Print: "indexOf(\"World\"): 7"
     *       All three are called on the SAME object s using the dot operator.
     *       Note: string indices start at 0. 'H' is at index 0, 'W' is at index 7.
     */
    public static void callStringMethods() {
        // TODO: declare String "Hello, World!", call length(), substring(7), indexOf("World"); print each
    }

    /**
     * Demonstrate that calling a method on null causes NullPointerException.
     *
     * TODO: Follow these steps:
     *       1. Declare: String s = null;
     *       2. Wrap the following in a try block:
     *            s.toUpperCase()   ← this will throw NullPointerException
     *       3. In the catch(NullPointerException e) block, print:
     *          "Caught NullPointerException: cannot call methods on null"
     *       This is a critical AP concept — always check that an object reference is
     *       not null before calling instance methods on it.
     */
    public static void demonstrateNullPointer() {
        // TODO: set String to null, call .toUpperCase() in try-catch(NullPointerException e)
    }

    public static void main(String[] args) {
        callStringMethods();
        demonstrateNullPointer();
    }
}
