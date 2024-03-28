package woche.unit.tests;

public class SimpleCalculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Division by zero");
        return a / b;
    }

    public static double logarithm(double value) {
        if (value <= 0)
            throw new IllegalArgumentException("Logarithm of non-positive number is undefined");
        return Math.log(value);
    }

    public static int power(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }

    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public static int modulus(int dividend, int divisor) {
        return dividend % divisor;
    }

    public static int absoluteValue(int number) {
        return Math.abs(number);
    }
}
