import java.util.ArrayList;

class Course {
    private String courseName;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.addCourse(this);
        }
    }

    public void displayEnrolledStudents() {
        System.out.println("Course: " + courseName);
        if (enrolledStudents.isEmpty()) {
            System.out.println("No students are enrolled in this course.");
        } else {
            System.out.println("Enrolled Students:");
            for (Student student : enrolledStudents) {
                System.out.println("- " + student.getName());
            }
        }
    }
}

class Student {
    private String name;
    private int id;
    private ArrayList<Course> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void displayCourses() {
	System.out.println("Student: " + name);
        if (courses.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            System.out.println("Enrolled Courses:");
            for (Course course : courses) {
                System.out.println("- " + course.getCourseName());
            }
        }
    }
}

class School {
    private String name;
    private ArrayList<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void displayStudents() {
        System.out.println("School: " + name);
        if (students.isEmpty()) {
            System.out.println("No students are enrolled in this school.");
        } else {
            System.out.println("Enrolled Students:");
            for (Student student : students) {
                System.out.println("- " + student.getName());
            }
        }
    }
}

public class SchoolManagement {
    public static void main(String[] args) {
        // Create school
        School school = new School("Greenwood International School");

        // Create students
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);
        Student student3 = new Student("Charlie", 103);

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course history = new Course("History");

        // Enroll students in courses
        math.enrollStudent(student1);
        math.enrollStudent(student2);

        science.enrollStudent(student1);
        science.enrollStudent(student3);

        history.enrollStudent(student2);

        // Display school students
        school.displayStudents();
        System.out.println();

        // Display courses for each student
        student1.displayCourses();
        System.out.println();
        student2.displayCourses();
        System.out.println();
        student3.displayCourses();
        System.out.println();

        // Display enrolled students for each course
        math.displayEnrolledStudents();
        System.out.println();
        science.displayEnrolledStudents();
        System.out.println();
        history.displayEnrolledStudents();
    }
}
