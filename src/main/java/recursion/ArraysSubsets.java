package recursion;

/**
 * @author Rohit Agarwal on 04/04/21 1:36 pm
 * @copyright www.javamultiplex.com
 */
public class ArraysSubsets {

    //Subsets - 2^n
    public static void subsets(int[] arr, int n, int index, String osf) {
        if (index == n) {
            System.out.println("[" + osf + "]");
            return;
        }
        subsets(arr, n, index + 1, osf + arr[index]);
        subsets(arr, n, index + 1, osf);
    }
}
