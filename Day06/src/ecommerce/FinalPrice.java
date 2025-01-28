package ecommerce;

import java.util.List;

class FinalPrice {
    public static void printFinalPrice(List<Product> products) {
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = product.calculateTax();  // Directly call the method

            // Final price calculation
            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Product: " + product.getName() + " | Final Price: " + finalPrice);
        }
    }
}
