package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 03/04/21 5:43 pm
 * @copyright www.javamultiplex.com
 */
public class PartyTest {

    @Test
    public void shouldCountNumberOfWays() {
        /*
        let's say 3 persons A,B,C, so number of ways
        1 - A,B,C
        2 - AB,C
        3 - AC,B
        4 - BC,A
         */
        assertEquals(4, Party.numberOfWays(3));
        /*
        let's say 4 persons A,B,C,D, so number of ways
        1 - A,B,C,D
        2 - AB,C,D
        3 - AC,B,D
        4 - AD,B,C
        5 - BC,A,D
        6 - BD,A,C
        7 - CD,A,B
        8 - AB,CD
        9 - AC,BD
        10 - AD,BC
         */
        assertEquals(10, Party.numberOfWays(4));
    }
}
