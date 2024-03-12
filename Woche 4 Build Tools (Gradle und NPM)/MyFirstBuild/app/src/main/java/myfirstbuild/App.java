package myfirstbuild;
import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException; // Importieren der IOException Klasse

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        // Original greeting
        System.out.println(new App().getGreeting());

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
