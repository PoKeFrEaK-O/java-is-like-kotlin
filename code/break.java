// break --> Schleife wird komplett abgebrochen.
for (int i = 0; i < 5; i++) {
    System.out.println(i);
    if (i == 2) {
        break;
    }
}
System.out.println("nach Schleife");
// Ausgabe:
// 0
// 1
// 2
// nach Schleife

// Zum Vergleich:
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
System.out.println("nach Schleife");
// Ausgabe:
// 0
// 1
// 2
// 3
// 4
// nach Schleife
