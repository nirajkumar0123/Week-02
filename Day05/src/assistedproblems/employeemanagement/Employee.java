package assistedproblems.employeemanagement;

public class Employee {
    protected String name;
    protected int id;
    protected int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void displayDetails() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee salary: " + salary);
    }
}
