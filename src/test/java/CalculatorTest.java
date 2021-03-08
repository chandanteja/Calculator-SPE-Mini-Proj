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
        assertEquals("[Positive Case]: Factorial of a number, ",Double.NaN,calc.calcFactorial(-2),DELTA);
    }

    @Test
    public void factorialNegative()
    {
       assertNotEquals("[Negative Case]: Factorial of a number,",24,calc.calcFactorial(5),DELTA);
        assertNotEquals("[Negative Case]: Factorial of a number,",120,calc.calcFactorial(7),DELTA);
        assertNotEquals("[Negative Case]: Factorial of a number,",Double.NaN,calc.calcFactorial(-3),DELTA);
    }

    @Test
    public  void  exponentiationPositive()
    {
        assertEquals("[Positive Case]: Power of a number, ",32,calc.calcExp(2,5),DELTA);
        assertEquals("[Positive Case]: Power of a number, ",0.1111111111,calc.calcExp(3,-2),DELTA);
        assertEquals("[Positive Case]: Power of a number, ",Double.NaN,calc.calcExp(0,0),DELTA);
    }


    @Test
    public  void  exponentiationNegative()
    {
        assertNotEquals("[Negative Case]: Power of a Number, ",31,calc.calcExp(2,5),DELTA) ;
        assertEquals("[Negative Case]: Power of a Number, ",0.1111111122,calc.calcExp(3,-2),DELTA);
        assertEquals("[Negative Case]: Power of a Number, ",1,calc.calcExp(0,0),DELTA);
    }



}
