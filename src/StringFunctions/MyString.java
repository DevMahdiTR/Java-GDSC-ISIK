package StringFunctions;

public class MyString {
    private char[] characters;

    // Constructors
    public MyString() {
        this.characters = new char[0];
    }

    public MyString(String str) {
        this.characters = str.toCharArray();
    }

    // Method to get the length of the string
    public int length() {
        return characters.length;
    }

    // Method to get the character at a specific index
    public char charAt(int index) {
        if (index < 0 || index >= characters.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return characters[index];
    }

    // Method to concatenate two strings
    public MyString concat(MyString str) {
        char[] result = new char[characters.length + str.length()];
        System.arraycopy(characters, 0, result, 0, characters.length);
        System.arraycopy(str.characters, 0, result, characters.length, str.length());
        return new MyString(new String(result));
    }

    // Method to compare two strings
    public int compareTo(MyString str) {
        int len1 = characters.length;
        int len2 = str.length();
        int lim = Math.min(len1, len2);

        for (int i = 0; i < lim; i++) {
            char c1 = characters[i];
            char c2 = str.charAt(i);
            if (c1 != c2) {
                return c1 - c2;
            }
        }

        return len1 - len2;
    }

    // Method to check if the string starts with a specified prefix
    public boolean startsWith(MyString prefix) {
        int prefixLength = prefix.length();
        if (prefixLength > characters.length) {
            return false;
        }

        for (int i = 0; i < prefixLength; i++) {
            if (characters[i] != prefix.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // Method to convert the string to lowercase
    public MyString toLowerCase() {
        char[] result = new char[characters.length];
        for (int i = 0; i < characters.length; i++) {
            result[i] = Character.toLowerCase(characters[i]);
        }
        return new MyString(new String(result));
    }

    // Method to convert the string to uppercase
    public MyString toUpperCase() {
        char[] result = new char[characters.length];
        for (int i = 0; i < characters.length; i++) {
            result[i] = Character.toUpperCase(characters[i]);
        }
        return new MyString(new String(result));
    }

    // Override toString to display the string
    @Override
    public String toString() {
        return new String(characters);
    }

    public static void main(String[] args) {
        MyString myString1 = new MyString("Hello");
        MyString myString2 = new MyString("World");

        // Example usage of the custom methods
        System.out.println("Length: " + myString1.length());
        System.out.println("charAt(2): " + myString1.charAt(2));
        System.out.println("concat: " + myString1.concat(myString2));
        System.out.println("compareTo: " + myString1.compareTo(myString2));
        System.out.println("startsWith: " + myString1.startsWith(new MyString("Hel")));
        System.out.println("toLowerCase: " + myString1.toLowerCase());
        System.out.println("toUpperCase: " + myString1.toUpperCase());
    }
}
