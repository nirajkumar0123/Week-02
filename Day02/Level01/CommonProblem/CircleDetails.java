import java.util.Scanner;

class CircleDetails {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        Circle circle = new Circle(radius);

        circle.displayCircleDetails();

        input.close();
    }
}

class Circle {

    private double radius;

    // Default Constructor
    Circle() {
        this.radius = 1.0; // Default radius
        System.out.println("You are in default constructor. Default radius set to 1.0.");
    }

    // Parameterized Constructor
    Circle(double radius) {
        this(); // Call default constructor
        if (radius < 0) {
            System.out.println("Invalid radius. Setting to default value 1.0.");
            this.radius = 1.0;
        } else {
            this.radius = radius;
        }
        System.out.println("You are in parameterized constructor.");
    }

    // Display details of the circle
    public void displayCircleDetails() {
        System.out.println("Radius of Circle: " + radius);
    }
}
