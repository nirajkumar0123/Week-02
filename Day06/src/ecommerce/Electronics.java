package ecommerce;

class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, int price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1; // 10% discount on Electronics
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% tax on Electronics
    }

    @Override
    public String getTaxDetails() {
        return "Tax for Electronics: 18%";
    }
}



