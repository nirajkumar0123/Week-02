package ecommerce;

class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, int price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15; // 15% discount on Clothing
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12; // 12% tax on Clothing
    }

    @Override
    public String getTaxDetails() {
        return "Tax for Clothing: 12%";
    }
}
