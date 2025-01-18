public class Item {
    //Attributes
    public int itemCode;
    public String itemName;
    public double price;

    //construtor
    public Item(int itemCode, String itemName, double price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    //display Item details
    public void displayDetails(){
        System.out.println("Item Details are :");
        System.out.println("Item Code is : " +itemCode);
        System.out.println("Item Name is : "+itemName);
        System.out.println("Item Price is : "+price);
    }

    public double calculateTotalCost(int quantity){
        if(quantity < 0){
            System.out.println("Invaid quantity"); 
            return 0.0;
        }
        else{
            return quantity * price;
        }
    }
    public static void main(String[] args) {
        //create object of Item class
        Item item1 = new Item(101, "Laptop", 75000.90);

        //display details of Item 
        item1.displayDetails();

        //total cost for a given quantity
        int quantity = 2;
        double totalCost = item1.calculateTotalCost(quantity);
        System.out.println("Total cost for quantity " + quantity + " is : " + totalCost);

    }
}
