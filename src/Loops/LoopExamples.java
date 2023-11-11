package Loops;

public class LoopExamples {
    public static void main(String[] args) {
        // Example of a for loop
        System.out.println("Example of a for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // Example of a while loop
        System.out.println("\nExample of a while loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration " + j);
            j++;
        }

        // Example of a do-while loop
        System.out.println("\nExample of a do-while loop:");
        int k = 1;
        do {
            System.out.println("Iteration " + k);
            k++;
        } while (k <= 5);
    }
}
