package unit4;

import java.util.ArrayList;

/*
 * Topic 4.10 – Implementing ArrayList Algorithms
 *
 * Learning Goals:
 * - Apply standard algorithms (min, max, sum, contains, reverse) to ArrayLists.
 * - Use ArrayList methods: get(), size(), contains(), add(), remove().
 * - Be careful when removing elements — size() changes after each removal.
 * - Insert at any position with add(index, element).
 */
public class Topic10_ArrayListAlgorithms {

    /**
     * Returns the maximum value in a non-empty ArrayList<Integer>.
     *
     * TODO:
     *   1. Initialize: Integer max = list.get(0);
     *   2. Use a for-each loop: for (Integer val : list)
     *   3. Inside the loop: if (val > max) { max = val; }
     *   4. Return max.
     *
     * Example:
     *   findMax([3, 1, 4, 1, 5, 9]) → 9
     *   findMax([7])                → 7
     */
    public static Integer findMax(ArrayList<Integer> list) {
        // TODO: Initialize max to list.get(0), use for-each to update max, return max.
        return null;
    }

    /**
     * Returns a new ArrayList containing the elements of list with duplicates removed.
     * The first occurrence of each value is kept; subsequent duplicates are skipped.
     *
     * TODO:
     *   1. ArrayList<Integer> result = new ArrayList<Integer>();
     *   2. For-each loop: for (Integer e : list)
     *   3. Inside loop: if (!result.contains(e)) { result.add(e); }
     *      result.contains(e) returns true if e is already in result — skip it.
     *   4. Return result.
     *
     * Example:
     *   removeDuplicates([1, 2, 2, 3, 1]) → [1, 2, 3]
     *   removeDuplicates([5, 5, 5])       → [5]
     */
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        // TODO: Build result list by adding elements only when result.contains(e) is false.
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(1);
        nums.add(4);
        nums.add(1);
        nums.add(5);
        nums.add(9);
        System.out.println(findMax(nums));
        System.out.println(removeDuplicates(nums));
    }
}
