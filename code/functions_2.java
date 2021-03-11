public class Functions {
    public static void main(String[] args) {
        final Integer result1 = double1(2,2);
        final Integer result2 = double2(2,2);

        System.out.println("double1: " + result1);
        System.out.println("double2: " + result2);
        // You can also call the function inside the println function:
        System.out.println("double1: " + double1(2,2));
        System.out.println("double2: "+ double2(2,2));
    }

    public static Integer double1(Integer zahl, Integer multiplier) {
        return zahl * multiplier;
    }

    // Function with line breaks between parameters:
    public static Integer double2(
            Integer zahl,
            Integer multiplier
    )
    {
        return zahl * multiplier;
    }
}
// Ausgabe:
// double1: 4
// double2: 4
// double1: 4
// double2: 4