package dp;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 23/05/21 4:20 pm
 * @copyright www.javamultiplex.com
 */
public class LongestCommonSubsequenceThreeStrings {

    public static int lcsTD(String s1, String s2, String s3, int i, int j, int k, int p, int q, int r, int[][][] dp) {
        if (i == p || j == q || k == r) {
            return 0;
        }

        if (dp[i][j][k] != -1) {
            return dp[i][j][k];
        }

        if (s1.charAt(i) == s2.charAt(j) && s2.charAt(j) == s3.charAt(k)) {
            dp[i][j][k] = 1 + lcsTD(s1, s2, s3, i + 1, j + 1, k + 1, p, q, r, dp);
        } else {
            int r1 = lcsTD(s1, s2, s3, i + 1, j, k, p, q, r, dp);
            int r2 = lcsTD(s1, s2, s3, i, j + 1, k, p, q, r, dp);
            int r3 = lcsTD(s1, s2, s3, i, j, k + 1, p, q, r, dp);
            dp[i][j][k] = Math.max(Math.max(r1, r2), r3);
        }
        return dp[i][j][k];
    }

    //TC - O(p*q*r)
    public static int lcsBU(String s1, String s2, String s3) {
        int p = s1.length();
        int q = s2.length();
        int r = s3.length();
        int[][][] dp = new int[p + 1][q + 1][r + 1];
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= q; j++) {
                for (int k = 1; k <= r; k++) {
                    if (s1.charAt(i - 1) == s2.charAt(j - 1) && s2.charAt(j - 1) == s3.charAt(k - 1)) {
                        dp[i][j][k] = 1 + dp[i - 1][j - 1][k - 1];
                    } else {
                        int r1 = dp[i - 1][j][k];
                        int r2 = dp[i][j - 1][k];
                        int r3 = dp[i][j][k - 1];
                        dp[i][j][k] = Math.max(Math.max(r1, r2), r3);
                    }
                }
            }
        }
        return dp[p][q][r];
    }

    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "geeksfor";
        String s3 = "geeksforgeeks";
        int p = s1.length();
        int q = s2.length();
        int r = s3.length();
        int[][][] dp = new int[p][q][r];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        System.out.println(lcsTD(s1, s2, s3, 0, 0, 0, p, q, r, dp));
        System.out.println(lcsBU(s1, s2, s3));
    }
}
