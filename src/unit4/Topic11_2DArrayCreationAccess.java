package unit4;

/*
 * Topic 4.11 – 2D Array Creation and Access
 *
 * Learning Goals:
 * - Declare and create 2D arrays: int[][] grid = new int[rows][cols];
 * - Access elements with grid[row][col].
 * - grid.length gives the number of rows; grid[0].length gives the number of columns.
 * - Elements are stored in row-major order.
 * - Default values are the same as 1D arrays (0 for int, etc.).
 */
public class Topic11_2DArrayCreationAccess {

    /**
     * Creates and returns an n×n identity matrix.
     * An identity matrix has 1s on the main diagonal and 0s everywhere else.
     *
     * TODO:
     *   1. int[][] grid = new int[n][n];
     *   2. Outer loop: for (int i = 0; i < n; i++)
     *      Inner loop: for (int j = 0; j < n; j++)
     *        if (i == j) grid[i][j] = 1;
     *        else        grid[i][j] = 0;   // (actually 0 by default, but explicit is clearer)
     *   3. return grid;
     *
     * Example:
     *   createIdentityMatrix(3) →
     *     {{1, 0, 0},
     *      {0, 1, 0},
     *      {0, 0, 1}}
     */
    public static int[][] createIdentityMatrix(int n) {
        // TODO: Create n×n array, set diagonal to 1 (where i == j), return grid.
        return null;
    }

    /**
     * Prints a 2D array with elements separated by spaces and a newline after each row.
     *
     * TODO:
     *   Outer loop: for (int i = 0; i < grid.length; i++)          // rows
     *     Inner loop: for (int j = 0; j < grid[i].length; j++)     // columns
     *       System.out.print(grid[i][j] + " ");
     *     System.out.println();   // newline after each complete row
     *
     * Example:
     *   print2DArray({{1, 2}, {3, 4}}) prints:
     *     1 2
     *     3 4
     */
    public static void print2DArray(int[][] grid) {
        // TODO: Nested for loops — print each element with a space, newline after each row.
    }

    public static void main(String[] args) {
        int[][] identity = createIdentityMatrix(3);
        print2DArray(identity);
    }
}
