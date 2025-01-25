package assistedproblems.animalkingdom;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden
    public abstract void makeSound();
}

