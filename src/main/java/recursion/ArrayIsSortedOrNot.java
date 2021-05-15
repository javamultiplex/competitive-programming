package recursion;

/**
 * @author Rohit Agarwal on 04/04/21 10:13 pm
 * @copyright www.javamultiplex.com
 */
public class ArrayIsSortedOrNot {

    public static boolean output(int[] arr, int n, int index) {
        if (n == 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && output(arr, n - 1, index + 1);
    }
}
