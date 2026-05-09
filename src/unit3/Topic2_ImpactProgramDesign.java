package unit3;

/*
 * AP CS A – Unit 3, Topic 3.2: Impact of Program Design
 *
 * Students learn:
 *   - Programs have impacts on society, economy, and culture — both beneficial
 *     and harmful (e.g., job creation vs. job displacement, privacy concerns).
 *   - System reliability: a program is reliable if it works correctly under its
 *     stated conditions; testing increases confidence in reliability.
 *   - Open source software: source code is publicly available; anyone may use,
 *     study, modify, and redistribute it (e.g., Linux, Python).
 *   - Proprietary software: owned by an individual or company; using it without
 *     permission may be illegal; intellectual property must be respected.
 *   - Legal and ethical issues arise when reusing code without proper attribution
 *     or license compliance.
 */
public class Topic2_ImpactProgramDesign {

    // -------------------------------------------------------------------------
    // PROBLEM 1
    // Method: analyzeProgramImpact(String programName, boolean isOpenSource)
    //
    // TODO: Return a String describing the program's licensing impact.
    //
    //   If isOpenSource == true, return:
    //     "[programName]: Open source — free to use and modify, contributes to community knowledge."
    //
    //   If isOpenSource == false, return:
    //     "[programName]: Proprietary — requires permission/purchase to use, intellectual property must be respected."
    //
    //   Examples:
    //     analyzeProgramImpact("Linux", true)
    //       → "Linux: Open source — free to use and modify, contributes to community knowledge."
    //
    //     analyzeProgramImpact("Microsoft Office", false)
    //       → "Microsoft Office: Proprietary — requires permission/purchase to use, intellectual property must be respected."
    //
    //   Why this matters on the AP exam:
    //     The AP exam tests whether students understand that reusing code has legal
    //     and ethical considerations tied to its license type.
    //
    //   Implementation hint:
    //     Use an if-else statement checking isOpenSource.
    // -------------------------------------------------------------------------
    public static String analyzeProgramImpact(String programName, boolean isOpenSource) {
        // TODO: use an if-else to return the correct formatted string
        return "";
    }

    // -------------------------------------------------------------------------
    // PROBLEM 2
    // Method: isReliable(int testsPassed, int totalTests)
    //
    // TODO: Return true if at least 90% of tests passed; false otherwise.
    //
    //   Formula: (double) testsPassed / totalTests >= 0.90
    //
    //   IMPORTANT: cast testsPassed to double BEFORE dividing to avoid integer
    //   division truncation. For example, 9 / 10 in Java is 0 (integer division),
    //   but (double) 9 / 10 is 0.9.
    //
    //   Examples:
    //     isReliable(9, 10)  → true   (0.90 >= 0.90)
    //     isReliable(10, 10) → true   (1.00 >= 0.90)
    //     isReliable(8, 10)  → false  (0.80 < 0.90)
    //     isReliable(89, 100)→ false  (0.89 < 0.90)
    //     isReliable(90, 100)→ true   (0.90 >= 0.90)
    //
    //   Why this matters on the AP exam:
    //     Software reliability is measured through testing. The AP exam may ask
    //     students to evaluate whether a system meets a reliability threshold.
    //
    //   Implementation hint:
    //     return (double) testsPassed / totalTests >= 0.90;
    // -------------------------------------------------------------------------
    public static boolean isReliable(int testsPassed, int totalTests) {
        // TODO: compute the pass rate (cast to double!) and compare to 0.90
        return false;
    }

    public static void main(String[] args) {
        System.out.println(analyzeProgramImpact("Linux", true));
        System.out.println(analyzeProgramImpact("Microsoft Office", false));
        System.out.println(isReliable(9, 10));
        System.out.println(isReliable(8, 10));
    }
}
