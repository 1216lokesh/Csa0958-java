import java.util.Scanner;
public class HexToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.nextLine();
        try {
            int decimal = Integer.parseInt(hex, 16); // base 16 for hexadecimal
            System.out.println("The decimal equivalent is: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid hexadecimal number entered.");
        }
        scanner.close();
    }
}
