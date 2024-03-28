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
}
