val viererReihe = IntArray(5)
for (i in viererReihe.indices) {
    viererReihe[i] = (i + 1) * 4
}
for (i in viererReihe) {
    println(i)
}

// Ausgabe:
// 4
// 8
// 12
// 16
// 20