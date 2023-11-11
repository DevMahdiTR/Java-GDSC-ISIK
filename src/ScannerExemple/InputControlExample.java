package ScannerExemple;

import java.util.Scanner;

public class InputControlExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            System.out.print("Enter a positive number: ");
            userInput = scanner.nextInt();
            if (userInput <= 0)
                System.out.println("Invalid input! Please enter a positive integer.");

        } while (userInput <= 0);

        System.out.println("You entered: " + userInput);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
