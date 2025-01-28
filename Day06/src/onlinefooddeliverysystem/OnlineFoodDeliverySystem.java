package onlinefooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Create food items
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 200, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 300, 1, 50);

        // Add items to the list
        List<FoodItem> foodItems = new ArrayList<>();
        foodItems.add(vegItem);
        foodItems.add(nonVegItem);

        // Process the order
        System.out.println("Processing Order:");
        OrderProcessor.processOrder(foodItems);
    }
}
