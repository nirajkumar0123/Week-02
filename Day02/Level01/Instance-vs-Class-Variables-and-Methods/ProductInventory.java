class ProductInventory {
    public static void main(String[] args) {

        // Taking hard coded values cause of multiple products
        Product product1 = new Product("Laptop", 75000.0);
        Product product2 = new Product("Smartphone", 35000.0);

        // Displaying product details
        System.out.println("\nProduct Details:");
        product1.displayProductDetails();
        product2.displayProductDetails();

        // Displaying total number of products
        System.out.println("\nTotal Products:");
        Product.displayTotalProducts();
    }
}

class Product {

    // Instance variable
    private String productName;
    private double price;

    // Class variables
    private static int totalProducts = 0; // Shared among all Product objects

    // Parameterized Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment totalProducts whenever a new Product is created
        System.out.println("A new product has been created: " + productName);
    }

    // Instance method
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}
