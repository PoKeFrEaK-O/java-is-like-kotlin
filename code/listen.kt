val anListWithTheNameList = mutableListOf("catfish", "water", "tulips", "blue paint")
anListWithTheNameList[1] = "bottle of water"
for (s in anListWithTheNameList) {
    println(s)
}
// Ausgabe:
// catfish
// bottle of water
// tulips
// blue paint