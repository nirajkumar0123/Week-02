import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
	
    public void displayProductInfo() {
        System.out.println("Product Name : " + name);
		System.out.println("Product Price: " + price);
    }
}

class Order {
    private int orderId;
    private ArrayList<Product> products; 
    private static int orderCounter = 1;

    public Order() {
        this.orderId = orderCounter++;
        this.products = new ArrayList<>();
    }

    // Method to add products to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrderInfo() {
        System.out.println("Order ID: " + orderId);
        for (Product product : products) {
            product.displayProductInfo();
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
	
	public int orderId(){
		return orderId;
	}
}

// Customer class representing a customer who places orders
class Customer {
    private String name;
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public Order placeOrder() {
        Order order = new Order();
        orders.add(order);
        System.out.println(name + " has placed an order with Order ID: " + order.orderId());
        return order;
    }

    // Method to display all orders placed by the customer
    public void displayCustomerOrders() {
        System.out.println(name + "'s Orders:");
        for (Order order : orders) {
            order.displayOrderInfo();
            System.out.println("Total Price: $" + order.calculateTotalPrice());
            System.out.println();
        }
    }
}

public class ECommerce {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("Laptop", 899.99);
        Product product2 = new Product("Smartphone", 499.99);
        Product product3 = new Product("Headphones", 89.99);
        
        // Create a customer
        Customer customer1 = new Customer("John Doe");

        // Customer places an order
        Order order1 = customer1.placeOrder();
        
        // Adding products to the first order
        order1.addProduct(product1);
        order1.addProduct(product2);

        // Customer places another order
        Order order2 = customer1.placeOrder();
        
        // Adding products to the second order
        order2.addProduct(product3);

        // Display customer's orders
        customer1.displayCustomerOrders();
    }
}
