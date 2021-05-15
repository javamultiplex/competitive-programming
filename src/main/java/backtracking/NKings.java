package backtracking;

/**
 * @author Rohit Agarwal on 14/05/21 2:33 pm
 * @copyright www.javamultiplex.com
 */
//Number of ways to place N non-attacking kings in NXN board (OEIS : A201513)
public class NKings {

    private static int COUNT = 0;

    public static void nKings(boolean[][] grid, int currentRow, int currentColumn, int count, int n) {
        if (count == n) {
            COUNT++;
            display(grid, n);
            return;
        }

        for (int i = currentRow; i < n; i++) {
            for (int j = (i == currentRow) ? currentColumn : 0; j < n; j++) {
                if (isItSafe(i, j, grid, n)) {
                    grid[i][j] = true;
                    nKings(grid, i, j + 2, count + 1, n);
                    grid[i][j] = false;
                }
            }
        }

    }

    private static boolean isItSafe(int row, int col, boolean[][] grid, int n) {
        if (row - 1 >= 0 && grid[row - 1][col]) {
            return false;
        }

        if (row - 1 >= 0 && col - 1 >= 0 && grid[row - 1][col - 1]) {
            return false;
        }

        if (row - 1 >= 0 && col + 1 < n && grid[row - 1][col + 1]) {
            return false;
        }

        return true;
    }

    private static void display(boolean[][] grid, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j]) {
                    System.out.print("K ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 3;
        boolean[][] grid = new boolean[n][n];
        nKings(grid, 0, 0, 0, n);
        System.out.println(COUNT);
    }
}
