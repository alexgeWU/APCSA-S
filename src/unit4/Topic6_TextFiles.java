package unit4;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

/*
 * Topic 4.6 – Using Text Files
 *
 * Learning Goals:
 * - Use java.util.Scanner with a File object to read text files.
 * - Use java.io.PrintWriter to write text files.
 * - Handle checked IOExceptions with throws declarations or try-catch.
 * - Read line-by-line with hasNextLine() / nextLine().
 * - Always close Scanner and PrintWriter when done.
 */
public class Topic6_TextFiles {

    /**
     * Counts and returns the number of lines in the specified file.
     *
     * TODO:
     *   1. Create: Scanner sc = new Scanner(new File(filename));
     *   2. Declare: int count = 0;
     *   3. While loop: while (sc.hasNextLine()) { sc.nextLine(); count++; }
     *   4. sc.close();
     *   5. return count;
     *   If the file does not exist, the IOException propagates to the caller.
     *
     * Example:
     *   A file containing three lines → countLinesInFile("file.txt") → 3
     */
    public static int countLinesInFile(String filename) throws IOException {
        // TODO: Create Scanner on the file, loop with hasNextLine()/nextLine(),
        //       increment count, close scanner, return count.
        return 0;
    }

    /**
     * Writes the integers 1 through count (inclusive) to a file, one per line.
     * Then reads the file back and prints its contents to verify.
     *
     * TODO:
     *   1. Create: PrintWriter pw = new PrintWriter(filename);
     *   2. For loop: for (int i = 1; i <= count; i++) { pw.println(i); }
     *   3. pw.close();   ← IMPORTANT: must close to flush the buffer
     *   4. Open a Scanner on the same file and print each line to verify.
     *
     * Example:
     *   writeNumbersToFile("numbers.txt", 3) writes:
     *     1
     *     2
     *     3
     *   Then prints those same lines to the console.
     */
    public static void writeNumbersToFile(String filename, int count) throws IOException {
        // TODO: Create PrintWriter, loop from 1 to count using println(i), close writer.
        //       Then open a Scanner to read and print each line for verification.
    }

    public static void main(String[] args) throws IOException {
        String testFile = "unit4_test.txt";
        writeNumbersToFile(testFile, 5);
        System.out.println("Line count: " + countLinesInFile(testFile));
    }
}
