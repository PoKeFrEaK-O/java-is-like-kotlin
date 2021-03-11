public class Constructors {
    int number; // Create a class attribute

    // Create a class constructor for the Constructors class:
    public Constructors() {
        number = 5; // Set the initial value for the class attribute number
    }

    public static void main(String[] args) {
        // Create an object of class Constructors
        // (This will call the constructor):
        Constructors someObject = new Constructors();
        // Print the value of number:
        System.out.println("The value of number is: " + someObject.number);
    }
}
// Ausgabe:
// The value of number is: 5