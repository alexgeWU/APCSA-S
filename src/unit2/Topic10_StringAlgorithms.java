package unit2;

/*
 * AP Topic 2.10 – Implementing String Algorithms
 *
 * Students learn standard String algorithms using core String methods:
 *   s.length()           – number of characters
 *   s.charAt(i)          – character at index i (0-based)
 *   s.substring(i, j)    – characters from index i up to (not including) j
 *   s.substring(i)       – characters from index i to end
 *   s.indexOf(str)       – first index of str in s, or -1 if not found
 *   s.indexOf(str, from) – search starting at index from
 *   s.equals(other)      – content comparison
 *
 * Common patterns: reverse a string, count character occurrences,
 * find all substrings matching a condition, extract words.
 */
public class Topic10_StringAlgorithms {

    /**
     * TODO: Return the words of sentence in reversed order, separated by single spaces.
     *
     *   Recommended approach (simpler):
     *     1. Split the sentence into an array of words: String[] words = sentence.split(" ");
     *     2. Build the result by iterating from the LAST index down to 0.
     *     3. Append each word; append " " between words (but NOT after the last word).
     *     4. Return the resulting string.
     *
     *   Alternative approach (without split, using indexOf):
     *     Find each space with indexOf(" ", fromIndex), extract substrings, collect in
     *     an array or build the result directly in reverse.
     *
     * Parameters:
     *   sentence – a non-null String with words separated by single spaces
     *
     * Returns: String – words in reversed order
     *
     * Example:
     *   reverseWords("hello world")          →  "world hello"
     *   reverseWords("one two three")        →  "three two one"
     *   reverseWords("AP")                   →  "AP"   (single word)
     */
    public static String reverseWords(String sentence) {
        // TODO: implement — split into words, rebuild in reverse order
        return "";
    }

    /**
     * TODO: Count how many times target appears in text (non-overlapping occurrences).
     *
     *   Algorithm using indexOf:
     *     Initialize count = 0, fromIndex = 0
     *     while true:
     *       pos = text.indexOf(target, fromIndex)
     *       if pos == -1: break                  // no more occurrences
     *       count++
     *       fromIndex = pos + target.length()    // advance past this match
     *     return count
     *
     *   Note: advancing by target.length() ensures non-overlapping matches.
     *
     * Parameters:
     *   text   – the String to search within
     *   target – the substring to search for
     *
     * Returns: int – the number of non-overlapping occurrences of target in text
     *
     * Example:
     *   countOccurrences("banana", "an")  →  2   ("b[an][an]a")
     *   countOccurrences("aaaa", "aa")    →  2   (non-overlapping: [aa][aa])
     *   countOccurrences("hello", "z")    →  0
     *   countOccurrences("abcabc", "abc") →  2
     */
    public static int countOccurrences(String text, String target) {
        // TODO: implement using indexOf with a fromIndex in a while loop
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("hello world"));      // expected: world hello
        System.out.println(reverseWords("one two three"));    // expected: three two one
        System.out.println(countOccurrences("banana", "an")); // expected: 2
        System.out.println(countOccurrences("aaaa", "aa"));   // expected: 2
    }
}
