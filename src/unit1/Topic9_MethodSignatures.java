package unit1;

/**
 * Topic 1.9 – Method Signatures
 *
 * AP Essential Knowledge:
 * - A method signature consists of the method name and its parameter types (in order).
 * - The return type is NOT part of the signature for the purposes of overloading.
 * - Method overloading: two methods can share the same name if their parameter lists differ.
 * - void methods perform an action but return no value.
 * - The compiler selects which overloaded method to call based on the arguments provided.
 *
 * Students will learn:
 * - How to implement two overloaded methods with the same name but different parameter counts.
 * - How to describe a method signature as a formatted string.
 */
public class Topic9_MethodSignatures {

    /**
     * Compute the area of a circle with the given radius.
     *
     * @param radius the radius of the circle
     * @return π * radius²
     *
     * TODO: Return Math.PI * radius * radius
     *       (Or equivalently: Math.PI * Math.pow(radius, 2))
     *       Example: area(1.0) → 3.141592653589793
     *       Example: area(5.0) → 78.53981633974483
     *       This method is overloaded — it has the same name as area(double, double) below
     *       but takes only ONE parameter instead of two.
     */
    public static double area(double radius) {
        // TODO: return Math.PI * radius * radius
        return 0;
    }

    /**
     * Compute the area of a rectangle with the given dimensions.
     *
     * @param length the length of the rectangle
     * @param width  the width of the rectangle
     * @return length * width
     *
     * TODO: Return length * width.
     *       Example: area(4.0, 5.0) → 20.0
     *       Example: area(3.0, 3.0) → 9.0
     *       This is the second overloaded version of area — it takes TWO parameters.
     *       The compiler picks this version when called with two arguments.
     */
    public static double area(double length, double width) {
        // TODO: return length * width
        return 0;
    }

    /**
     * Print a formatted description of a method signature.
     *
     * @param methodName the name of the method (e.g., "add")
     * @param returnType the return type as a string (e.g., "int")
     * @param params     the parameter list as a string (e.g., "int a, int b")
     *
     * TODO: Print a single line in this exact format:
     *       "Method: [methodName] | Returns: [returnType] | Parameters: ([params])"
     *       Example: describeSignature("add", "int", "int a, int b")
     *         prints → Method: add | Returns: int | Parameters: (int a, int b)
     *       Use string concatenation or println to build the output.
     */
    public static void describeSignature(String methodName, String returnType, String params) {
        // TODO: print "Method: [methodName] | Returns: [returnType] | Parameters: ([params])"
    }

    public static void main(String[] args) {
        System.out.println(area(1.0));
        System.out.println(area(4.0, 5.0));
        describeSignature("add", "int", "int a, int b");
        describeSignature("area", "double", "double radius");
    }
}
