package inheritance.multilevelinheritance.educationcourse;

public class CourseManagementSystem {
    public static void main(String[] args) {
        // Base class object
        Course basicCourse = new Course("Introduction to Programming", 10);

        // Intermediate class object
        OnlineCourse onlineCourse = new OnlineCourse("Java Fundamentals", 20, "Coursera", true);

        // Derived class object
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Data Science with Python", 40, "edX", true, 300.0, 20.0);

        // Display details for each course
        System.out.println("Base Class - Course:");
        basicCourse.displayCourseInfo();
        System.out.println();

        System.out.println("Intermediate Class - OnlineCourse:");
        onlineCourse.displayCourseInfo();
        System.out.println();

        System.out.println("Derived Class - PaidOnlineCourse:");
        paidOnlineCourse.displayCourseInfo();
    }
}
