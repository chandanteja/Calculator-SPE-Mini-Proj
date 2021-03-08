import Calculator.Calculator;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class CalculatorTest {

    private static final double DELTA = 1e-10;
    private static Calculator calc;
   // private static  Logger logging;
    @BeforeClass
     public  static void initialize() {
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
        assertNotEquals("[Negative Case]: Factorial of a number,",5,calc.calcFactorial(-3),DELTA);
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
        assertNotEquals("[Negative Case]: Power of a Number, ",0.1111111122,calc.calcExp(3,-2),DELTA);
        assertNotEquals("[Negative Case]: Power of a Number, ",1,calc.calcExp(0,0),DELTA);
    }

    @Test
    public  void  logPositive()
    {
        assertEquals("[Positive Case]: Log of a number, ",2.302585092994,calc.calcLog(10),DELTA);
        assertEquals("[Positive Case]: Log of a number, ",Double.NEGATIVE_INFINITY,calc.calcLog(0),DELTA);
        assertEquals("[Positive Case]: Log of a number, ",Double.NaN,calc.calcLog(-5),DELTA);
    }


    @Test
    public  void  logNegative()
    {
        assertNotEquals("[Negative Case]: Log of a number, ", 6, calc.calcLog(3), DELTA);
        assertNotEquals("[Negative Case]: Log of a number, ", -7.3, calc.calcLog(1.6), DELTA);
        assertNotEquals("[Negative Case]: Log of a number, ", 0, calc.calcLog(0), DELTA);
        assertNotEquals("[Negative Case]: Log of a number, ", 9.0, calc.calcLog(-5), DELTA);
    }


    @Test
    public void sqrtPositive(){
        assertEquals("[Positive Case]: SQRT of a number, ", 2, calc.calcSQRT(4), DELTA);
        assertEquals("[Positive Case]: SQRT of a number, ", 2.236067977499, calc.calcSQRT(5), DELTA);
        assertEquals("[Positive Case]: SQRT of a number, ", 0, calc.calcSQRT(0), DELTA);
        assertEquals("[Positive Case]: SQRT of a number, ", Double.NaN, calc.calcSQRT(-2), DELTA);
    }

    @Test
    public void sqrtNegative(){
        assertNotEquals("[Negative Case]: SQRT of a number, ", 6, calc.calcSQRT(4), DELTA);
        assertNotEquals("[Negative Case]: SQRT of a number, ", 4.2, calc.calcSQRT(2.1), DELTA);
        assertNotEquals("[Negative Case]: SQRT of a number, ", 7.3, calc.calcSQRT(-5), DELTA);
    }


}
