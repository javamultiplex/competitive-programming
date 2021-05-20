package dp;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 16/05/21 11:18 pm
 * @copyright www.javamultiplex.com
 */
public class LongestIncreasingSubsequence {
    /**
     * Given an array of integers,
     * find the longest subsequence from array which is strictly
     * increasing. Return length.
     * <p>
     * Ex - 3,1,2,5,4,6,5,6
     * <p>
     * ans - 5
     */

    //TC - O(n*n), SC - O(n)
    public static int lis(int[] arr, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                }
            }
        }

        System.out.println(Arrays.toString(dp));
        int max = dp[0];
        for (int i = 1; i < n; i++) {
            if (dp[i] > max) {
                max = dp[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 4, 6, 5, 6};
        int n = 8;
        System.out.println(lis(arr, n));
    }
}
