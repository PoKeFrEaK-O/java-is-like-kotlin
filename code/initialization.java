import java.util.Locale;

public class Initialization {
    static class InitTestClass {
        String someString1 = "Hello";
        int zahl = 5;
        {
            System.out.println("Die Zahl lautet: " + zahl);
            String someString2 = "World";
            System.out.println(someString1 + " " + someString2);
        }

        int zahlAdded2 = zahl + 2;
        {
            System.out.println("Die Zahl " + zahl + " + 2 lautet: " + zahlAdded2);
            System.out.println(someString1.toUpperCase(Locale.ROOT));
        }
    }

    public static void main(String[] args) {
        InitTestClass someObject = new InitTestClass();
        System.out.println(someObject);
    }
}
// Ausgabe:
// Die Zahl lautet: 5
// Hello World
// Die Zahl 5 + 2 lautet: 7
// HELLO