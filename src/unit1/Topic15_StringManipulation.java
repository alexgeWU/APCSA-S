package unit1;

/**
 * Topic 1.15 – String Manipulation
 *
 * AP Essential Knowledge:
 * - Strings are IMMUTABLE in Java — no String method changes the original String.
 * - Every String method that seems to "modify" the string actually returns a NEW String.
 * - Key String methods tested on the AP exam:
 *     s.length()          → number of characters
 *     s.substring(i)      → new String from index i to the end
 *     s.substring(i, j)   → new String from index i up to but NOT including index j
 *     s.indexOf(str)      → first index where str appears, or -1 if not found
 *     s.equals(other)     → true if same characters
 *     s.compareTo(other)  → negative, 0, or positive (lexicographic comparison)
 * - String indices start at 0.
 *
 * Students will learn:
 * - How to build a reversed String character by character using a loop.
 * - How to iterate over a String's characters and count those matching a condition.
 */
public class Topic15_StringManipulation {

    /**
     * Return the reverse of the given String.
     *
     * @param s the input String (assumed non-null)
     * @return a new String with the characters of s in reverse order
     *
     * TODO: Use a for loop counting DOWN from s.length()-1 to 0.
     *       On each iteration, append one character to a result String using concatenation.
     *       Since Strings are immutable, each += creates a NEW String — that is correct.
     *       Skeleton:
     *         String result = "";
     *         for (int i = s.length() - 1; i >= 0; i--) {
     *             result += s.substring(i, i + 1);   // OR: result += s.charAt(i);
     *         }
     *         return result;
     *       Example: reverseString("Java") → "avaJ"
     *       Example: reverseString("AP")   → "PA"
     *       Example: reverseString("a")    → "a"
     *       Example: reverseString("")     → ""
     */
    public static String reverseString(String s) {
        // TODO: use a for loop (counting down) and substring or charAt to build and return the reverse
        return "";
    }

    /**
     * Count and return the number of vowels in the given String (case-insensitive).
     *
     * @param s the input String (assumed non-null)
     * @return the count of characters in s that are vowels (a, e, i, o, u)
     *
     * TODO: Use a for loop from i = 0 to s.length() - 1.
     *       On each iteration, extract one character as a String:
     *       String ch = s.substring(i, i + 1);
     *       Convert to lowercase: ch = ch.toLowerCase();
     *       Check if ch equals "a", "e", "i", "o", or "u" using .equals() in an if-statement.
     *       If it is a vowel, increment a counter.
     *       Return the counter after the loop.
     *       Example: countVowels("Hello World") → 3  (e, o, o)
     *       Example: countVowels("AP CS A")     → 2  (A, A — case-insensitive)
     *       Example: countVowels("rhythm")      → 0
     */
    public static int countVowels(String s) {
        // TODO: loop through each character, check if it is a vowel (case-insensitive), count and return
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Java"));
        System.out.println(reverseString("AP"));
        System.out.println(countVowels("Hello World"));
        System.out.println(countVowels("AP CS A"));
    }
}
