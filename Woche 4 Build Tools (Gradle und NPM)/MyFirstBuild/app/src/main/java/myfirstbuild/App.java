package myfirstbuild;

import org.apache.commons.lang3.math.NumberUtils; // Importieren der NumberUtils-Klasse aus Apache Commons Lang

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
    }
}