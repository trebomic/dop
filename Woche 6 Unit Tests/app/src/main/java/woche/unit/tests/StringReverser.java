package woche.unit.tests;

public class StringReverser {

    public String reverse(String input) {
        // Ein einfacher Weg, einen String in Java umzukehren
        return new StringBuilder(input).reverse().toString();
    }
}
