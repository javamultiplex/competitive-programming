package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Rohit Agarwal on 20/05/21 11:18 am
 * @copyright www.javamultiplex.com
 */
public class KStones {
    public static String kStonesGame(int[] arr, int n, int k) {
        int[] dp = new int[k + 1];
        Arrays.fill(dp, 0);
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                if (i < arr[j]) {
                    continue;
                }
                if (dp[i - arr[j]] == 0) {
                    dp[i] = 1;
                }
            }
        }
        return dp[k] == 1 ? "First" : "Second";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int k = Integer.parseInt(line1[1]);
        String[] line2 = bufferedReader.readLine().split(" ");
        int[] arr = new int[n];
        int i = 0;
        for (String line : line2) {
            arr[i] = Integer.parseInt(line);
            i++;
        }
        System.out.println(kStonesGame(arr, n, k));
    }
}
