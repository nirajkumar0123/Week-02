public class MobilePhone {
    //Attributes
    public String brand;
    public String model;
    public double price;

    //constructor
    public MobilePhone(String brand, String model , double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    //Method to show all the details of phone
    public void displayDetails(){
        System.out.println("Details of phone are : ");
        System.out.println("Brand : " +brand);
        System.out.println("Model : "+model);
        System.out.println("price : "+price);
    }


    public static void main(String[] args) {
        //objects of class MobilePhone
        MobilePhone mob1 = new MobilePhone("oppo", "oppoA1", 20000);

        //display details of Mobile phone 
        mob1.displayDetails();
    }
}
