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

    @Test
    public void testReverseSimpleString() {
        String original = "abc";
        String expected = "cba";
        StringReverser reverser = new StringReverser();
        String result = reverser.reverse(original);
        assertEquals(expected, result, "The reversed string of 'abc' should be 'cba'.");
    }

    @Test
    public void testReverseStringWithSpecialCharacters() {
        String original = "a!b@c";
        String expected = "c@b!a";
        StringReverser reverser = new StringReverser();
        String result = reverser.reverse(original);
        assertEquals(expected, result, "Special characters should be preserved in their original positions.");
    }

    @Test
    public void testReverseStringWithSpaces() {
        String original = "a b c";
        String expected = "c b a";
        StringReverser reverser = new StringReverser();
        String result = reverser.reverse(original);
        assertEquals(expected, result, "Spaces should be preserved in their original positions.");
    }

    @Test
    public void testReversePalindrome() {
        String original = "madam";
        String expected = "madam";
        StringReverser reverser = new StringReverser();
        String result = reverser.reverse(original);
        assertEquals(expected, result, "A palindrome string should remain the same when reversed.");
    }

    @Test
    public void testReverseLongString() {
        String original = "abcdefghijklmnopqrstuvwxyz";
        String expected = new StringBuilder(original).reverse().toString(); // Zum Vereinfachen der Erwartung
        StringReverser reverser = new StringReverser();
        String result = reverser.reverse(original);
        assertEquals(expected, result, "The reversed string should match the expected result for a long input.");
    }

    @Test
    public void testReverseSingleCharacter() {
        String original = "x";
        String expected = "x";
        StringReverser reverser = new StringReverser();
        String result = reverser.reverse(original);
        assertEquals(expected, result, "A single character string should remain the same when reversed.");
    }

    @Test
    public void testReverseStringWithNumbers() {
        String original = "12345";
        String expected = "54321";
        StringReverser reverser = new StringReverser();
        String result = reverser.reverse(original);
        assertEquals(expected, result, "A string containing numbers should be correctly reversed.");
    }

    @Test
    public void testReverseNull() {
        String original = null;
        String expected = null;
        StringReverser reverser = new StringReverser();
        String result = reverser.reverse(original);
        assertEquals(expected, result, "The method should return null for null input.");
    }

    @Test
    public void testReverseMixedCaseString() {
        String original = "AbCdEf";
        String expected = "fEdCbA";
        StringReverser reverser = new StringReverser();
        String result = reverser.reverse(original);
        assertEquals(expected, result, "The reversed string should preserve the case of each character.");
    }
}