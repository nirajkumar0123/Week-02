package inheritance.hierarchicalinheritance.schoolmanagementsystem;

// Subclass: Staff
class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
        displayInfo();
        System.out.println("Department: " + department);
    }
}

