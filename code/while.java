while ( Bedingung ) {
    Anweisung;
}

do {
    Anweisung;
} while ( Bedingung );
// Die Anweisung wird unabhängig der Bedingung immer mindestens 1-mal ausgeführt.

// Example:
int zahl = 1;
while (zahl <= 3) {
    System.out.println(zahl);
    zahl++;
}
System.out.println();
do {
    System.out.println("Ich werde vor der Bedingung mindestens einmal ausgeführt.");
    System.out.println(zahl);
    zahl++;
} while (zahl <= 3);

// Ausgabe:
// 1
// 2
// 3
//
// Ich werde vor der Bedingung mindestens einmal ausgeführt.
// 4