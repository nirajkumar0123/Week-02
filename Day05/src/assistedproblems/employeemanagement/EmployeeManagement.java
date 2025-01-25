package assistedproblems.employeemanagement;

public class EmployeeManagement {
    public static void main(String[] args) {
        Manager manager = new Manager("Niraj", 101, 100000, 10);
        Developer dev = new Developer("Abhii", 102, 50000, "Python");
        Intern intern = new Intern("Gautam", 103, 5000, 2);

        manager.displayManagerDetails();
        System.out.println();
        dev.displayDeveloperDetails();
        System.out.println();
        intern.displayInternDetails();
    }
}

