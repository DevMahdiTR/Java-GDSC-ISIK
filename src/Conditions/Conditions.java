package Conditions;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test case for if statement
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("You entered a positive number.");
        } else if (number < 0) {
            System.out.println("You entered a negative number.");
        } else {
            System.out.println("You entered zero.");
        }

        // Test case for switch statement
        System.out.print("Enter a day of the week (1-7): ");
        int dayOfWeek = scanner.nextInt();
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day of the week.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
