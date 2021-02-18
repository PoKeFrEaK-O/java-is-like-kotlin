// break --> Schleife wird komplett abgebrochen.
for (i in 0..4) {
    println(i)
    if (i == 2) {
        break
    }
}
println("nach Schleife")
// Ausgabe:
// 0
// 1
// 2
// nach Schleife

// Zum Vergleich:
for (i in 0..4) {
    println(i)
}
println("nach Schleife")
// Ausgabe:
// 0
// 1
// 2
// 3
// 4
// nach Schleife