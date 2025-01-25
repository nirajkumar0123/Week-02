package assistedproblems.employeemanagement;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public void displayManagerDetails() {
        System.out.println("Manager Details are as follows:");
        super.displayDetails();
        System.out.println("Team size: " + teamSize);
    }
}

