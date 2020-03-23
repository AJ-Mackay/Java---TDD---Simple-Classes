import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(8,5, 17.5, 5.0);
    }

    @Test
    public void canAdd(){
        assertEquals(13, calculator.add());
    }

    @Test
    public void canSubtract(){
        assertEquals(3, calculator.subtract());
    }

    @Test
    public void canMultiply(){
        assertEquals(40, calculator.multiply());
    }

    @Test
    public void canDivide(){
        assertEquals(3.5, calculator.divide(), 0.01);
    }
}