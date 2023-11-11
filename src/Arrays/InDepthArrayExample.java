package Arrays;

public class InDepthArrayExample {

    public static void main(String[] args) {
        // 1. Array Initialization
        int[] intArray = new int[5]; // Initialize an array of integers with size 5
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;

        // 2. Accessing and modifying elements
        System.out.println("Element at index 2: " + intArray[2]);
        intArray[2] = 35; // Modify the element at index 2
        System.out.println("Modified element at index 2: " + intArray[2]);

        // 3. Array Length
        System.out.println("Length of intArray: " + intArray.length);

        // 4. Iterating through an array
        System.out.println("Iterating through intArray:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + ": " + intArray[i]);
        }

        // 5. Array Initialization using an array literal
        String[] stringArray = {"apple", "banana", "orange"};

        // 6. Multi-dimensional arrays
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Accessing elements in a 2D array
        System.out.println("Element at row 1, column 2: " + matrix[1][2]);

        // 7. Arrays.copyOf() method
        int[] copyOfArray = java.util.Arrays.copyOf(intArray, 3);
        System.out.println("Copied Array: " + java.util.Arrays.toString(copyOfArray));

        // 8. Arrays.sort() method
        int[] unsortedArray = {5, 3, 8, 1, 2};
        java.util.Arrays.sort(unsortedArray);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(unsortedArray));
    }
}
