// continue --> Momentaner Schleifendurchlauf wird übersprungen.
for (i in 0..4) {
    println(i)
    if (i == 3) {
        continue
    }
    println("nach continue")
}
println("nach Schleife")
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
for (i in 0..4) {
    println(i)
    println("nach continue")
}
println("nach Schleife")
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