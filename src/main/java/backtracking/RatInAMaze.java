package backtracking;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 08/05/21 3:22 pm
 * @copyright www.javamultiplex.com
 */
public class RatInAMaze {

    private static int TOTAL_PATHS = 0;

    //TC - O(3^(n^2-(4n-4))*2^(4n-4))
    public static int countPossiblePaths(int[][] grid) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(visited[i], false);
        }
        helper(0, 0, n, grid, visited);
        return TOTAL_PATHS;
    }

    private static void helper(int i, int j, int n, int[][] grid, boolean[][] visited) {
        if (i == n - 1 && j == n - 1) {
            TOTAL_PATHS++;
            return;
        }

        if (!isSafe(i, j, n, visited)) {
            return;
        }

        visited[i][j] = true;
        if ((i + 1) < n && grid[i + 1][j] == 0) {//DOWN
            helper(i + 1, j, n, grid, visited);
        }

        if ((i - 1) >= 0 && grid[i - 1][j] == 0) {//UP
            helper(i - 1, j, n, grid, visited);
        }

        if ((j + 1) < n && grid[i][j + 1] == 0) {//RIGHT
            helper(i, j + 1, n, grid, visited);
        }

        if ((j - 1) >= 0 && grid[i][j - 1] == 0) {//LEFT
            helper(i, j - 1, n, grid, visited);
        }
        visited[i][j] = false;
    }

    private static boolean isSafe(int i, int j, int n, boolean[][] visited) {
        return i >= 0 && j >= 0 && i < n && j < n && !visited[i][j];
    }

    public static void main(String[] args) {
        int[][] grid = {{0, 0, 1, 0, 0, 1, 0},
                {1, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 1},
                {1, 0, 1, 0, 0, 0, 0},
                {1, 0, 1, 1, 0, 1, 0},
                {1, 0, 0, 0, 0, 1, 0},
                {1, 1, 1, 1, 0, 0, 0}};
        System.out.println(countPossiblePaths(grid));
    }

}
