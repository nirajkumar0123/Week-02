// Base class Student
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Setter for CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

// Subclass PostgraduateStudent to demonstrate protected member access
class PostgraduateStudent extends Student {

    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Method to access and display the protected name member
    public void displayStudentName() {
        System.out.println("Student Name: " + name);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {

        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "Alice", 8.5);

        // Access public and protected members
        System.out.println("Roll Number: " + pgStudent.rollNumber);
        pgStudent.displayStudentName();

        // Access private member through getter
        System.out.println("CGPA: " + pgStudent.getCGPA());

        // Modify private member through setter
        pgStudent.setCGPA(9.0);
        System.out.println("Updated CGPA: " + pgStudent.getCGPA());
    }
}
