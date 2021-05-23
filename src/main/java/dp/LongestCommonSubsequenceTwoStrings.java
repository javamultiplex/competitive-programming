package dp;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 20/05/21 11:54 am
 * @copyright www.javamultiplex.com
 */
public class LongestCommonSubsequenceTwoStrings {


    public static int lcsTD(String s1, String s2, int i, int j, int n, int m, int[][] dp) {
        if (i == n || j == m) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (s1.charAt(i) == s2.charAt(j)) {
            dp[i][j] = 1 + lcsTD(s1, s2, i + 1, j + 1, n, m, dp);
        } else {
            int r1 = lcsTD(s1, s2, i + 1, j, n, m, dp);
            int r2 = lcsTD(s1, s2, i, j + 1, n, m, dp);
            dp[i][j] = Math.max(r1, r2);
        }
        return dp[i][j];
    }

    public static int lcsBU(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    int r1 = dp[i - 1][j];
                    int r2 = dp[i][j - 1];
                    dp[i][j] = Math.max(r1, r2);
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {

        String s1 = "striver";
        String s2 = "raj";

        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println(lcsTD(s1, s2, 0, 0, n, m, dp));

        System.out.println(lcsBU(s1, s2));
    }
}
