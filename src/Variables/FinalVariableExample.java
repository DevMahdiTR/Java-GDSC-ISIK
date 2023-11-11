package Variables;

public class FinalVariableExample {

    // Example 1: Final instance variable
    final int instanceVar = 42;

    // Example 2: Final static variable (class variable)
    public static final String GREETING = "Hello, ";

    public static void main(String[] args) {
        // Example 1: Using final instance variable
        FinalVariableExample obj = new FinalVariableExample();
        System.out.println("Final instance variable value: " + obj.instanceVar);

        // Uncommenting the line below would result in a compilation error
        // obj.instanceVar = 100; // Error: cannot assign a value to final variable instanceVar

        // Example 2: Using final static variable
        System.out.println(FinalVariableExample.GREETING + "World!");

        // Uncommenting the line below would result in a compilation error
        // FinalVariableExample.GREETING = "Hi, "; // Error: cannot assign a value to final variable GREETING
    }
}
