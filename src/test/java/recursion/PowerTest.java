package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 03/04/21 2:12 pm
 * @copyright www.javamultiplex.com
 */
public class PowerTest {

    @Test
    public void shouldCalculatePower_method1() {
        assertEquals(1, Power.method1(3, 0));
        assertEquals(3, Power.method1(3, 1));
        assertEquals(16, Power.method1(4, 2));
        assertEquals(64, Power.method1(4, 3));
    }

    @Test
    public void shouldCalculatePower_method2() {
        assertEquals(1, Power.method2(3, 0));
        assertEquals(3, Power.method2(3, 1));
        assertEquals(16, Power.method2(4, 2));
        assertEquals(64, Power.method2(4, 3));
    }
}
