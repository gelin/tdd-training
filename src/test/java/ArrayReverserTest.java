import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayReverserTest {

    private ArrayReverser reverser;

    @Before
    public void setUp() {
        this.reverser = new ArrayReverser();
    }

    @Test
    public void testReverse() {
        int[] original = {1, 2, 3};
        int[] reversed = this.reverser.reverse(original);
        assertArrayEquals("wrong reverse", new int[] {3, 2, 1}, reversed);
    }

}
