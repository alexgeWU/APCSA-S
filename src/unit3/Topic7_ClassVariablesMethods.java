package unit3;

/*
 * AP CS A – Unit 3, Topic 3.7: Class Variables and Methods
 *
 * Students learn:
 *   - Class (static) variables belong to the CLASS, not to any individual object.
 *     All instances share ONE copy of a static variable.
 *   - Declared with the 'static' keyword: private static int count;
 *   - Class (static) methods are called on the CLASS NAME, not an object reference:
 *     Student.getStudentCount()  (not  someStudent.getStudentCount())
 *   - Static methods CANNOT access instance variables or call instance methods
 *     because they are not associated with any particular object.
 *   - 'final' makes a variable a constant — its value cannot be changed after
 *     initialization. Combined with static: public static final = class constant.
 *
 * This file also contains a separate Student class at the bottom.
 */
public class Topic7_ClassVariablesMethods {

    // -------------------------------------------------------------------------
    // PROBLEM 1
    // Method: demonstrateClassVariable()
    //
    // TODO: Show that a static variable is shared across all instances.
    //
    //   Step 1 – Print the count BEFORE creating any students:
    //       System.out.println("Count before: " + Student.getStudentCount()); // 0
    //
    //   Step 2 – Create three Student objects:
    //       Student s1 = new Student("Alice");
    //       Student s2 = new Student("Bob");
    //       Student s3 = new Student("Carol");
    //
    //   Step 3 – Print the count AFTER (each constructor incremented the shared count):
    //       System.out.println("Count after:  " + Student.getStudentCount()); // 3
    //
    //   Why this matters on the AP exam:
    //     The AP exam tests whether students know that static variables persist
    //     across all object creations and are NOT reset per object.
    // -------------------------------------------------------------------------
    public static void demonstrateClassVariable() {
        // TODO: print count before, create 3 Students, print count after
    }

    // -------------------------------------------------------------------------
    // PROBLEM 2
    // Method: demonstrateClassConstant()
    //
    // TODO: Show how to access a class constant and call a static method.
    //
    //   Step 1 – Call the static method using the CLASS NAME:
    //       System.out.println("Via method: " + Student.getSchoolName()); // AP Academy
    //
    //   Step 2 – Access the public static final field directly:
    //       System.out.println("School: " + Student.SCHOOL_NAME); // AP Academy
    //
    //   NOTE: You should NOT call Student.getSchoolName() on an object reference
    //   (e.g., s1.getSchoolName()). The AP exam emphasizes using the class name
    //   for static members to make it clear the member belongs to the class.
    //
    //   Why this matters on the AP exam:
    //     Constants (final static) appear frequently in AP FRQs.
    //     Students must know to call static methods via the class name.
    // -------------------------------------------------------------------------
    public static void demonstrateClassConstant() {
        // TODO: print Student.getSchoolName() and Student.SCHOOL_NAME
    }

    public static void main(String[] args) {
        demonstrateClassVariable();
        demonstrateClassConstant();
    }
}

// =============================================================================
// SEPARATE CLASS: Student
// =============================================================================

/*
 * Student tracks how many Student objects have been created (class variable)
 * and the name of the school they all belong to (class constant).
 * Students implement the constructor and static methods below.
 */
class Student {

    // Class variable — shared by ALL Student instances
    private static int studentCount = 0;

    // Class constant — shared, immutable
    public static final String SCHOOL_NAME = "AP Academy";

    // Instance variable — unique per Student object
    private String name;

    // -------------------------------------------------------------------------
    // Constructor: Student(String name)
    // TODO: Set this.name = name, then increment studentCount.
    //   this.name = name;
    //   studentCount++;
    // -------------------------------------------------------------------------
    public Student(String name) {
        // TODO: set name, then increment the shared studentCount
    }

    // -------------------------------------------------------------------------
    // Static method: getStudentCount()
    // TODO: return studentCount
    // NOTE: this is a static method — it belongs to the class, not an instance.
    //       It cannot access 'name' (an instance variable) without an object reference.
    // -------------------------------------------------------------------------
    public static int getStudentCount() {
        // TODO: return studentCount
        return 0;
    }

    // -------------------------------------------------------------------------
    // Static method: getSchoolName()
    // TODO: return SCHOOL_NAME
    // -------------------------------------------------------------------------
    public static String getSchoolName() {
        // TODO: return SCHOOL_NAME
        return "";
    }
}
