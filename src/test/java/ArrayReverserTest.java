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
        int[] array = {1, 2, 3};
        this.reverser.reverse(array);
        assertArrayEquals("wrong reverse", new int[] {3, 2, 1}, array);
    }

}
