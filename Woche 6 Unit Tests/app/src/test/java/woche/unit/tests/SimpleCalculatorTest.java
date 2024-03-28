package woche.unit.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {
    @Test
    public void testAddition() {
        assertEquals(5, SimpleCalculator.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, SimpleCalculator.subtract(3, 2));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, SimpleCalculator.multiply(2, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(2, SimpleCalculator.divide(6, 3));
    }

    @Test
    public void testSin() {
        assertEquals(0.8414709848078965, SimpleCalculator.sin(Math.PI / 3), 0.0001);
    }
}
