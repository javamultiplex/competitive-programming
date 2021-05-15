package recursion;

/**
 * @author Rohit Agarwal on 04/04/21 10:04 pm
 * @copyright www.javamultiplex.com
 */
public class BinaryStringsWithoutConsecutiveOne {

    public static void printBinaryString(int n, int index, String osf) {
        if (index == n) {
            if (!osf.contains("11")) {
                System.out.println("[" + osf + "]");
            }
            return;
        }
        printBinaryString(n, index + 1, osf + 1);
        printBinaryString(n, index + 1, osf + 0);
    }

}
