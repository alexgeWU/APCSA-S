package unit4;

/*
 * Topic 4.12 – 2D Array Traversals
 *
 * Learning Goals:
 * - Row-major traversal: outer loop over rows, inner loop over columns.
 * - Column-major traversal: outer loop over columns, inner loop over rows.
 * - For-each nested traversal: for(int[] row : grid) for(int val : row)
 * - The traversal order chosen affects algorithm correctness.
 */
public class Topic12_2DArrayTraversals {

    /**
     * Returns the sum of all elements in a 2D array.
     *
     * TODO: Use nested for loops (row-major order):
     *   int sum = 0;
     *   for (int i = 0; i < grid.length; i++) {           // outer: rows
     *       for (int j = 0; j < grid[i].length; j++) {    // inner: columns
     *           sum += grid[i][j];
     *       }
     *   }
     *   return sum;
     *
     * Example:
     *   sumAllElements({{1, 2}, {3, 4}}) → 10
     *   sumAllElements({{5}})            → 5
     */
    public static int sumAllElements(int[][] grid) {
        // TODO: Initialize sum = 0, nested loops to add every element, return sum.
        return 0;
    }

    /**
     * Returns an array where each element is the sum of the corresponding row.
     *
     * TODO:
     *   1. int[] result = new int[grid.length];
     *   2. Outer loop over rows (i from 0 to grid.length-1):
     *        int rowSum = 0;
     *        Inner loop over columns (j from 0 to grid[i].length-1):
     *            rowSum += grid[i][j];
     *        result[i] = rowSum;
     *   3. return result;
     *
     * Example:
     *   rowSums({{1, 2, 3}, {4, 5, 6}}) → {6, 15}
     *   rowSums({{10, 0}, {3, 7}})       → {10, 10}
     */
    public static int[] rowSums(int[][] grid) {
        // TODO: Create result[], outer loop over rows, inner loop sums each row, return result.
        return null;
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 2}, {3, 4}};
        System.out.println(sumAllElements(grid));

        int[][] grid2 = {{1, 2, 3}, {4, 5, 6}};
        int[] sums = rowSums(grid2);
        for (int s : sums) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
