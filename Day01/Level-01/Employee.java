public class Employee{
    //Attributes
    public String name;
    private int id;
    public int salary;
   
    // constructor
    public Employee(String name , int id , int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    //Method to display Employee details
    public void displayDetails(){
         System.out.println("Employee Details are : ");
         System.out.println("Employee Name :" +name);
         System.out.println("Employee id :" +id);
         System.out.println("Employee salary :" +salary);
    }

    public static void main(String[] args) {
        //Employee objects 
        Employee emp1 = new Employee("Niraj", 1, 50000);
        //Display details of employee
        emp1.displayDetails();
    }
}