import java.util.Scanner;
class Student {
    private String name;
    private int age;
    private String grade;
    private String schoolName;
    public Student(String name, int age, String grade, String schoolName) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.schoolName = schoolName;
    }
    public void displayInfo() {
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("School: " + schoolName);
    }
}
public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student's age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter student's grade: ");
        String grade = scanner.nextLine();
        System.out.print("Enter student's school name: ");
        String schoolName = scanner.nextLine();
        Student student = new Student(name, age, grade, schoolName);
        student.displayInfo();
        scanner.close();
    }
}