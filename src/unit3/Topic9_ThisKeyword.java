package unit3;

/*
 * AP CS A – Unit 3, Topic 3.9: The 'this' Keyword
 *
 * Students learn:
 *   - 'this' is an implicit reference to the CURRENT OBJECT inside any instance
 *     method or constructor.
 *   - Primary use 1 — Disambiguation: when a constructor/method parameter has
 *     the same name as an instance variable, 'this.fieldName' refers to the
 *     field and the bare name refers to the local parameter.
 *   - Primary use 2 — Passing self: 'this' can be passed as an argument to
 *     another method that expects an object of the same type.
 *   - Primary use 3 — Method chaining: a method can return 'this', allowing
 *     multiple method calls to be chained on one line.
 *   - Static (class) methods do NOT have 'this' — they are not tied to any object.
 *
 * This file also contains a separate Point class at the bottom.
 */
public class Topic9_ThisKeyword {

    // -------------------------------------------------------------------------
    // PROBLEM 1
    // Method: demonstrateThisDisambiguation()
    //
    // TODO: Show 'this' disambiguating instance variables from parameters.
    //
    //   Step 1 – Create two Point objects:
    //       Point p1 = new Point(3.0, 4.0);
    //       Point p2 = new Point(0.0, 0.0);
    //
    //   Step 2 – Call printWithThis() on p1 to see explicit 'this' usage:
    //       p1.printWithThis();
    //       // Expected: Point at (3.0, 4.0)
    //
    //   Step 3 – Compute and print the distance from p1 to p2:
    //       double dist = p1.distanceTo(p2);
    //       System.out.println("Distance from p1 to origin: " + dist);
    //       // Expected: 5.0  (Pythagorean theorem: sqrt(3^2 + 4^2) = sqrt(9+16) = sqrt(25) = 5)
    //
    //   Why this matters on the AP exam:
    //     'this' appears in AP FRQs whenever a constructor parameter shadows an
    //     instance variable. Students must write this.fieldName = paramName correctly.
    // -------------------------------------------------------------------------
    public static void demonstrateThisDisambiguation() {
        // TODO: create Point(3.0, 4.0) and Point(0.0, 0.0),
        //       call printWithThis() on the first, print the distance between them
    }

    // -------------------------------------------------------------------------
    // PROBLEM 2
    // Method: demonstrateMethodChaining()
    //
    // TODO: Show that returning 'this' enables fluent method chaining.
    //
    //   Step 1 – Create a Point and chain a translate call with a printWithThis call:
    //       Point p = new Point(1.0, 1.0);
    //       p.translate(2.0, 3.0).printWithThis();
    //       // translate returns 'this' (the same Point), so printWithThis() is called
    //       // on the already-modified Point.
    //       // Expected: Point at (3.0, 4.0)
    //
    //   Step 2 – Verify the Point really moved (not a new object):
    //       System.out.println("x=" + p.getX() + ", y=" + p.getY());
    //       // Expected: x=3.0, y=4.0
    //
    //   Why this matters on the AP exam:
    //     Method chaining is a common Java pattern. When translate returns 'this',
    //     the returned reference IS the same object — students must understand that
    //     no new Point was created.
    // -------------------------------------------------------------------------
    public static void demonstrateMethodChaining() {
        // TODO: create Point(1.0, 1.0), call translate(2.0, 3.0).printWithThis() in one chain,
        //       then verify p's coordinates are (3.0, 4.0)
    }

    public static void main(String[] args) {
        demonstrateThisDisambiguation();
        demonstrateMethodChaining();
    }
}

// =============================================================================
// SEPARATE CLASS: Point
// =============================================================================

/*
 * Point represents a 2D coordinate (x, y).
 * Demonstrates 'this' for disambiguation, explicit field access, and method chaining.
 * Students implement all methods below.
 */
class Point {

    private double x;
    private double y;

    // -------------------------------------------------------------------------
    // Constructor: Point(double x, double y)
    //
    // TODO: The parameters are named 'x' and 'y', the same as the instance variables.
    //   Use 'this' to assign correctly:
    //   this.x = x;
    //   this.y = y;
    //
    //   Without 'this.', writing x = x; assigns the parameter to itself — the
    //   instance variable is never updated!
    // -------------------------------------------------------------------------
    public Point(double x, double y) {
        // TODO: this.x = x; this.y = y;
    }

    // -------------------------------------------------------------------------
    // Accessor: getX()
    // TODO: return x
    // -------------------------------------------------------------------------
    public double getX() {
        // TODO: return x
        return 0;
    }

    // -------------------------------------------------------------------------
    // Accessor: getY()
    // TODO: return y
    // -------------------------------------------------------------------------
    public double getY() {
        // TODO: return y
        return 0;
    }

    // -------------------------------------------------------------------------
    // distanceTo(Point other)
    //
    // TODO: Return the Euclidean distance between this point and 'other'.
    //   Formula: sqrt((this.x - other.x)^2 + (this.y - other.y)^2)
    //
    //   Implementation:
    //   return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    //
    //   NOTE: Accessing other.x and other.y directly is allowed because 'other'
    //   is an instance of the SAME class (Point). A class can access the private
    //   fields of another object of the same type.
    // -------------------------------------------------------------------------
    public double distanceTo(Point other) {
        // TODO: return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
        return 0;
    }

    // -------------------------------------------------------------------------
    // printWithThis()
    //
    // TODO: Print the point's coordinates using explicit 'this' references.
    //   System.out.println("Point at (" + this.x + ", " + this.y + ")");
    //
    //   Using 'this.x' here is redundant (just 'x' would work too) but it
    //   makes the AP concept visible: 'this' refers to the calling object.
    // -------------------------------------------------------------------------
    public void printWithThis() {
        // TODO: System.out.println("Point at (" + this.x + ", " + this.y + ")");
    }

    // -------------------------------------------------------------------------
    // translate(double dx, double dy)
    //
    // TODO: Shift the point by (dx, dy) and return 'this' to enable chaining.
    //   this.x += dx;
    //   this.y += dy;
    //   return this;
    //
    //   Returning 'this' means the caller gets back a reference to the SAME
    //   object (now modified), not a brand-new Point. This enables chaining like:
    //       point.translate(1, 2).printWithThis();
    // -------------------------------------------------------------------------
    public Point translate(double dx, double dy) {
        // TODO: this.x += dx; this.y += dy; return this;
        return null;
    }
}
