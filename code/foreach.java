for ( Datentyp Element : Collection ){
    // Bedingung, die Element enthält
}

public static void main(String[] args) {
    int viererReihe [] = new int [5];
    for (int i = 0; i < viererReihe.length; i++) {
        viererReihe[i] = (i + 1) * 4;
    }
    for (int i: viererReihe){
        System.out.println(i);
    }
}
// Ausgabe:
// 4
// 8
// 12
// 16
// 20