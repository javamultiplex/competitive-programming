package recursion;

/**
 * @author Rohit Agarwal on 03/04/21 2:58 pm
 * @copyright www.javamultiplex.com
 */

public class PatternProblem {

    /*

    n=4

    * * * *
    * * *
    * *
    *

     */
    public static void pattern1(int n, int i) {
        if (n == 0) {
            return;
        }
        if (i < n) {
            System.out.print("* ");
            pattern1(n, i + 1);
        } else {
            System.out.println();
            pattern1(n - 1, 0);
        }

    }


    /*

    n=4

    *
    * *
    * * *
    * * * *

     */
    public static void pattern2(int n, int i) {
        if (n == 0) {
            return;
        }
        if (i == 0) {
            pattern2(n - 1, 0);
        }
        if (i == n) {
            System.out.println("");
            return;
        }
        if (i < n) {
            System.out.print("* ");
            pattern2(n, i + 1);
        }
    }
}
