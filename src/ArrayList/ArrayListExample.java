package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Displaying the ArrayList
        System.out.println("ArrayList: " + fruits);

        // Accessing elements using a for-each loop
        System.out.println("\nAccessing elements using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Adding elements at a specific index
        fruits.add(2, "Grapes");

        // Displaying the updated ArrayList
        System.out.println("\nUpdated ArrayList: " + fruits);

        // Removing an element by value
        fruits.remove("Banana");

        // Displaying the ArrayList after removal
        System.out.println("\nArrayList after removing 'Banana': " + fruits);

        // Checking if an element exists in the ArrayList
        System.out.println("\nDoes 'Mango' exist in the ArrayList? " + fruits.contains("Mango"));

        // Getting the size of the ArrayList
        System.out.println("\nSize of the ArrayList: " + fruits.size());

        // Retrieving an element at a specific index
        System.out.println("\nElement at index 1: " + fruits.get(1));

        // Iterating through the ArrayList using an Iterator
        System.out.println("\nIterating through the ArrayList using an Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Clearing all elements from the ArrayList
        fruits.clear();

        // Displaying the ArrayList after clearing
        System.out.println("\nArrayList after clearing: " + fruits);
    }
}
