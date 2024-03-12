package myfirstbuild;

import com.github.lalyos.jfiglet.FigletFont;
import org.apache.commons.lang3.math.NumberUtils; // Importieren der NumberUtils-Klasse aus Apache Commons Lang
import java.io.IOException; // Importieren der IOException Klasse

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        // Original greeting
        System.out.println(new App().getGreeting());

        // Text in Zahl umwandeln
        String textNumber = "123";
        int number = NumberUtils.toInt(textNumber);
        System.out.println("Die Zahl ist: " + number);

        try {
            // ASCII Art greeting
            String asciiArt = FigletFont.convertOneLine("Hello, World!");
            System.out.println(asciiArt);
        } catch (IOException e) {
            System.out.println("Ein Fehler ist aufgetreten beim Erstellen der ASCII-Kunst.");
            e.printStackTrace(); // Gibt den Stacktrace des Fehlers aus. Optional, je nach Bedarf.
        }
    }
}