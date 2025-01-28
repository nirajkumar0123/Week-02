package onlinefooddeliverysystem;

class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge; // Non-veg items include additional charges
    private double discount;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        return ((getPrice() + additionalCharge) * getQuantity()) - discount;
    }

    @Override
    public void applyDiscount(double percentage) {
        discount = ((getPrice() + additionalCharge) * getQuantity()) * (percentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discount;
    }
}

