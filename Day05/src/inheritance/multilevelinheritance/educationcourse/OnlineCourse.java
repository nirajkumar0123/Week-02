package inheritance.multilevelinheritance.educationcourse;

public class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    @Override
    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Platform: " + platform);
        if (isRecorded) {
            System.out.println("Type: Recorded");
        } else {
            System.out.println("Type: Live");
        }
    }
}

