package inheritance.hybridinheritance.restaurantmanagementsystem;

// Subclass: Chef
public class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing food in the kitchen.");
    }
}

