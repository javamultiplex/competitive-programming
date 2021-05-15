package dp;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 15/05/21 8:14 pm
 * @copyright www.javamultiplex.com
 */
public class Fibonacci {

    //TC - O(n), SC - O(n)
    public static long fibTD(int n, long[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = fibTD(n - 1, dp) + fibTD(n - 2, dp);
        return dp[n];
    }

    //TC - O(n), SC - O(n)
    public static int fibBuV1(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


    //TC - O(n), SC - O(1)
    public static int fibBuV2(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int i = 1;
        int c = 0;
        while (i != n) {
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 20;
        long[] dp = new long[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fibTD(n, dp));
        System.out.println(fibBuV1(n));
        System.out.println(fibBuV2(n));
    }
}
