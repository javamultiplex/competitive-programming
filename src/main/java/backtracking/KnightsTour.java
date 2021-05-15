package backtracking;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 11/05/21 11:47 pm
 * @copyright www.javamultiplex.com
 */
public class KnightsTour {

    public static void knightsTour(int[][] grid, int n, int i, int j, boolean[][] visited, int count) {
        if (count == (n * n) - 1) {
            grid[i][j] = count;
            display(grid, n);
            System.out.println("\n");
            return;
        }

        int[] xDir = {-1, -1, -2, -2, 1, 1, 2, 2};
        int[] yDir = {2, -2, 1, -1, 2, -2, 1, -1};
        visited[i][j] = true;
        grid[i][j] = count;
        for (int k = 0; k < 8; k++) {
            if (isItSafe(i + xDir[k], j + yDir[k], n, visited)) {
                knightsTour(grid, n, i + xDir[k], j + yDir[k], visited, count + 1);
            }
        }
        grid[i][j] = -1;
        visited[i][j] = false;
    }

    private static boolean isItSafe(int i, int j, int n, boolean[][] visited) {
        return i >= 0 && i < n && j >= 0 && j < n && !visited[i][j];
    }

    private static void display(int[][] grid, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(grid[i], -1);
        }
        boolean[][] visited = new boolean[n][n];
        knightsTour(grid, n, 0, 0, visited, 0);
    }
}
