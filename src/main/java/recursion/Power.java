package recursion;

/**
 * @author Rohit Agarwal on 03/04/21 2:10 pm
 * @copyright www.javamultiplex.com
 */
public class Power {
    //TC - O(b), SC - O(b)
    public static int method1(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        return a * method1(a, b - 1);
    }

    //TC - O(log2(b)), SC - O(log2(b))
    public static int method2(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        int temp = method2(a, b / 2);
        if (b % 2 == 0) {
            return temp * temp;
        } else {
            return a * temp * temp;
        }
    }
}
