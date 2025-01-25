package inheritance.hybridinheritance.restaurantmanagementsystem;

// Main class: RestaurantManagementSystem
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Create instances of Chef and Waiter
        Chef chef = new Chef("John", 101);
        Waiter waiter = new Waiter("Alice", 102);

        // Display information and perform duties
        chef.displayInfo();
        chef.performDuties();
        System.out.println();

        waiter.displayInfo();
        waiter.performDuties();
    }
}
