while ( Bedingung ) {
    Anweisung
}

do {
    Anweisung
} while ( Bedingung )
// Die Anweisung wird unabhängig der Bedingung immer mindestens 1-mal ausgeführt.

// Example:
var zahl: Int = 1
while (zahl <= 3){
    println(zahl)
    zahl++
}
println()
do {
    println("Ich werde vor der Bedingung mindestens einmal ausgeführt.")
    println(zahl)
    zahl++
} while (zahl <= 3)

// Ausgabe:
// 1
// 2
// 3
//
// Ich werde vor der Bedingung mindestens einmal ausgeführt.
// 4