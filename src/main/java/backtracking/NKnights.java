package backtracking;

/**
 * @author Rohit Agarwal on 14/05/21 2:12 pm
 * @copyright www.javamultiplex.com
 */
//Number of ways to place N non-attacking knights on NXN board (OEIS : A201540).
public class NKnights {

    private static int COUNT = 0;

    public static void nKnights(boolean[][] grid, int currentRow, int currentColumn, int count, int n) {
        if (count == n) {
            COUNT++;
            display(grid, n);
            return;
        }

        for (int i = currentRow; i < n; i++) {
            for (int j = (i == currentRow) ? currentColumn : 0; j < n; j++) {
                if (isItSafe(i, j, grid, n)) {
                    grid[i][j] = true;
                    nKnights(grid, i, j + 1, count + 1, n);
                    grid[i][j] = false;
                }
            }
        }

    }

    private static boolean isItSafe(int row, int col, boolean[][] grid, int n) {
        if (row - 1 >= 0 && col - 2 >= 0 && grid[row - 1][col - 2]) {
            return false;
        }

        if (row - 2 >= 0 && col - 1 >= 0 && grid[row - 2][col - 1]) {
            return false;
        }

        if (row - 1 >= 0 && col + 2 < n && grid[row - 1][col + 2]) {
            return false;
        }

        if (row - 2 >= 0 && col + 1 < n && grid[row - 2][col + 1]) {
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
        nKnights(grid, 0, 0, 0, n);
        System.out.println(COUNT);
    }
}
