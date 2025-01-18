public class BankAccount {
    //Attributes 
    private String accountHolder;
    private long accountNumber;
    private int balance;

    //constructor
    public BankAccount(String accountHolder, long accountNumber, int balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //Method to deposit money 
    public void depositMoney(int money){
        if(money <= 0){
            System.out.println("Invalid deposit amount");
        }
        else{
            balance += money;
        }
        System.out.println("Total money in account is :" + balance);
    }

    //Method to withdraw money
    public void withdrawMoney(int money){
        if(money > balance){
            System.out.println("Not insufficient amount to withdraw");
        }else{
            balance -= money;
        }
        System.out.println("Balance after withdrawl is : " +balance);

    }

    public void displayBalance(){
        System.out.println("current balance in the account is : "+balance);
    }
    public static void main(String[] args) {
        //Objects of BankAccount class
        BankAccount bank1 = new BankAccount("Raj", 0123456, 100000);
        
        //display currentbalance in account
        bank1.displayBalance();

        //deposit money 
        bank1.depositMoney(1000);

        //withdraw money
        bank1.withdrawMoney(2000);

        //display total currentBalance
        bank1.displayBalance();


    }
}
