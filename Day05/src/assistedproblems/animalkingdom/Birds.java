package assistedproblems.animalkingdom;

public class Birds extends Animal {
    public Birds(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: chirp! chirp!");
    }
}

