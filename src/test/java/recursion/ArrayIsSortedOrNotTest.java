package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Rohit Agarwal on 04/04/21 10:33 pm
 * @copyright www.javamultiplex.com
 */
public class ArrayIsSortedOrNotTest {

    @Test
    public void shouldValidateArrayIsSortedOrNot() {
        assertTrue(ArrayIsSortedOrNot.output(new int[]{1}, 1, 0));
        assertFalse(ArrayIsSortedOrNot.output(new int[]{2, 1}, 2, 0));
        assertTrue(ArrayIsSortedOrNot.output(new int[]{1, 2, 3}, 3, 0));
        assertFalse(ArrayIsSortedOrNot.output(new int[]{1, 2, 3, 4, 6, 5}, 6, 0));
        assertTrue(ArrayIsSortedOrNot.output(new int[]{1, 2, 3, 4, 5, 6}, 6, 0));
    }

}
