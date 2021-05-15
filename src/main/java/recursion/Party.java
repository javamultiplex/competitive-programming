package recursion;

/**
 * @author Rohit Agarwal on 03/04/21 5:33 pm
 * @copyright www.javamultiplex.com
 */
public class Party {

    /**
     * There are N persons who wants to go to party. There is a constraint that any person can go alone
     * or can go in pair. Calculate number of ways in which N persons can go to party.
     *
     * @param n
     * @return
     */
    public static int numberOfWays(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int numberOfWaysPersonGoAlone = numberOfWays(n - 1);
        //(n - 1) -> Number of ways person can pair
        int numberOfWaysPersonGoInPair = (n - 1) * numberOfWays(n - 2);
        return numberOfWaysPersonGoAlone + numberOfWaysPersonGoInPair;
    }
}
