package ecommerce;

abstract class Product {
    private int productId;
    private String name;
    private int price;

    public Product(int productId, String name, int price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract double calculateDiscount();
    public abstract double calculateTax();

    public double calculateFinalPrice(Taxable taxCategory) {
        double discount = calculateDiscount();
        double tax = taxCategory.calculateTax();
        return price + tax - discount;
    }
}
