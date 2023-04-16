package Esercizi_OOP2._7;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    /**
     * 1:
     *
     *
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     *
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     *
     * Verify that the methods return the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        Double num1=3.8;
        Double num2=4.7;
        Double num3=-34.2;
        Double zero=0.0;
        Calculator add_subtract = new Calculator();

        add_subtract.add(num1,num2);
        add_subtract.add(num1,zero);
        add_subtract.subtract(zero,num3);
        add_subtract.subtract(num2,num3);


    }

    /**
     * 2:
     *
     *
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     *
     * Test the same kind of inputs as before as exercise 1
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");

        Double num1=3.8;
        Double num2=4.7;
        Double num3=-34.2;
        Double zero=0.0;
        Calculator calculator = new Calculator();

        calculator.multiply(num1,num2);
        calculator.multiply(num1,zero);
        calculator.divide(zero,num3);
        calculator.divide(num2,num3);


        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10.0, 0.0));
    }

    /**
     * 3:
     *
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");

        Double num1=3.8;
        Double num2=4.7;
        Double num3=-34.2;
        Double zero=0.0;

        Calculator calculator = new Calculator();

        calculator.power(num1,num2);
        calculator.power(num1,zero);
        calculator.power(zero,num3);
        calculator.power(num2,num3);




    }
}