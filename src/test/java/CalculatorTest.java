import Calculator.Calculator;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class CalculatorTest {

    private static final double DELTA = 1e-10;
    private Calculator calc;
   // private static  Logger logging;
    @BeforeClass
     public void initialize() {
        calc = new Calculator();
     //   logging = LogManager.getLogger(Calculator.class);

    }
    @Test
    public  void  factorialPositive()
    {
        assertEquals("[Positive Case]: Factorial of a number, ",120,calc.calcFactorial(5),DELTA);
        assertEquals("[Positive Case]: Factorial of a number, ",5040,calc.calcFactorial(7),DELTA);
    }

    @Test
    public void factorialNegative()
    {
       //assertNotEquals("[Negative Case]: Factorial of a number,",);
    }
}
