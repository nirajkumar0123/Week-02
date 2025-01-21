class CourseManagement {
    public static void main(String[] args) {
        // Setting the initial institute name
        Course.updateInstituteName("Global Learning Academy");

        // Creating Course objects
        Course course1 = new Course("Java Programming", "3 Months", 15000.0);
        Course course2 = new Course("Web Development", "4 Months", 20000.0);
        Course course3 = new Course("Data Science", "6 Months", 30000.0);

        // Displaying course details
        System.out.println("\nCourse Details:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();

        // Updating the institute name
        System.out.println("\nUpdating Institute Name...");
        Course.updateInstituteName("Tech Master Academy");

        // Displaying course details again with the updated institute name
        System.out.println("\nCourse Details After Institute Name Update:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();
    }
}

class Course {

    // Instance variables
    private String courseName;
    private String duration;
    private double fee;

    // Class variable
    private static String instituteName; // Shared among all Course objects

    // Parameterized Constructor
    public Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
        System.out.println("A new course has been created: " + courseName);
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: $" + fee);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute Name has been updated to: " + instituteName);
    }
}
