// Ist eine Liste und kein Array
List<String> shoppingList = java.util.Arrays.asList("catfish", "water", "tulips", "blue paint");
shoppingList.set(1, "bottle of water");
for (String s : shoppingList) {
    System.out.println(s);
}
// catfish
// bottle of water
// tulips
// blue paint