package unit4;

/*
 * Topic 4.13 – Implementing 2D Array Algorithms
 *
 * Learning Goals:
 * - Apply standard algorithms to 2D arrays: find global min/max, count elements
 *   meeting a condition, transpose rows and columns.
 * - Transpose: result[j][i] = original[i][j] — swap row and column indices.
 * - For an m×n grid, the transpose is n×m.
 */
public class Topic13_2DArrayAlgorithms {

    /**
     * Returns the minimum value found anywhere in a 2D array.
     *
     * TODO:
     *   1. Initialize: int min = grid[0][0];
     *   2. Nested for loops over all rows and columns.
     *      If grid[i][j] < min, update min = grid[i][j];
     *   3. return min;
     *
     * Example:
     *   findMin({{5, 3}, {8, 1}}) → 1
     *   findMin({{7, 7}, {7, 7}}) → 7
     */
    public static int findMin(int[][] grid) {
        // TODO: Init min = grid[0][0], nested loops to compare all elements, return min.
        return 0;
    }

    /**
     * Returns the transpose of a 2D array.
     * The transpose swaps rows and columns: result[j][i] = grid[i][j].
     * If grid is m×n, the result is n×m.
     *
     * TODO:
     *   1. int rows = grid.length;
     *      int cols = grid[0].length;
     *   2. int[][] result = new int[cols][rows];   // NOTE: dimensions are swapped
     *   3. Nested loops:
     *        for (int i = 0; i < rows; i++)
     *            for (int j = 0; j < cols; j++)
     *                result[j][i] = grid[i][j];
     *   4. return result;
     *
     * Example:
     *   transpose({{1, 2, 3}, {4, 5, 6}}) →
     *     {{1, 4},
     *      {2, 5},
     *      {3, 6}}
     */
    public static int[][] transpose(int[][] grid) {
        // TODO: Create result with swapped dimensions, set result[j][i] = grid[i][j], return.
        return null;
    }

    public static void main(String[] args) {
        int[][] grid = {{5, 3}, {8, 1}};
        System.out.println(findMin(grid));

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] t = transpose(matrix);
        for (int[] row : t) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
