// declares an array of String:
String[] anArrayWithTheNameArray;
// allocates memory for 4 String:
anArrayWithTheNameArray = new String[4];

// initialize of elements:
anArrayWithTheNameArray[0] = "catfish";
anArrayWithTheNameArray[1] = "water";
anArrayWithTheNameArray[2] = "tulips";
anArrayWithTheNameArray[3] = "blue paint";

// Replacing the second element
anArrayWithTheNameArray[1] = "bottle of water";

for (String element : anArrayWithTheNameArray) {
    System.out.println(element);
}

// Ausgabe:
// catfish
// bottle of water
// tulips
// blue paint
---------------------------------------------------------------

// Declares an array of String and initialize the elements in one:
String[] anArrayWithTheNameArray = {"catfish", "water", "tulips", "blue paint"};

// Replacing the second element
anArrayWithTheNameArray[1] = "bottle of water";

for (String element : anArrayWithTheNameArray) {
    System.out.println(element);
}
// Ausgabe:
// catfish
// bottle of water
// tulips
// blue paint
