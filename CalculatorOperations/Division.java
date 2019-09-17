package CalculatorOperations;


    public class Division {

        public static double division(double firstNumber, double secondNumber) throws ArithmeticException {

            try {
            return (firstNumber/ secondNumber);
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide by zero ");
        }
    return 0 ;
    }
}
