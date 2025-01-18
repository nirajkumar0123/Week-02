import java.util.Scanner;

public class PalindromeChecker {
    //Attributes
    public String text;

    //constructor
    public PalindromeChecker(String text){
        this.text = text;
    }

    //Method to check text is palindrome or not
    public boolean isPalindrome(String text){
        //convert text to lowercase
         text = text.toLowerCase();

         int start = 0;
         int end = text.length() - 1;

         while(start < end){
            if(text.charAt(start) != text.charAt(end)){
                return false;
            }
            start++;
            end--;
         }
         return true;
    }

    //Display the result
    public void displayResult(){
        if(isPalindrome(text)){
            System.out.println("Text is palindrome");
        }else{
            System.out.println("Text is not palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Enter the text 
        System.out.println("Enter the String :");
        String text = input.nextLine();

        //create object 
        PalindromeChecker p1 = new PalindromeChecker(text);

        //Display the result 
        p1.displayResult();

        input.close();
    }
}
