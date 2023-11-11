package ScannerExemple;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int userInteger = scanner.nextInt();

        // Prompt the user to enter a double
        System.out.print("Enter a double: ");
        double userDouble = scanner.nextDouble();

        // Prompt the user to enter a float
        System.out.print("Enter a float: ");
        float userFloat = scanner.nextFloat();

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char userChar = scanner.next().charAt(0); // Read the first character of the input

        // Prompt the user to enter a boolean
        System.out.print("Enter a boolean (true/false): ");
        boolean userBoolean = scanner.nextBoolean();

        // Clear the buffer before reading the next line
        scanner.nextLine();

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userString = scanner.nextLine();

        // Display the user input
        System.out.println("User Input - Integer: " + userInteger);
        System.out.println("User Input - Double: " + userDouble);
        System.out.println("User Input - Float: " + userFloat);
        System.out.println("User Input - Character: " + userChar);
        System.out.println("User Input - Boolean: " + userBoolean);
        System.out.println("User Input - String: " + userString);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
