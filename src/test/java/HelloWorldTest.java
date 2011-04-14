import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

    ByteArrayOutputStream out;
    
    @Before
    public void setUp() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }
    
    @Test
    public void testMain() {
        HelloWorld.main(null);
        assertEquals("Hello, TDD!\r\n", getOut());
    }
    
    String getOut() {
        return new String(out.toByteArray());
    }
    
}
