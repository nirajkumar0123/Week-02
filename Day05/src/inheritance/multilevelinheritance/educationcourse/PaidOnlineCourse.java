package inheritance.multilevelinheritance.educationcourse;

public class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double calculateDiscountedFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayCourseInfo() {
        // Display basic course details
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Platform: " + platform);
        if (isRecorded) {
            System.out.println("Type: Recorded");
        } else {
            System.out.println("Type: Live");
        }
        // Display fee details
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discounted Fee: " + calculateDiscountedFee());
    }
}
