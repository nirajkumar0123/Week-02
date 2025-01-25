package assistedproblems.employeemanagement;

public class Developer extends Employee {
    private String programmingLang;

    public Developer(String name, int id, int salary, String programmingLang) {
        super(name, id, salary);
        this.programmingLang = programmingLang;
    }

    public void displayDeveloperDetails() {
        System.out.println("Developer Details are as follows:");
        super.displayDetails();
        System.out.println("Programming language: " + programmingLang);
    }
}

