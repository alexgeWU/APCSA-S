package unit4;

import java.util.ArrayList;

/*
 * Topic 4.8 – ArrayList Methods
 *
 * Learning Goals:
 * - ArrayList<E> from java.util resizes automatically.
 * - Key methods: size(), add(e), add(index, e), get(index), set(index, e),
 *                remove(index), remove(Object).
 * - Indices run 0 to size()-1; inserting or removing shifts subsequent elements.
 */
public class Topic8_ArrayListMethods {

    /**
     * Builds and returns an ArrayList<String> from a String array,
     * then removes the first element and inserts "START" at index 0.
     *
     * TODO:
     *   1. ArrayList<String> list = new ArrayList<String>();
     *   2. Loop through words[] and call list.add(words[i]) for each word.
     *   3. list.remove(0);          // removes the element at index 0
     *   4. list.add(0, "START");    // inserts "START" at index 0, shifting the rest right
     *   5. return list;
     *
     * Example:
     *   buildList({"b", "c", "d"})
     *     After adding all:    ["b", "c", "d"]
     *     After remove(0):     ["c", "d"]
     *     After add(0,"START"):["START", "c", "d"]
     *   → returns ["START", "c", "d"]
     */
    public static ArrayList<String> buildList(String[] words) {
        // TODO: Create ArrayList, add all words, remove index 0, insert "START" at 0, return list.
        return null;
    }

    /**
     * Demonstrates set() and get() on an ArrayList<Integer>.
     *
     * TODO:
     *   1. Print the current list.
     *   2. list.set(0, 99);                          // replace element at index 0 with 99
     *   3. int last = list.get(list.size() - 1);     // retrieve the last element
     *   4. Print the modified list.
     *   5. Print: "Last element: " + last
     *
     * Example with list = [10, 20, 30]:
     *   Before: [10, 20, 30]
     *   After set(0, 99): [99, 20, 30]
     *   Last element: 30
     */
    public static void demonstrateSetAndGet(ArrayList<Integer> list) {
        // TODO: Print list, call set(0, 99), retrieve last element with get(size()-1),
        //       print modified list and last element.
    }

    public static void main(String[] args) {
        String[] words = {"b", "c", "d"};
        System.out.println(buildList(words));

        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        demonstrateSetAndGet(nums);
    }
}
