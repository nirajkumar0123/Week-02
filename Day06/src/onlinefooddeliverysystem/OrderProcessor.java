package onlinefooddeliverysystem;

import java.util.List;

public class OrderProcessor {
    public static void processOrder(List<FoodItem> foodItems) {
        for (FoodItem foodItem : foodItems) {
            System.out.println(foodItem.getItemDetails());
            System.out.println("Total Price (Before Discount): " + foodItem.calculateTotalPrice());

            if (foodItem instanceof Discountable discountable) {
                discountable.applyDiscount(10); // Apply a 10% discount
                System.out.println(discountable.getDiscountDetails());
                System.out.println("Total Price (After Discount): " + foodItem.calculateTotalPrice());
            }

            System.out.println("--------------------------");
        }
    }
}

