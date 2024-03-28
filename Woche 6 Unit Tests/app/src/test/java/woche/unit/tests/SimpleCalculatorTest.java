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
}
