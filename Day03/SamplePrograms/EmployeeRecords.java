class Employee{
	private static int empid = 101;
	
	//static company name
	static String companyName = "capgemini";
	
	static int totalemployee = 0;
	
	//instance variable 
	private String empName;
	private final int empId;
	private String empDesignation;
	
	//constructor
	public Employee(String empName, String empDesignation){
		this.empName = empName;
		this.empId = empid++;
		this.empDesignation = empDesignation;
		totalemployee++;
	}
	
	//display total employees
	static void displayTotalEmployees(){
		System.out.println("Total Employee are : " + totalemployee);
	}
	
	public void displayEmployeeDetails(){
		if(this instanceof Employee){
			System.out.println("Employee Name : " + empName);
			System.out.println("Employee Id : " + empId);
			System.out.println("Employee Designation : " + empDesignation);
			System.out.println("Employee company : " + companyName);
		}
		else{
			System.out.println("This object is not instance of Book");
		}
	}
}


class EmployeeRecords{
	public static void main(String[] args){
		
		Employee emp1 = new Employee("Niraj", "HR");
		//display employee details
		
		emp1.displayEmployeeDetails();
		
		System.out.println();
		
		Employee emp2 = new Employee("Abhii", "Manager");
		emp2.displayEmployeeDetails();
		
		System.out.println();
		//display total employees
		Employee.displayTotalEmployees();
	}
	
}