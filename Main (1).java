class Student {
    int rollno;
    String name;
    float fee;
    Student(int rollno, String name, float fee) {
        this.rollno = rollno;  // Assigning rollno
        this.name = name;      // Assigning name
        this.fee = fee;        // Assigning fee
    }
    void display() {
        System.out.println(rollno + " " + name + " " + fee); // Display rollno, name, and fee
    }
}
public class Main{
    public static void main(String args[]) {
        // Creating two Student objects
        Student s1 = new Student(111, "ankit", 5000f); 
        Student s2 = new Student(112, "sumit", 6000f);
        s1.display();
        s2.display();
    }
}
