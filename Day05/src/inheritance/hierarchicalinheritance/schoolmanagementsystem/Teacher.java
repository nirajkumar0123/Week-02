package inheritance.hierarchicalinheritance.schoolmanagementsystem;

// Subclass: Teacher
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
        displayInfo();
        System.out.println("Subject: " + subject);
    }
}
