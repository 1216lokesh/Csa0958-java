import java.util.Scanner;

// Class to represent a Student
class Student {
    // Instance variables
    private String name;
    private int[] marks;
    private int totalMarks;
    private char grade;

    // Constructor to initialize the Student object
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        this.totalMarks = calculateTotalMarks();
        this.grade = calculateGrade();
    }

    // Method to calculate total marks
    private int calculateTotalMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    // Method to calculate grade based on total marks
    private char calculateGrade() {
        double average = totalMarks / (double) marks.length;

        if (average >= 90) {
            return 'A';
        } else if (average >= 75) {
            return 'B';
        } else if (average >= 50) {
            return 'C';
        } else {
            return 'D';
        }
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Grade: " + grade);
    }
}

// Main class
public class TestResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking student details
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the number of tests: ");
        int testCount = scanner.nextInt();
        int[] marks = new int[testCount];

        // Taking test marks as input
        for (int i = 0; i < testCount; i++) {
            System.out.print("Enter marks for test " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Create a Student object using the constructor
        Student student = new Student(name, marks);

        // Display the student's total marks and grade
        student.displayInfo();

        scanner.close();
    }
}