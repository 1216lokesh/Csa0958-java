import java.util.Scanner;
public class MultiplesOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number : ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number : ");
        int end = scanner.nextInt();
        if (start < 30 || end > 50 || start > end) {
            System.out.println("Invalid range. Please enter numbers between 30 and 50 with start <= end.");
        } else {
            System.out.println("Multiples of 3 between " + start + " and " + end + ":");
            for (int i = start; i <= end; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }
        scanner.close();
    }
}
