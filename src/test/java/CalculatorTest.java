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
    
    @Test
    public void testAdd2_3() {
        assertEquals(5, calc.add(2, 3));
    }
    
    @Test
    public void testMult() {
        assertEquals(4, calc.mult(2, 2));
    }
    
    @Test
    public void testMult2_3() {
        assertEquals(6, calc.mult(2, 3));
    }
    
    @Test
    public void testSub() {
        assertEquals(2, calc.sub(4, 2));
    }
    
    @Test
    public void testSub2_2() {
        assertEquals(0, calc.sub(2, 2));
    }
    
    @Test
    public void testDiv() {
        assertEquals(2, calc.div(4, 2));
    }
    
    @Test
    public void testDiv2_2() {
        assertEquals(1, calc.div(2, 2));
    }
    
    @Test
    public void testDiv_0() {
        calc.div(2, 0);
    }

}
