class Employee {
    String empName;
    int empId;
    Employee(String name, int id) {
        this.empName = name;
        this.empId = id;
    }
    void displayDetails() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
    }
}
class Designation extends Employee {
    String empDesignation;
    Designation(String name, int id, String designation) {
        super(name, id); 
        this.empDesignation = designation;
    }
    @Override
    void displayDetails() {
        super.displayDetails(); 
        
        System.out.println("Employee Designation: " + empDesignation);
    }
}
public class Main {
    public static void main(String[] args) {
        Designation emp = new Designation("John Doe", 101, "Software Engineer");
        emp.displayDetails();
    }
}