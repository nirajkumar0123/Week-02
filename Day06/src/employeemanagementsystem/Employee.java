package employeemanagementsystem;

abstract class Employee {
    private int employeeId;
    private String name;
    private int salary;

    public Employee(int employeeId, String name, int salary){
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }
    //abstract method
    abstract int calculateSalary();

    public int getId(){
        return employeeId;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public void displayDetails(){
        System.out.println("Employee Id : " +employeeId);
        System.out.println("Employee Name : " +name);
        System.out.println("Employee baseSalary : " + salary);
        System.out.println("Calculate Salary   : "+calculateSalary());
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
}



