package ecommerce;
import java.util.List;

class EcommerceSystem {
    public static void main(String[] args) {
        // Create products
        Product electronicProduct = new Electronics(101, "Laptop", 50000);
        Product clothingProduct = new Clothing(102, "T-Shirt", 1500);
        Product groceryProduct = new Groceries(103, "Rice", 200);

        // Showcasing polymorphism
        FinalPrice.printFinalPrice(List.of(electronicProduct, clothingProduct, groceryProduct));
    }
}
