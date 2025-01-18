public class Circle {
    //Attributes
    public double radius;

    //constructor
    public Circle(double radius){
        this.radius = radius;
    }

    //calculate area  circle
    public double calculateArea(){
        return 3.14 * radius * radius;
    }

    //calculate circumference of circle
    public double calculateCircumference(){
        return 2 * 3.14 * radius;
    }

    //Method to display all the details
    public void displayDetails(){
        System.out.println("Radius of circle is : " + radius);
        System.out.println("Area of circle is : " +calculateArea());
        System.out.println("Circumference of circle is : " + calculateCircumference());
    }
    public static void main(String[] args) {
        //object of circle class
        Circle c1 =  new Circle(2);

        //display details of circle
        c1.displayDetails();

    }
}
