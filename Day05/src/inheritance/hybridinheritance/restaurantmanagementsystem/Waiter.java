package inheritance.hybridinheritance.restaurantmanagementsystem;

// Subclass: Waiter
public class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving food to customers.");
    }
}
