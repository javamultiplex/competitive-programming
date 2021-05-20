package dp;

/**
 * @author Rohit Agarwal on 17/05/21 11:10 pm
 * @copyright www.javamultiplex.com
 */
public class BinaryStringsWithNoConsecutive1 {

    /**
     * n=0, 1
     * n=1, [0,1]
     * n=2, [00,01,10],
     * n=3, [000,010,100,101,001],
     * n=4, [0000,0001,0010,0100,1000,0101,1001,1010]
     */

    //TC - O(n), SC - O(n)
    public static int fib(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
    }
}
