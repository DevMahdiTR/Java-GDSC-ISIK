package StringFunctions;

public class StringTest {
    public static void main(String[] args) {
        // Create a String
        String myString = "Hello, World!";

        // Test built-in methods
        System.out.println("Original String: " + myString);
        System.out.println("Length: " + myString.length());
        System.out.println("charAt(7): " + myString.charAt(7));
        System.out.println("substring(7, 12): " + myString.substring(7, 12));
        System.out.println("toLowerCase: " + myString.toLowerCase());
        System.out.println("toUpperCase: " + myString.toUpperCase());
        System.out.println("indexOf('o'): " + myString.indexOf('o'));
        System.out.println("lastIndexOf('o'): " + myString.lastIndexOf('o'));
        System.out.println("replace('o', '*'): " + myString.replace('o', '*'));
        System.out.println("startsWith(\"Hello\"): " + myString.startsWith("Hello"));
        System.out.println("endsWith(\"World!\"): " + myString.endsWith("World!"));
        System.out.println("contains(\"lo, \"): " + myString.contains("lo, "));
        System.out.println("trim: " + "    trim me    ".trim());
        System.out.println("equals(\"Hello, World!\"): " + myString.equals("Hello, World!"));
        System.out.println("equalsIgnoreCase(\"HELLO, WORLD!\"): " + myString.equalsIgnoreCase("HELLO, WORLD!"));
    }
}
