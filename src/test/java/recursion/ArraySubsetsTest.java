package recursion;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 04/04/21 10:01 pm
 * @copyright www.javamultiplex.com
 */
public class ArraySubsetsTest {

    @Test
    public void shouldPrintArraySubsets() {
        ArraysSubsets.subsets(new int[]{1, 2, 3}, 3, 0, "");
        ArraysSubsets.subsets(new int[]{1, 2, 3, 4}, 4, 0, "");
    }
}
