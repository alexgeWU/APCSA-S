package unit2;

/*
 * AP Topic 2.12 – Informal Run-Time Analysis
 *
 * Students learn to reason about HOW MANY TIMES a statement executes
 * by tracing through loop bounds:
 *
 *   - A single loop from 0 to n (condition i < n) executes the body n times.
 *   - A nested loop (outer 0..n, inner 0..n) executes the inner body n × n = n² times.
 *   - This is the basis for informal Big-O notation:
 *       O(1)   – constant: no loops
 *       O(n)   – linear: one loop proportional to n
 *       O(n²)  – quadratic: nested loops both proportional to n
 *
 * On the AP exam, students are asked to count executions by tracing code
 * or to identify which loop structure will run more or fewer times.
 */
public class Topic12_RuntimeAnalysis {

    /**
     * TODO: Write a for loop from i = 0 while i < n, incrementing i by 1 each time.
     *       Inside the loop body, increment a counter variable by 1.
     *       Return the counter after the loop.
     *
     *   The return value will always equal n, demonstrating concretely that
     *   a single loop from 0 to n runs exactly n times (O(n) linear complexity).
     *
     * Parameters:
     *   n – the loop bound (number of intended iterations)
     *
     * Returns: int – the total number of times the inner statement executed (always n)
     *
     * Example:
     *   countExecutions(5)   →  5
     *   countExecutions(100) →  100
     *   countExecutions(0)   →  0   (condition false immediately, body never runs)
     */
    public static int countExecutions(int n) {
        // TODO: implement — single for loop with a counter; return the counter
        return 0;
    }

    /**
     * TODO: Write nested for loops (outer 0..n, inner 0..n) and count total
     *       executions of the innermost statement.
     *
     *   Algorithm:
     *     Initialize count = 0
     *     Outer loop: i from 0 while i < n  (runs n times)
     *       Inner loop: j from 0 while j < n  (runs n times for EACH outer iteration)
     *         count++
     *     return count
     *
     *   The return value will always equal n * n.
     *
     *   // WHY THIS IS O(n²):
     *   // For every one step the outer loop takes, the inner loop takes n steps.
     *   // The outer loop itself takes n steps, so total inner steps = n * n = n².
     *   // Doubling n quadruples the work — this grows much faster than O(n).
     *
     * Parameters:
     *   n – the loop bound for both the outer and inner loop
     *
     * Returns: int – total inner-loop executions (always n * n)
     *
     * Example:
     *   countNestedExecutions(4)   →  16   (4 * 4)
     *   countNestedExecutions(10)  →  100
     *   countNestedExecutions(0)   →  0
     */
    public static int countNestedExecutions(int n) {
        // TODO: implement — nested for loops with a counter; return the counter
        // WHY THIS IS O(n²): for each of the n outer iterations, the inner loop
        // runs n times, giving n * n total inner executions. Doubling n quadruples work.
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(countExecutions(5));        // expected: 5
        System.out.println(countExecutions(0));        // expected: 0
        System.out.println(countNestedExecutions(4));  // expected: 16
        System.out.println(countNestedExecutions(10)); // expected: 100
    }
}
