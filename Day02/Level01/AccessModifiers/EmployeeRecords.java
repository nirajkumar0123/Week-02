// Base class Employee
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be greater than zero.");
        }
    }
}

// Subclass Manager to demonstrate access to public and protected members
class Manager extends Employee {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

// Main class to test the functionality
public class EmployeeRecords {
    public static void main(String[] args) {
        // Create an instance of Manager
        Manager manager = new Manager(101, "IT", 75000.00);

        // Access public and protected members
        manager.displayEmployeeDetails();

        // Access private member through getter
        System.out.println("Salary: " + manager.getSalary());

        // Modify private member through setter
        manager.setSalary(80000.00);
        System.out.println("Updated Salary: " + manager.getSalary());
    }
}
