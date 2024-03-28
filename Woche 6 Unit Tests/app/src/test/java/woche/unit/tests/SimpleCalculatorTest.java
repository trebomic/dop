package woche.unit.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {
    @Test
    public void testAddition() {
        assertEquals(5, SimpleCalculator.add(2, 3));
    }
}
