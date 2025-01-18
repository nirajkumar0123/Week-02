import java.util.Scanner;

public class CartItem {
    //Attributes
    public String itemName;
    public double price;
    public int quantity;
    public boolean isAdded;

    //constructor
    public CartItem(String itemName, double price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.isAdded = false;
    }

    //Method to add item to the cart
    public void addItemToCart(){
        if(isAdded){
            System.out.println("Item is already added to the cart! "+this.itemName);
        }
        else{
            isAdded = true;
            System.out.println("Item added to the cart: " + this.itemName);
        }
    }

    //Remove item from the cart
    public void removeItem(){
        if(isAdded){
            isAdded = false;
            System.out.println("Item removed from the cart: " + this.itemName);
        }else{
            System.out.println("Item is not in the cart!");
        }
    }

    //Method to find TotalCost
    public void displayCost(){
        if (isAdded) {
            System.out.println("Total cost for " + this.itemName + " is: " + (quantity * price));
        } else {
            System.out.println("No items in the cart to display cost.");
        }
    }

    public static void main(String[] args) {
        //Scanner object
        Scanner input = new Scanner(System.in);

        //Enter the itemName
        System.out.println("Enter the itemName : ");
        String itemName = input.nextLine();
        
        //Enter the price of item
        System.out.println("Enter the price : ");
        double price = input.nextDouble();

        //Enter the quantity
        System.out.println("Enter the quantity of item : ");
        int quantity = input.nextInt();

        //create object of CartItem class
        CartItem cart = new CartItem(itemName, price, quantity);

        //add item to cart
        cart.addItemToCart();

        //remove item from cart
        cart.removeItem();

        //Total cost of cart
        cart.displayCost();

        input.close();
    }
}
