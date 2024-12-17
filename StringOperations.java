public class StringOperations {
    public static void main(String[] args) {
        // String declarations and initialization
        String str1 = "Hello";
        String str2 = "Duke";
        String str3; // Uninitialized string

        // Concatenate str1 and str2
        str3 = str1 + " " + str2;

        // Display string values
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Concatenated String: " + str3);

        // Additional string operations
        System.out.println("Length of str3: " + str3.length());
        System.out.println("Uppercase str3: " + str3.toUpperCase());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
        System.out.println("Does str3 contain 'Duke'? " + str3.contains("Duke"));
    } // end method main
} // end class