package inheritance.hierarchicalinheritance.schoolmanagementsystem;

// Main class to test the hierarchy
public class SchoolSystem {
    public static void main(String[] args) {
        // Create instances of each role
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        Student student = new Student("Bob", 16, "10th Grade");
        Staff staff = new Staff("Charlie", 40, "Administration");

        // Display information about each role
        teacher.displayRole();
        System.out.println();

        student.displayRole();
        System.out.println();

        staff.displayRole();
    }
}

