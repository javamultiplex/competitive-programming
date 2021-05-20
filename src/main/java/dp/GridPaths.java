package dp;

/**
 * @author Rohit Agarwal on 17/05/21 11:18 pm
 * @copyright www.javamultiplex.com
 */
public class GridPaths {
    public static int gridPaths(char[][] grid, int n, int m) {
        int[][] dp = new int[n][m];
        dp[n - 1][m - 1] = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (i == n - 1 && j == m - 1) {
                    continue;
                }
                if (grid[i][j] == '#') {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = ((i == n - 1) ? 0 : dp[i + 1][j]) +
                            ((j == m - 1) ? 0 : dp[i][j + 1]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[0][0];
    }

    public static void main(String[] args) {
        int n = 4, m = 4;
        char[][] grid = {
                {'.', '.', '.', '.'},
                {'.', '#', '.', '.'},
                {'.', '.', '.', '#'},
                {'#', '.', '.', '.'}
        };
        System.out.println(gridPaths(grid, n, m));
    }

}
