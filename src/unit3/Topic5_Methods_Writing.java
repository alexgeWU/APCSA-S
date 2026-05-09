package unit3;

/*
 * AP CS A – Unit 3, Topic 3.5: Methods — How to Write Them
 *
 * Students learn:
 *   - void methods perform an action and return nothing.
 *   - Non-void methods declare a return type and must use 'return'.
 *   - The 'return' statement immediately exits the method and sends a value back.
 *   - Accessor (getter): returns a copy of an instance variable; does NOT modify state.
 *   - Mutator (setter): changes an instance variable; often validates the new value.
 *   - Pass-by-value for primitives: when a primitive is passed to a method, the
 *     method receives a COPY. Changes inside the method do NOT affect the original.
 *
 * This file also contains a separate Rectangle class at the bottom.
 */
public class Topic5_Methods_Writing {

    // -------------------------------------------------------------------------
    // PROBLEM 1
    // Method: demonstrateAccessorMutator()
    //
    // TODO: Show accessor (getter) and mutator (setter) behavior using Rectangle.
    //
    //   Step 1 – Create Rectangle(4.0, 5.0):
    //       Rectangle r = new Rectangle(4.0, 5.0);
    //
    //   Step 2 – Print area and perimeter:
    //       System.out.println("Area: " + r.area());           // Expected: 20.0
    //       System.out.println("Perimeter: " + r.perimeter()); // Expected: 18.0
    //
    //   Step 3 – Try an invalid setWidth(-1.0). The mutator should REJECT it.
    //       r.setWidth(-1.0);
    //       System.out.println("Width after setWidth(-1): " + r.getWidth()); // Expected: 4.0
    //
    //   Step 4 – Use a valid setWidth(7.0) and print the new area:
    //       r.setWidth(7.0);
    //       System.out.println("New area after setWidth(7): " + r.area()); // Expected: 35.0
    //
    //   Why this matters on the AP exam:
    //     Accessors let outside code READ private fields safely.
    //     Mutators let outside code CHANGE private fields while enforcing rules
    //     (e.g., width must be positive). This is a core part of encapsulation.
    // -------------------------------------------------------------------------
    public static void demonstrateAccessorMutator() {
        // TODO: create Rectangle(4.0, 5.0), print area and perimeter,
        //       try setWidth(-1.0) and verify width stayed at 4.0,
        //       then setWidth(7.0) and print new area
    }

    // -------------------------------------------------------------------------
    // PROBLEM 2
    // Method: demonstratePassByValue(int x)
    //
    // TODO: Show that primitive arguments are passed BY VALUE (a copy is made).
    //
    //   Inside this method:
    //       x = x * 2;
    //       System.out.println("Inside method, x = " + x);  // prints doubled value
    //
    //   In main, call the method and then print the original:
    //       int original = 5;
    //       demonstratePassByValue(original);
    //       System.out.println("After method call, original = " + original); // still 5
    //
    //   Why this matters on the AP exam:
    //     Primitive pass-by-value is a classic AP exam topic. The exam may show
    //     a method that modifies its int parameter and ask whether the caller's
    //     variable changed. The answer is NO — the method only modified its copy.
    // -------------------------------------------------------------------------
    public static void demonstratePassByValue(int x) {
        // TODO: double x inside this method and print it
        //       (the caller's variable will NOT change)
    }

    public static void main(String[] args) {
        demonstrateAccessorMutator();

        int original = 5;
        demonstratePassByValue(original);
        System.out.println("After method call, original = " + original); // still 5
    }
}

// =============================================================================
// SEPARATE CLASS: Rectangle
// =============================================================================

/*
 * Rectangle models a geometric rectangle with width and height.
 * Students implement all methods below.
 */
class Rectangle {

    private double width;
    private double height;

    // -------------------------------------------------------------------------
    // Constructor: Rectangle(double w, double h)
    // TODO: set width = w and height = h
    // -------------------------------------------------------------------------
    public Rectangle(double w, double h) {
        // TODO: this.width = w; this.height = h;
    }

    // -------------------------------------------------------------------------
    // Accessor: getWidth()
    // TODO: return width
    // -------------------------------------------------------------------------
    public double getWidth() {
        // TODO: return width
        return 0;
    }

    // -------------------------------------------------------------------------
    // Accessor: getHeight()
    // TODO: return height
    // -------------------------------------------------------------------------
    public double getHeight() {
        // TODO: return height
        return 0;
    }

    // -------------------------------------------------------------------------
    // Mutator: setWidth(double w)
    // TODO: only update width if w > 0 (reject invalid values silently)
    //   if (w > 0) { this.width = w; }
    // -------------------------------------------------------------------------
    public void setWidth(double w) {
        // TODO: if (w > 0) { width = w; }
    }

    // -------------------------------------------------------------------------
    // Mutator: setHeight(double h)
    // TODO: only update height if h > 0
    //   if (h > 0) { this.height = h; }
    // -------------------------------------------------------------------------
    public void setHeight(double h) {
        // TODO: if (h > 0) { height = h; }
    }

    // -------------------------------------------------------------------------
    // area()
    // TODO: return width * height
    // -------------------------------------------------------------------------
    public double area() {
        // TODO: return width * height
        return 0;
    }

    // -------------------------------------------------------------------------
    // perimeter()
    // TODO: return 2 * (width + height)
    // -------------------------------------------------------------------------
    public double perimeter() {
        // TODO: return 2 * (width + height)
        return 0;
    }

    // -------------------------------------------------------------------------
    // toString()
    // TODO: return "Rectangle[width=" + width + ", height=" + height + "]"
    // -------------------------------------------------------------------------
    public String toString() {
        // TODO: return the formatted string
        return "";
    }
}
