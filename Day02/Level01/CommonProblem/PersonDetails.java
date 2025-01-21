import java.util.Scanner;

class PersonDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Name of the Person : ");
        String name = input.next();
        System.out.print("Enter the Age of the Person : ");
        int age = input.nextInt();
        System.out.print("Enter the Gender of the Person (M/F/O): ");
        char gender = input.next().charAt(0);

        Person person1 = new Person();

        Person person2 = new Person(name, age, gender);

        Person person3 = new Person(person2);
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    // Default Constructor
    Person() {
        System.out.println("You are in default constructor.");
    }

    // Parameterized Constructor
    Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("You are in parameterized constructor.");
        System.out.println(name + " has is " + age + " old is " + gender);
    }

    // Copy Constructor
    Person(Person person) {
        name = person.name;
        age = person.age;
        gender = person.gender;
        System.out.println("You are in copy Constructor.");
        System.out.println(name + " has is " + age + " old is " + gender);
    }

}