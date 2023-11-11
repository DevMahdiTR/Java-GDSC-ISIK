package Variables;

public class PrimitiveVariablesExample {
    public static void main(String[] args) {
        // Declare and initialize primitive variables
        int integerValue = 42;
        double doubleValue = 3.14;
        float floatValue = 2.5f; // Note: "f" is used to indicate a float literal
        char charValue = 'A';
        boolean booleanValue = true;

        // Print the values of primitive variables
        System.out.println("Integer Value: " + integerValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Char Value: " + charValue);
        System.out.println("Boolean Value: " + booleanValue);

        // Perform a simple test
        int sum = integerValue + (int) doubleValue + (int) floatValue; // casting double and float to int
        System.out.println("Sum of Integer, Double, and Float: " + sum);

        // Update a variable and print the updated value
        integerValue = 100;
        System.out.println("Updated Integer Value: " + integerValue);
    }
}
