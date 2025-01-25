package assistedproblems.employeemanagement;

public class Intern extends Employee {
    private int duration;

    public Intern(String name, int id, int salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    public void displayInternDetails() {
        System.out.println("Intern Details are as follows:");
        super.displayDetails();
        System.out.println("Intern duration: " + duration + " months");
    }
}

