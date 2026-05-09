package unit1;

/**
 * Topic 1.2 – Variables and Data Types
 *
 * AP Essential Knowledge:
 * - Java has three key primitive types used on the AP exam: int, double, boolean.
 * - int stores whole numbers; double stores real/decimal numbers; boolean stores true or false.
 * - Reference types (like String) hold the memory address of an object, not the value itself.
 * - A variable is a named storage location in memory that holds a value of a specific type.
 *
 * Students will learn:
 * - How to declare and initialize primitive variables with meaningful names.
 * - How to classify a numeric value as integer-like or decimal using arithmetic tricks.
 */
public class Topic2_VariablesDataTypes {

    /**
     * Declare one int, one double, and one boolean variable, then print each with a label.
     *
     * TODO: Inside this method, declare and initialize:
     *       - An int variable (e.g., int age = 17;)
     *       - A double variable (e.g., double gpa = 3.85;)
     *       - A boolean variable (e.g., boolean isPassing = true;)
     *       Then print each one labeled, for example:
     *         Age: 17
     *         GPA: 3.85
     *         Is Passing: true
     *       Use System.out.println for each line.
     */
    public static void declareAndPrintVariables() {
        // TODO: declare one int, one double, one boolean; print each with a label
    }

    /**
     * Given a double value, return whether it is "integer-like" or "decimal".
     *
     * @param value the double value to classify
     * @return "integer-like" if value has no fractional part (e.g., 3.0, -2.0),
     *         "decimal" if value has a non-zero fractional part (e.g., 3.14, -1.5)
     *
     *       Example: classifyValue(3.0)  → "integer-like"
     *       Example: classifyValue(3.14) → "decimal"
     *       Example: classifyValue(-2.0) → "integer-like"
     */
    public static String classifyValue(double value) {
        // TODO: use casting or modulo to check for fractional part
        return "";
    }

    public static void main(String[] args) {
        declareAndPrintVariables();
        System.out.println(classifyValue(3.0));
        System.out.println(classifyValue(3.14));
        System.out.println(classifyValue(-2.0));
    }
}
