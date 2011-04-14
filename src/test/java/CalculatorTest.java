import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    
    Calculator calc;
    
    @Before
    public void setUp() {
        calc = new Calculator();
    }
    
    @Test
    public void testAdd() {
        assertEquals(4, calc.add(2, 2));
    }

}
