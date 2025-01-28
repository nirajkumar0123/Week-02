package employeemanagementsystem;

class PartTimeEmployee extends Employee implements Department{
    private int hoursWorked;
    private int hourRate;
    private String department;

    public PartTimeEmployee(int employeeId, String name, int salary, int hourlyRate, int hoursWorked){
        super(employeeId, name, salary);
        this.hourRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public int calculateSalary(){
        return hoursWorked * hourRate;
    }
    @Override
    public void assignedDepartment(String departmentName){
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails(){
        return "Part-time Employee : - "+department;
    }
}
