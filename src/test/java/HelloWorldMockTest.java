import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HelloWorldMockTest {

    PrintStream out;

    @Before
    public void setUp() {
        out = mock(PrintStream.class);
        System.setOut(out);
    }

    @Test
    public void testMain() {
        HelloWorld.main(null);
        verify(out).println(eq("Hello, TDD!"));
    }

}
