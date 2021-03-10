package Calculator;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import  java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static final Logger logging = LogManager.getLogger(Calculator.class);
    private static final Scanner scan = new Scanner(System.in);


    public Calculator(){

    }

    public static void main(String []args)
    {

        int choice;
        System.out.println("Hi, I am Calc the Calculator. I offer below functions.!!"+"\n");

        Calculator calc = new Calculator();

        do {


        try {
            System.out.println("1. Factorial"+"\n"+"2. Exponentiation"+"\n"+"3. Logarithmic"+"\n"+"4. Square Root"+"\n"+"5. Enter any other number to EXIT.");
            System.out.print("\n"+"Enter your choice: ");

            choice = scan.nextInt();
        }
        catch(InputMismatchException ime)
        {
            logging.error("[ERROR]: Expecting integer value encountered different value type.");
            return;
        }
        switch(choice) {
            case 1: //Factorial code
                double factVal ;

                System.out.print("Enter the number for Factorial calculation: ");
                try {
                    factVal = scan.nextInt();
                }
                catch (InputMismatchException ime) {
                    logging.error("[ERROR]: Value type mismatch.Expected Integer got other type. ");
                    return;
                }

                double factRes  ;

                if(factVal >=0) {
                    factRes = calc.calcFactorial(factVal);
                    System.out.println("Factorial Result is: " + factRes);
                    System.out.println("======================================================");
                }
                else{
                    logging.error("[ERROR]: Factorial is not defined for Negative numbers");
                    return;
                }
                break;

            case 2: //Exponentiation
                    double base,exp;

                try {
                    System.out.print("Enter base value: ");
                    base = scan.nextDouble();
                    System.out.print("Enter exponent value: ");
                    exp = scan.nextDouble();

                }
                catch (InputMismatchException ime) {
                    logging.error("[ERROR]: Value type mismatch.Expected Double got other type. ");
                    return ;
                }
                System.out.println(base + " raised to " + exp +": "+calc.calcExp(base,exp));
                System.out.println("======================================================");

                break;

            case 3: //Logarithmic code
                double logVal;
                try {
                    System.out.print("Enter value for Logarithm calculation: ");
                    logVal= scan.nextDouble();

                }
                catch (InputMismatchException ime)
                {
                    logging.error("[ERROR]: Expected Double but got different type. Try again!!");
                    return;
                }
                if(logVal>0) {
                    System.out.println("Log of " + logVal + ": " + calc.calcLog(logVal));
                    System.out.println("======================================================");
                }
                else{
                    logging.error("[ERROR]: Log is not defined for Negative numbers");
                    return;
                }
                    break;

            case 4: //Square root code
                double sqrtVal;
                try {
                    System.out.print("Enter value for Square root calculation: ");
                    sqrtVal= scan.nextDouble();

                }
                catch (InputMismatchException ime)
                {
                    logging.error("[ERROR]: Expected Double but got different type. Try again!!");
                    return;
                }

                    System.out.println("Square root of " + sqrtVal + ": " + calc.calcSQRT(sqrtVal));
                    System.out.println("======================================================");

                break;

            default:
                    logging.info("[INFO]: Exiting, entered choice doesn't have any functionality.");

            }
        }while(choice <=4 );

    }

public double calcFactorial(double factVal)
{
    logging.info("[INFO]: I/P for Factorial: " + factVal);
    double res=1;

    if(factVal <0 )
         return Double.NaN;

    while(factVal!=0)
    {
        res=res*factVal;
        factVal--;
    }
    logging.info("[INFO]: Factorial Result: "+ res);
    return res;
}

public double calcExp(double base, double exp)
{
    logging.info("[INFO]: Base: "+base +" Exponent: "+exp);
    if(base==0 && exp ==0)
            return Double.NaN;
    return Math.pow(base,exp);
}
public double calcLog(double logVal)
{
    logging.info("[INFO]: Value: "+logVal);
    return Math.log(logVal);
}

public double calcSQRT(double sqrtVal)
    {
        logging.info("[INFO]: Value: "+sqrtVal);
        if(sqrtVal <0 ) {
            logging.error("[ERROR]: Square is not defined for Negative numbers as of now!!");
            return Double.NaN;
        }
            return Math.sqrt(sqrtVal);
    }




}
