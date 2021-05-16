package dp;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 16/05/21 7:52 pm
 * @copyright www.javamultiplex.com
 */
public class MinCoinsToChange {

    // TC - O(amount), SC - O(amount)
    public static int minCoinsToChangeTD(int[] coins, int n, int amount, int[] dp) {
        if (amount < 0) {
            return Integer.MAX_VALUE;
        }

        if (amount == 0) {
            return 0;
        }

        if (dp[amount] != Integer.MAX_VALUE) {
            return dp[amount];
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int recurrenceResult = minCoinsToChangeTD(coins, n, amount - coins[i], dp);
            if (recurrenceResult == Integer.MAX_VALUE) {
                continue;
            }
            result = Math.min(result, 1 + recurrenceResult);
        }
        dp[amount] = result;
        return dp[amount];
    }

    // TC - O(amount), SC - O(amount)
    public static int minCoinsToChangeBU(int[] coins, int n, int amount) {
        if (amount == 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < n; j++) {
                if (i < coins[j]) {
                    continue;
                }
                dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        int n = 3;
        int[] coins = {5, 7, 1};
        int x = 11;
        int[] dp = new int[x + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        System.out.println(minCoinsToChangeTD(coins, n, x, dp));
        System.out.println(minCoinsToChangeBU(coins, n, x));
    }

}
