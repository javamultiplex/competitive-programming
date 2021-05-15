package recursion;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 20/03/21 12:12 am
 * @copyright www.javamultiplex.com
 */
public class ArrayPrintTest {
    @Test
    public void shouldPrintArray() {
        ArrayPrint.printArrayRecursively(new int[]{1, 2, 3, 4, 5}, 5);
        ArrayPrint.printArrayRecursively(new int[]{5, 4, 3, 2, 1}, 5);
    }
}
