package Arrays;

public class ArrayExample {

    public static void main(String[] args) {
        // Declaring and initializing an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing elements of the array using index
        System.out.println("Element at index 2: " + numbers[2]);

        // Modifying an element of the array
        numbers[3] = 10;

        // Displaying all elements using a for loop
        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Declaring and initializing an array of strings
        String[] names = {"Alice", "Bob", "Charlie"};

        // Displaying all elements using a for-each loop
        System.out.println("\nAll elements in the string array:");
        for (String name : names) {
            System.out.println(name);
        }

        // Finding the length of an array
        System.out.println("\nLength of the names array: " + names.length);
    }
}
