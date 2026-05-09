package unit3;

/*
 * AP CS A – Unit 3, Topic 3.1: Abstraction and Program Design
 *
 * Students learn:
 *   - Abstraction hides complexity so programmers can think at a higher level.
 *   - Data abstraction: giving a named container (variable) to data without
 *     exposing how it is stored internally.
 *   - Procedural abstraction: giving a named process (method) so callers do not
 *     need to know HOW it works, only WHAT it does.
 *   - Method decomposition: breaking a big task into smaller helper methods,
 *     each responsible for one piece of the work.
 *   - Instance variables hold per-object data; class variables are shared.
 */
public class Topic1_AbstractionProgramDesign {

    // -------------------------------------------------------------------------
    // PROBLEM 1
    // Method: demonstrateAbstraction()
    //
    // TODO: This method demonstrates PROCEDURAL ABSTRACTION and METHOD DECOMPOSITION.
    //
    //   Step 1 – Write three private helper methods below this one:
    //       private static void step1() { System.out.println("Spread peanut butter"); }
    //       private static void step2() { System.out.println("Add jelly"); }
    //       private static void step3() { System.out.println("Close bread"); }
    //
    //   Step 2 – Inside demonstrateAbstraction(), call all three helpers in order:
    //       step1();
    //       step2();
    //       step3();
    //
    //   Why this matters on the AP exam:
    //     Each helper is an abstraction — the caller (demonstrateAbstraction) does
    //     not need to know the details of each step, only that calling it produces
    //     the correct output. This is procedural abstraction.
    //     Breaking "make a sandwich" into step1/step2/step3 is method decomposition.
    // -------------------------------------------------------------------------
    public static void demonstrateAbstraction() {
        // TODO: call step1(), step2(), step3() here
    }

    // TODO: implement step1() — print "Spread peanut butter"
    private static void step1() {
        // TODO: System.out.println("Spread peanut butter");
    }

    // TODO: implement step2() — print "Add jelly"
    private static void step2() {
        // TODO: System.out.println("Add jelly");
    }

    // TODO: implement step3() — print "Close bread"
    private static void step3() {
        // TODO: System.out.println("Close bread");
    }

    // -------------------------------------------------------------------------
    // PROBLEM 2
    // Method: describeDataAbstraction(String variableName, String dataType, String purpose)
    //
    // TODO: Return a formatted String that describes a variable as a data abstraction.
    //
    //   Format: "Variable '[variableName]' of type [dataType] abstracts: [purpose]"
    //
    //   Examples:
    //     describeDataAbstraction("age", "int", "a person's age in years")
    //       → "Variable 'age' of type int abstracts: a person's age in years"
    //
    //     describeDataAbstraction("temperature", "double", "current outdoor temperature")
    //       → "Variable 'temperature' of type double abstracts: current outdoor temperature"
    //
    //   Why this matters on the AP exam:
    //     A named variable hides the low-level memory representation.
    //     The programmer works with "age" rather than a raw memory address — that is
    //     data abstraction.
    //
    //   Implementation hint:
    //     return "Variable '" + variableName + "' of type " + dataType + " abstracts: " + purpose;
    // -------------------------------------------------------------------------
    public static String describeDataAbstraction(String variableName, String dataType, String purpose) {
        // TODO: build and return the formatted string described above
        return "";
    }

    public static void main(String[] args) {
        demonstrateAbstraction();
        System.out.println(describeDataAbstraction("age", "int", "a person's age in years"));
    }
}
