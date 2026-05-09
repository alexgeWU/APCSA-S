package unit4;

import java.util.ArrayList;

/*
 * Topic 4.9 – ArrayList Traversals
 *
 * Learning Goals:
 * - Traverse an ArrayList with an index-based for loop (0 to size()-1).
 * - Traverse with a for-each loop (read-only; do NOT add/remove during for-each).
 * - When removing elements during traversal, use an index-based loop and
 *   decrement the index after removal so the next element is not skipped.
 * - For-each throws ConcurrentModificationException if the list is modified.
 */
public class Topic9_ArrayListTraversals {

    /**
     * Removes all negative numbers from the list and returns the modified list.
     *
     * TODO: Use an index-based for loop:
     *   for (int i = 0; i < list.size(); i++) {
     *       if (list.get(i) < 0) {
     *           list.remove(i);
     *           i--;    // ← CRITICAL: after removal, the next element shifts to index i,
     *                   //   so decrement i to re-examine that position on the next iteration.
     *       }
     *   }
     *   return list;
     *
     * Example:
     *   removeNegatives([3, -1, 4, -2, 5]) → [3, 4, 5]
     *
     * WARNING: Do NOT use a for-each loop here — modifying the list inside
     *          a for-each throws ConcurrentModificationException.
     */
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> list) {
        // TODO: Index-based for loop with i-- after each remove. Return list.
        return null;
    }

    /**
     * Prints each element with its index using an index-based for loop.
     *
     * TODO: for (int i = 0; i < list.size(); i++) {
     *           System.out.println("Index " + i + ": " + list.get(i));
     *       }
     *
     * Example with list = ["apple", "banana", "cherry"]:
     *   Index 0: apple
     *   Index 1: banana
     *   Index 2: cherry
     */
    public static void printWithIndex(ArrayList<String> list) {
        // TODO: Loop from 0 to list.size()-1, print "Index i: " + list.get(i).
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(-1);
        nums.add(4);
        nums.add(-2);
        nums.add(5);
        System.out.println(removeNegatives(nums));

        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        printWithIndex(fruits);
    }
}
