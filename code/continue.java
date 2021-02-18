// continue --> Momentaner Schleifendurchlauf wird übersprungen.
for (int i = 0; i < 5; i++) {
    System.out.println(i);
    if (i == 3) {
        continue;
    }
    System.out.println("nach continue");
}
System.out.println("nach Schleife");
// Ausgabe:
// 0
// nach continue
// 1
// nach continue
// 2
// nach continue
// 3
// 4
// nach continue
// nach Schleife

// Zum Vergleich:
for (int i = 0; i < 5; i++) {
    System.out.println(i);
    System.out.println("nach continue");
}
System.out.println("nach Schleife");
// Ausgabe:
// 0
// nach continue
// 1
// nach continue
// 2
// nach continue
// 3
// nach continue <--
// 4
// nach continue
// nach Schleife