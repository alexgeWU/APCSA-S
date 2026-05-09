package unit3;

/*
 * AP CS A – Unit 3, Topic 3.4: Constructors
 *
 * Students learn:
 *   - A constructor initializes an object's state when it is created with 'new'.
 *   - The constructor name MUST match the class name exactly.
 *   - Constructors have NO return type (not void — literally nothing).
 *   - If no constructor is written, Java provides a default no-arg constructor
 *     that sets numeric fields to 0, booleans to false, and references to null.
 *   - Once you write ANY constructor, Java no longer provides the default one.
 *   - Overloaded constructors: multiple constructors with different parameter lists.
 *   - When a mutable object is passed as a parameter, the constructor receives
 *     a copy of the reference (both point to the same object in memory).
 *
 * This file also contains a separate Person class at the bottom.
 */
public class Topic4_Constructors {

    // -------------------------------------------------------------------------
    // PROBLEM 1
    // Method: demonstrateDefaultConstructor()
    //
    // TODO: Show what happens when you use the no-arg (default) constructor.
    //
    //   Step 1 – Create a Person with no arguments:
    //       Person p = new Person();
    //
    //   Step 2 – Print the default values to show what the no-arg constructor sets:
    //       System.out.println("Name: " + p.getName());   // Expected: Name: Unknown
    //       System.out.println("Age: " + p.getAge());     // Expected: Age: 0
    //
    //   Why this matters on the AP exam:
    //     The AP exam tests that students know a no-arg constructor can set
    //     "sensible defaults" rather than relying on Java's automatic zeroing.
    //     Students must recognize that writing their own no-arg constructor gives
    //     them control over those defaults.
    // -------------------------------------------------------------------------
    public static void demonstrateDefaultConstructor() {
        // TODO: create Person(), print getName() and getAge()
    }

    // -------------------------------------------------------------------------
    // PROBLEM 2
    // Method: demonstrateParameterizedConstructor()
    //
    // TODO: Show that the parameterized constructor sets each field from arguments.
    //
    //   Step 1 – Create two different Person objects:
    //       Person p1 = new Person("Alice", 17);
    //       Person p2 = new Person("Bob", 16);
    //
    //   Step 2 – Print toString() for each:
    //       System.out.println(p1);   // Expected: Person[name=Alice, age=17]
    //       System.out.println(p2);   // Expected: Person[name=Bob, age=16]
    //
    //   Why this matters on the AP exam:
    //     Students must be able to write and call parameterized constructors.
    //     The AP exam often shows constructor calls and asks what state the
    //     resulting object is in.
    // -------------------------------------------------------------------------
    public static void demonstrateParameterizedConstructor() {
        // TODO: create Person("Alice", 17) and Person("Bob", 16), print toString() for each
    }

    public static void main(String[] args) {
        demonstrateDefaultConstructor();
        demonstrateParameterizedConstructor();
    }
}

// =============================================================================
// SEPARATE CLASS: Person
// =============================================================================

/*
 * Person models a person with a name and age.
 * Students implement the constructors and methods below.
 */
class Person {

    private String name;
    private int age;

    // -------------------------------------------------------------------------
    // No-arg Constructor: Person()
    //
    // TODO: Set default values so the object is never in an "empty" state.
    //   name = "Unknown";
    //   age = 0;
    // -------------------------------------------------------------------------
    public Person() {
        // TODO: set name = "Unknown" and age = 0
    }

    // -------------------------------------------------------------------------
    // Parameterized Constructor: Person(String name, int age)
    //
    // TODO: Assign the parameters to the instance variables.
    //   Use 'this' to distinguish the parameter from the field when they share a name:
    //   this.name = name;
    //   this.age  = age;
    // -------------------------------------------------------------------------
    public Person(String name, int age) {
        // TODO: assign name and age using this.name and this.age
    }

    // -------------------------------------------------------------------------
    // Accessor: getName()
    // TODO: return name
    // -------------------------------------------------------------------------
    public String getName() {
        // TODO: return name
        return null;
    }

    // -------------------------------------------------------------------------
    // Accessor: getAge()
    // TODO: return age
    // -------------------------------------------------------------------------
    public int getAge() {
        // TODO: return age
        return 0;
    }

    // -------------------------------------------------------------------------
    // toString()
    // TODO: return "Person[name=" + name + ", age=" + age + "]"
    // -------------------------------------------------------------------------
    public String toString() {
        // TODO: return the formatted string
        return "";
    }
}
