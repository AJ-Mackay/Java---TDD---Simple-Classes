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



// Create a Calculator class. This should have functions for Add,
// Subtract, Multiply and Divide. Your methods should take in two
// ints to perform the calculations on (except the Divide method.
// This should take two doubles as arguments).