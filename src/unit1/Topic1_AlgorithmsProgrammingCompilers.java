package unit1;

/**
 * Topic 1.1 – Introduction to Algorithms, Programming, and Compilers
 *
 * AP Essential Knowledge:
 * - An algorithm is a step-by-step process for solving a problem.
 * - Programs must follow precise syntax; the compiler catches syntax errors before the program runs.
 * - Logic errors produce incorrect results but do not crash the program.
 * - Runtime errors (exceptions) crash or interrupt the program during execution.
 *
 * Students will learn:
 * - How to distinguish between syntax, logic, and runtime errors.
 * - How to represent a sequenced algorithm as numbered steps.
 */
public class Topic1_AlgorithmsProgrammingCompilers {

    /**
     * Given a string describing an error, return the type of error it represents.
     *
     * @param description a description of the error
     * @return "syntax" if the description mentions missing punctuation/keywords caught by the compiler,
     *         "logic" if it describes wrong behavior that still runs,
     *         "runtime" if it describes a crash during execution
     *
     * TODO: Use if-else chains to check for keywords in the description string.
     *       - If description contains "missing" or "semicolon" or "bracket" → return "syntax"
     *       - If description contains "wrong" or "incorrect" or "unexpected output" → return "logic"
     *       - If description contains "crash" or "exception" or "null" → return "runtime"
     *       Example: identifyErrorType("missing semicolon") → "syntax"
     *       Example: identifyErrorType("wrong logic but runs") → "logic"
     *       Example: identifyErrorType("crashes during execution") → "runtime"
     */
    public static String identifyErrorType(String description) {
        // TODO: implement with if-else chains checking description keywords
        return "";
    }

    /**
     * Given a task name, print a numbered algorithm (sequence of steps) for completing it.
     *
     * TODO: Print at least 3 numbered steps that represent a clear, ordered algorithm.
     *       An algorithm must have a defined start, ordered middle steps, and a clear end.
     *       Use System.out.println for each step.
     *       Example for task = "make a sandwich":
     *         Step 1: Get two slices of bread.
     *         Step 2: Add desired fillings (e.g., peanut butter).
     *         Step 3: Press the slices together and serve.
     *       You may hard-code steps for a specific task or use generic numbered steps.
     *
     * @param task the name of the task to describe as an algorithm
     */
    public static void printAlgorithmSteps(String task) {
        // TODO: print at least 3 numbered steps for the given task
    }

    public static void main(String[] args) {
        System.out.println(identifyErrorType("missing semicolon"));
        System.out.println(identifyErrorType("wrong logic but runs"));
        System.out.println(identifyErrorType("crashes during execution"));
        printAlgorithmSteps("make a sandwich");
    }
}
