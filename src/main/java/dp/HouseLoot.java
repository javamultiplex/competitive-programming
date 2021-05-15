package dp;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 15/05/21 8:25 pm
 * @copyright www.javamultiplex.com
 */
public class HouseLoot {

    //TC - O(n), SC - O(n)
    public static int houseLootTD(int[] house, int[] dp, int i) {
        if (i == 0) {
            return house[0];
        }
        if (i == 1) {
            return Math.max(house[0], house[1]);
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        dp[i] = Math.max(houseLootTD(house, dp, i - 1), houseLootTD(house, dp, i - 2) + house[i]);
        return dp[i];
    }

    //TC - O(n), SC - O(n)
    public static int houseLootBU(int[] house, int n) {
        if (n == 1) {
            return house[0];
        }
        if (n == 2) {
            return Math.max(house[0], house[1]);
        }
        int[] dp = new int[n];
        dp[0] = house[0];
        dp[1] = Math.max(house[0], house[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + house[i]);
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int[] house = {2, 3, 8, 1, 9};
        System.out.println(houseLootTD(house, dp, n - 1));
        System.out.println(houseLootBU(house, n));
    }

}
