package assistedproblems.animalkingdom;

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy", 7);
        Animal cat = new Cat("Katty", 2);
        Animal bird = new Birds("Sparrow", 1);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}

