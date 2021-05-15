package recursion;

/**
 * @author Rohit Agarwal on 20/03/21 12:08 am
 * @copyright www.javamultiplex.com
 */
public class ArrayPrint {
    public static void printArrayRecursively(int[] arr, int n) {
        printArrayRecursively(arr, 0, n);
    }

    private static void printArrayRecursively(int[] arr, int index, int n) {
        if (index == n-1) {
            System.out.println(arr[index]);
        } else {
            System.out.print(arr[index] + " ");
            printArrayRecursively(arr, ++index, n);
        }
    }
}
