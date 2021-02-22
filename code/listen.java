java.util.List<String> anListWithTheNameList = java.util.Arrays.asList("catfish", "water", "tulips", "blue paint");
anListWithTheNameList.set(1, "bottle of water");
for (String s : anListWithTheNameList) {
    System.out.println(s);
}
// Ausgabe:
// catfish
// bottle of water
// tulips
// blue paint