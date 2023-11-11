package StaticExample;

public class StaticVariableExample {

    // Static variable shared among all instances of the class
    static int instanceCount = 0;

    // Instance variable
    int instanceNumber;

    // Constructor increments the static variable and assigns a unique instance number
    public StaticVariableExample() {
        instanceCount++;        // Increment the static variable
        instanceNumber = instanceCount; // Assign a unique instance number
    }

    public static void main(String[] args) {
        // Create instances of the class
        StaticVariableExample obj1 = new StaticVariableExample();
        StaticVariableExample obj2 = new StaticVariableExample();
        StaticVariableExample obj3 = new StaticVariableExample();

        // Accessing static variable from the class (no need for an instance)
        System.out.println("Number of instances created: " + StaticVariableExample.instanceCount);

        // Accessing instance variables
        System.out.println("Instance number of obj1: " + obj1.instanceNumber);
        System.out.println("Instance number of obj2: " + obj2.instanceNumber);
        System.out.println("Instance number of obj3: " + obj3.instanceNumber);
    }
}
