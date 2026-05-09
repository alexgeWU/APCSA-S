package unit3;

/*
 * AP CS A – Unit 3, Topic 3.8: Scope and Access
 *
 * Students learn:
 *   - Local variables are declared inside a block ({ }) and exist ONLY within
 *     that block. They are destroyed when execution leaves the block.
 *   - Method parameters are local variables scoped to the method body.
 *   - When a local variable has the SAME NAME as an instance variable, the local
 *     variable SHADOWS (hides) the instance variable inside that block.
 *   - 'this.variableName' always refers to the instance variable, bypassing shadowing.
 *   - Local variables cannot be declared public or private — access modifiers
 *     are only for class members (fields, methods, nested classes).
 *
 * This file also contains a separate Box class at the bottom.
 */
public class Topic8_ScopeAccess {

    // -------------------------------------------------------------------------
    // PROBLEM 1
    // Method: demonstrateShadowing()
    //
    // TODO: Show how the Box class uses local variables and 'this' to handle
    //       same-name parameters correctly.
    //
    //   Step 1 – Create Box(10):
    //       Box b = new Box(10);
    //       System.out.println("Initial size: " + b.getSize()); // 10
    //
    //   Step 2 – Call grow(5) and print the new size:
    //       b.grow(5);
    //       System.out.println("After grow(5): " + b.getSize()); // 15
    //
    //   Step 3 – Add a comment explaining local variable scope:
    //       // Inside grow(), 'newSize' is a LOCAL variable.
    //       // It exists only during that method call and disappears when grow() returns.
    //       // The result is stored back into 'this.size' before the method exits.
    //
    //   Why this matters on the AP exam:
    //     The AP exam may show a constructor like Box(int size) and ask what
    //     this.size = size; does. Students must understand the shadowing issue.
    // -------------------------------------------------------------------------
    public static void demonstrateShadowing() {
        // TODO: create Box(10), print size, call grow(5), print size again
        //       add comment explaining local variable 'newSize' inside grow()
    }

    // -------------------------------------------------------------------------
    // PROBLEM 2
    // Method: demonstrateLocalScope()
    //
    // TODO: Show that a variable declared inside a block is INACCESSIBLE outside it.
    //
    //   Step 1 – Write an if-block:
    //       if (true) {
    //           int localVar = 42;
    //           System.out.println("Inside block: localVar = " + localVar); // 42
    //       }
    //
    //   Step 2 – After the block, comment out the invalid access and explain:
    //       // System.out.println(localVar); // ← COMPILE ERROR — localVar is out of scope
    //       // 'localVar' only exists inside the if-block above.
    //       // Trying to use it here would cause: "cannot find symbol: variable localVar"
    //
    //   Why this matters on the AP exam:
    //     The AP exam often includes code with variables declared inside loops or
    //     conditionals and asks whether a reference outside that block is valid.
    //     Knowing that local scope ends at the closing brace is essential.
    // -------------------------------------------------------------------------
    public static void demonstrateLocalScope() {
        // TODO: declare localVar inside an if-block, print it, then comment out
        //       the out-of-scope reference with an explanation
    }

    public static void main(String[] args) {
        demonstrateShadowing();
        demonstrateLocalScope();
    }
}

// =============================================================================
// SEPARATE CLASS: Box
// =============================================================================

/*
 * Box models a box with a size that can grow.
 * The constructor and grow() method demonstrate shadowing and local variables.
 * Students implement all methods below.
 */
class Box {

    private int size;

    // -------------------------------------------------------------------------
    // Constructor: Box(int size)
    //
    // NOTE: The parameter is ALSO named 'size', which shadows the instance variable.
    // TODO: Use 'this.size = size' to correctly assign to the instance variable.
    //   Without 'this.', the right-hand 'size' and left-hand 'size' both refer to
    //   the local parameter — the instance variable would never be set!
    // -------------------------------------------------------------------------
    public Box(int size) {
        // TODO: this.size = size;
    }

    // -------------------------------------------------------------------------
    // Accessor: getSize()
    // TODO: return size
    // -------------------------------------------------------------------------
    public int getSize() {
        // TODO: return size
        return 0;
    }

    // -------------------------------------------------------------------------
    // grow(int amount)
    //
    // TODO: Use a local variable to compute the new size, then store it back.
    //   int newSize = this.size + amount;   // newSize is LOCAL — exists only here
    //   this.size = newSize;
    //
    // This demonstrates: local variables declared inside a method body.
    // 'newSize' cannot be accessed from outside grow().
    // -------------------------------------------------------------------------
    public void grow(int amount) {
        // TODO: declare int newSize = this.size + amount; then set this.size = newSize;
    }

    // -------------------------------------------------------------------------
    // toString()
    // TODO: return "Box[size=" + size + "]"
    // -------------------------------------------------------------------------
    public String toString() {
        // TODO: return the formatted string
        return "";
    }
}
