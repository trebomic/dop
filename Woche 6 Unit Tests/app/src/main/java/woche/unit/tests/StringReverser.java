package woche.unit.tests;

public class StringReverser {

    public String reverse(String input) {
        // Überprüft, ob der Eingabestring null ist, um eine NullPointerException zu
        // vermeiden
        if (input == null) {
            return null;
        }

        // Verwendet StringBuilder, um den Eingabestring umzukehren
        return new StringBuilder(input).reverse().toString();
    }
}
