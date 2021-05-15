package recursion;

/**
 * @author Rohit Agarwal on 08/04/21 7:31 pm
 * @copyright www.javamultiplex.com
 */

/**
 * You are given a 2D matrix of size NXM.
 * You will start from top let corner and go to bottom right corner.
 * At each point you can move either right, down or diagonally.
 * Print and count all possible paths.
 */
public class MazePath {

    public static void mazePath(int n, int m, int i, int j, String osf) {
        if (i == n - 1 && j == m - 1) {
            System.out.println(osf);
            return;
        }
        if (i >= n || j >= m) {
            return;
        }
        mazePath(n, m, i, j + 1, osf + "R->");
        mazePath(n, m, i + 1, j, osf + "D->");
        mazePath(n, m, i + 1, j + 1, osf + "DL->");
    }

    public static void main(String[] args) {
        mazePath(3, 3, 0, 0, "");
    }
}
