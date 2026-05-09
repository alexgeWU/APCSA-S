package unit3;

/*
 * AP CS A – Unit 3, Topic 3.6: Methods — Passing and Returning References of an Object
 *
 * Students learn:
 *   - When an object is passed to a method, the parameter holds a COPY OF THE
 *     REFERENCE — NOT a copy of the object itself. Both the caller's variable and
 *     the parameter point to the SAME object in memory.
 *   - Because of this, the method CAN change the object's state (via its public
 *     methods) and the caller WILL see those changes.
 *   - When a method's return type is a class, the method returns a reference
 *     (address) to an object — the caller receives that reference.
 *   - A method cannot directly access private fields of another class's objects —
 *     it must use public methods.
 *
 * This file also contains a separate Counter class at the bottom.
 */
public class Topic6_Methods_References {

    // -------------------------------------------------------------------------
    // PROBLEM 1
    // Method: incrementTwice(Counter c)
    //
    // TODO: Show that passing an object reference lets the method modify the object.
    //
    //   Inside incrementTwice:
    //       c.increment();
    //       c.increment();
    //
    //   In main:
    //       Counter myCounter = new Counter(0);
    //       System.out.println("Before: " + myCounter.getCount()); // 0
    //       incrementTwice(myCounter);
    //       System.out.println("After:  " + myCounter.getCount()); // 2
    //
    //   Why this matters on the AP exam:
    //     Reference semantics is a KEY exam topic. When an object is passed,
    //     changes made through the reference persist after the method returns.
    //     This is DIFFERENT from primitives (pass-by-value), which are unaffected.
    // -------------------------------------------------------------------------
    public static void incrementTwice(Counter c) {
        // TODO: call c.increment() twice
    }

    // -------------------------------------------------------------------------
    // PROBLEM 2
    // Method: createCounter(int start)
    //
    // TODO: Create a new Counter initialized to 'start' and return it.
    //
    //   Inside createCounter:
    //       Counter c = new Counter(start);
    //       return c;
    //   (Or equivalently: return new Counter(start);)
    //
    //   In main:
    //       Counter result = createCounter(42);
    //       System.out.println("Returned counter count: " + result.getCount()); // 42
    //
    //   Why this matters on the AP exam:
    //     Returning an object means returning a reference. The caller's variable
    //     then points to the object created inside the method. Students must
    //     understand that objects live on the heap and are accessed via references.
    // -------------------------------------------------------------------------
    public static Counter createCounter(int start) {
        // TODO: create a new Counter(start) and return it
        return null;
    }

    public static void main(String[] args) {
        // Problem 1 demo
        Counter myCounter = new Counter(0);
        System.out.println("Before incrementTwice: " + myCounter.getCount());
        incrementTwice(myCounter);
        System.out.println("After  incrementTwice: " + myCounter.getCount());

        // Problem 2 demo
        Counter result = createCounter(42);
        System.out.println("Returned counter count: " + result.getCount());
    }
}

// =============================================================================
// SEPARATE CLASS: Counter
// =============================================================================

/*
 * Counter holds a single integer count that can be incremented.
 * Students implement the constructor and methods below.
 */
class Counter {

    private int count;

    // -------------------------------------------------------------------------
    // Constructor: Counter(int initial)
    // TODO: set count = initial
    // -------------------------------------------------------------------------
    public Counter(int initial) {
        // TODO: this.count = initial;
    }

    // -------------------------------------------------------------------------
    // increment()
    // TODO: add 1 to count
    //   count++;
    // -------------------------------------------------------------------------
    public void increment() {
        // TODO: count++;
    }

    // -------------------------------------------------------------------------
    // Accessor: getCount()
    // TODO: return count
    // -------------------------------------------------------------------------
    public int getCount() {
        // TODO: return count
        return 0;
    }
}
