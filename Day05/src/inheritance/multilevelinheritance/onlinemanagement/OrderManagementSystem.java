package inheritance.multilevelinheritance.onlinemanagement;

public class OrderManagementSystem {
    public static void main(String[] args) {
        // Create objects for each level
        Order order = new Order("O123", "2025-01-20");
        ShippedOrder shippedOrder = new ShippedOrder("O124", "2025-01-18", "TRK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder("O125", "2025-01-15", "TRK67890", "2025-01-22");

        // Display details for each
        System.out.println("Base Class - Order:");
        order.displayOrderDetails();
        System.out.println();

        System.out.println("Intermediate Class - ShippedOrder:");
        shippedOrder.displayOrderDetails();
        System.out.println();

        System.out.println("Derived Class - DeliveredOrder:");
        deliveredOrder.displayOrderDetails();
    }
}

