class Student {
	//static variables
    static String universityName = "TIT University";
    static int totalStudents = 0;
    
	//instance variable
    private final int rollNumber;
    private String name;
    private String grade;
	
	
    //construtor
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
	}
    
	//display total number of students 
    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
	}
    
	//display student details
    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("Student Roll Number: " + rollNumber);
            System.out.println("Student Name: " + name);
            System.out.println("Student Grade: " + grade);
            System.out.println("Student University: " + universityName);
			} else {
            System.out.println("This object is not an instance of Student.");
		}
	}
    
	//method to upgrade the grade of student
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
			} else {
            System.out.println("This object is not an instance of Student.");
		}
	}
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice", "A");
        Student student2 = new Student(102, "Bob", "B");
        
		//display details
        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
        System.out.println();
		
        student1.updateGrade("A+");
        student2.updateGrade("B+");
		
		System.out.println("After Grade upgradation :");
		System.out.println();
		
		//display details
        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
        System.out.println();
		
        System.out.println();
        Student.displayTotalStudents();
	}
}
