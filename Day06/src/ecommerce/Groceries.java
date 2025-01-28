package ecommerce;

class Groceries extends Product {
    public Groceries(int productId, String name, int price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount on Groceries
    }

    @Override
    public double calculateTax() {
        return 0;
    }
}
