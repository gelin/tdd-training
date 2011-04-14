import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorld2Test {

    @Test
    public void testGetHello() {
        assertEquals("Hello, TDD!", HelloWorld2.getHello());
    }

}
