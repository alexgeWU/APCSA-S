package unit1;

/**
 * Topic 1.7 – Application Program Interface (API) and Libraries
 *
 * AP Essential Knowledge:
 * - An API (Application Program Interface) defines how to use a library without knowing its internals.
 * - Java's standard library provides many pre-written classes (String, Math, etc.).
 * - We use library classes by calling their documented methods.
 * - We do not need to understand the implementation — only the method signatures and behaviors.
 *
 * Students will learn:
 * - How to call multiple methods from the String API and interpret their results.
 * - How to chain Math API methods to compute a value.
 */
public class Topic7_APILibraries {

    /**
     * Demonstrate at String API methods by printing their results.
     *
     * TODO: Declare a String variable (e.g., String s = "Hello, AP CS A!";).
     *  Then use:
     *  String(String str)
     *  int length()
     *  String substring(int from, int to)
     *  String substring(int from)
     *  int indexOf(String str)
     *  boolean equals(Object other)
     *  int compareTo(String other)
     *  String[] split(String del)
     *
     */
    public static void exploreStringAPI() {

    }

    /**
     * Demonstrate at String API methods by printing their results.
     *
     * TODO: Use chained Math API calls:
     *      static int abs(int x)
     *      static double abs(double x)
     *      static double pow(double base, double exponent)
     *      static double sqrt(double x)
     *      static double random()
     */
    public static String useMathAPI(double x) {
//        try using '\n' in a String to create a new line
        return "";
    }

    public static void main(String[] args) {
        exploreStringAPI();
        System.out.println(useMathAPI(-16.0));
        System.out.println(useMathAPI(9.0));
        System.out.println(useMathAPI(-2.0));
    }
}
