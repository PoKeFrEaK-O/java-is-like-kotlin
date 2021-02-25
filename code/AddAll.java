// Source: https://www.geeksforgeeks.org/java-util-arraylist-addall-method-java/

public static void main(String args[]) {
    // Create the lists for the actual Command(addAll). /*
        // create an empty array list1 with initial capacity as 5
        ArrayList<Integer> arrlist1 = new ArrayList<Integer>(5);

        // use add() method to add elements in the list
        arrlist1.add(12);
        arrlist1.add(20);
        arrlist1.add(45);

        // prints all the elements available in list1
        System.out.println("Printing list1:");
        for (Integer number : arrlist1) {
            System.out.println("Number = " + number);
        }


        // create an empty array list2 with an initial
        // capacity
        ArrayList<Integer> arrlist2 = new ArrayList<Integer>(5);

        // use add() method to add elements in list2
        arrlist2.add(25);
        arrlist2.add(30);
        arrlist2.add(31);
        arrlist2.add(35);

        // let us print all the elements available in
        // list2
        System.out.println("Printing list2:");
        for (Integer number : arrlist2) {
            System.out.println("Number = " + number);
        }
    // */

    // inserting all elements, list2 will get printed
    // after list1
    arrlist1.addAll(arrlist2);

    // inserting all elements of list2 at third position:
    // arrlist1.addAll(2, arrlist2);

    System.out.println("Printing all the elements");
    // let us print all the elements available in
    // list1
    for (Integer number : arrlist1) {
        System.out.println("Number = " + number);
    }
}
// Ausgabe:
// Printing list1:
// Number = 12
// Number = 20
// Number = 45
// Printing list2:
// Number = 25
// Number = 30
// Number = 31
// Number = 35
// Printing all the elements
// Number = 12
// Number = 20
// Number = 45
// Number = 25
// Number = 30
// Number = 31
// Number = 35

---------------------------------------------------------------
// Self written code:

package de.check24.learningKotlinJava.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddAllOwn {
    public static void main(String args[]) {
        // Erstellen der Listen:
        List A = new ArrayList(Arrays.asList("a","b","c","d","e"));
        List B = new ArrayList(Arrays.asList("f","e","h","b","e"));

        // Ausgeben der Listen:
        System.out.println(A);
        System.out.println(B);

        // Alle Inhalte von B werden zu A hinzugefügt.
        A.addAll(B);
        System.out.println(A);
        // Duplizierte Inhalte sind auch vorhanden.
    }
}
// Ausgabe:
// [a, b, c, d, e]
// [f, e, h, b, e]
// [a, b, c, d, e, f, e, h, b, e]