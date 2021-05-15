package recursion;

/**
 * @author Rohit Agarwal on 08/04/21 8:00 pm
 * @copyright www.javamultiplex.com
 */

/**
 * There are n cells arranged in linear fashion.
 * You are standing at 0th cell and want to reach (n-1)th cell.
 * At each cell you can have 6 possible ways to jump.
 */
public class DicePath {

    public static void dicePath(int n, int i, String osf) {
        if (i == n - 1) {
            System.out.println(osf);
            return;
        }
        if (i >= n) {
            return;
        }

        dicePath(n, i + 1, osf + "1->");
        dicePath(n, i + 2, osf + "2->");
        dicePath(n, i + 3, osf + "3->");
        dicePath(n, i + 4, osf + "4->");
        dicePath(n, i + 5, osf + "5->");
        dicePath(n, i + 6, osf + "6->");
    }

    public static void main(String[] args) {
        dicePath(4, 0, "");
    }
}
