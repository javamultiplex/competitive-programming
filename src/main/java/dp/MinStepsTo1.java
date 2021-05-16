package dp;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 16/05/21 12:00 am
 * @copyright www.javamultiplex.com
 */
public class MinStepsTo1 {
    /**
     * Given a number x, you can do 3 different operations on x
     * <p>
     * 1) subtract 1 from x.
     * 2) if x is divisible by 2 then divide x by 2.
     * 3) if x is divisible by 3 then divide x by 3.
     * find minimum number of operations to reduce x to 1.
     * <p>
     * ex - X=7
     * <p>
     * 7 -> 6 -> 2 -> 1 (ans is 3)
     */
    //TC - O(x), SC - O(x)
    public static int minStepsTo1TD(int x, int[] dp) {

        if (x <= 0) {
            return Integer.MAX_VALUE;
        }

        if (x == 1) {
            return 0;
        }

        if (x == 2 || x == 3) {
            return 1;
        }

        if (dp[x] != -1) {
            return dp[x];
        }

        int divBy3 = Integer.MAX_VALUE;
        int divBy2 = Integer.MAX_VALUE;

        if (x % 3 == 0) {
            divBy3 = 1 + minStepsTo1TD(x / 3, dp);
        }

        if (x % 2 == 0) {
            divBy2 = 1 + minStepsTo1TD(x / 2, dp);
        }

        int subBy1 = 1 + minStepsTo1TD(x - 1, dp);

        dp[x] = Math.min(Math.min(divBy3, divBy2), subBy1);
        return dp[x];
    }

    //TC - O(x), SC - O(x)
    public static int minStepsTo1BU(int x) {

        if (x <= 0) {
            return Integer.MAX_VALUE;
        }

        if (x == 1) {
            return 0;
        }

        if (x == 2 || x == 3) {
            return 1;
        }

        int[] dp = new int[x + 1];
        dp[0] = Integer.MAX_VALUE;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        for (int i = 4; i <= x; i++) {
            int divBy3 = Integer.MAX_VALUE;
            int divBy2 = Integer.MAX_VALUE;
            if (i % 3 == 0) {
                divBy3 = 1 + dp[i / 3];
            }

            if (i % 2 == 0) {
                divBy2 = 1 + dp[i / 2];
            }

            int subBy1 = 1 + dp[i - 1];
            dp[i] = Math.min(Math.min(divBy3, divBy2), subBy1);
        }
        return dp[x];
    }

    public static void main(String[] args) {
        //10 -> 9 -> 3 -> 1
        //12 -> 6 -> 2 -> 1
        //14 -> 7 -> 6 -> 3 -> 1
        int x = 10;
        int[] dp = new int[x + 1];
        Arrays.fill(dp, -1);
        System.out.println(minStepsTo1TD(x, dp));
        System.out.println(minStepsTo1BU(x));
    }

}

