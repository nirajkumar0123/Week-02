import java.util.ArrayList;

// Course class representing a course in the university
class Course {
    private String courseName;
    private Professor professor;  // Aggregation with Professor (A professor teaches a course)
    private ArrayList<Student> students;  // Aggregation with Student (Students enroll in a course)

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Assign a professor to teach the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println(professor.getName() + " has been assigned to teach " + courseName);
    }

    // Enroll a student in the course
    public void enrollStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " has been enrolled in " + courseName);
    }

    // Display course details, including the professor and enrolled students
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "No professor assigned"));
        System.out.println("Enrolled Students:");
        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
        } else {
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

// Professor class representing a professor in the university
class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    // Get professor name
    public String getName() {
        return name;
    }

    // Method for a professor to teach a course
    public void teachCourse(Course course) {
        course.assignProfessor(this);
    }
}

// Student class representing a student in the university
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    // Get student name
    public String getName() {
        return name;
    }

    // Method for a student to enroll in a course
    public void enrollCourse(Course course) {
        course.enrollStudent(this);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        // Create some professors
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Create some students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Create some courses
        Course course1 = new Course("Computer Science 101");
        Course course2 = new Course("Mathematics 101");

        // Professors teach courses
        professor1.teachCourse(course1);
        professor2.teachCourse(course2);

        // Students enroll in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student1.enrollCourse(course2);

        // Display course details
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}
