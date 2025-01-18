public class Student {
    //Attributes
    public String name;
    public int rollNumber;
    public int marks; 

    public Student(String name, int rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    
    //Method to calcualte the grade 
    public String calculateGrade(){
       if(marks >= 90){
        return "A";
       }
       else if(marks >= 75){
        return "B";
       }
       else if(marks >= 60){
        return "C";
       }
       else if(marks >= 50){
        return "D";
       }
       else{
        return "F(Fail)";
       }
    }

    //Method to display the student details and grade
    public void displayDetails(){
        System.out.println("Name : " +name);
        System.out.println("Roll number : "+rollNumber);
        System.out.println("Marks : " +marks);
        System.out.println("Grade : " +calculateGrade());
    }
    public static void main(String[] args) {
        //objects of student class
        Student s1 = new Student("Niraj", 1, 90);
        System.out.println("Student s1 details are : ");
        s1.displayDetails();

        Student s2 = new Student("Abhi", 2, 70);
        System.out.println("Student s2 details are : ");
        s2.displayDetails();
    }
}
