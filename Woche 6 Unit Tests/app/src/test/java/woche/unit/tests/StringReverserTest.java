package woche.unit.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringReverserTest {
    @Test
    public void testReverseEmptyString() {
        String original = "";
        String expected = "";
        StringReverser reverser = new StringReverser();
        String result = reverser.reverse(original);
        assertEquals(expected, result, "The reversed string should be empty for an empty input string.");
    }
}