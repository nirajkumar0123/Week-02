
class BankAccount{
	
  private static int accountCounter = 10001;
  
  //static variables
  static String bankName = "SBI";
  static int totalaccounts = 0;
  
  //instance variables
  private String accountHolderName;
  private final int accountNumber;
  
  //constructor
  public BankAccount(String accountHolderName){
      this.accountHolderName = accountHolderName;
	  this.accountNumber = accountCounter++;
	  totalaccounts++;
  }
  
  //getTotal number of accounts
  static void getTotalAccounts(){
     System.out.println("Total Accounts : " + totalaccounts);
  }
  
  
  public void displayDetails(){
   if(this instanceof BankAccount){
     System.out.println("Bank Name : " + bankName);
	 System.out.println("AccountHolder Name : " + accountHolderName);
	 System.out.println("AccountHolder : " + accountNumber);
   }
   
   else{
   System.out.println("This object is not instance of BankAccount");
   }
  }
  
}

class BankAccountSystem{
  public static void main(String[] args){
     BankAccount account1 = new BankAccount("Niraj");
	 //displayDetails of account1
	 account1.displayDetails();
	 
	 System.out.println();
	 
	 
	 BankAccount account2 = new BankAccount("Abhii");
	 account2.displayDetails();
	 
	 System.out.println();
	 
	 
	 //display total accounts 
	 BankAccount.getTotalAccounts();
  }
}