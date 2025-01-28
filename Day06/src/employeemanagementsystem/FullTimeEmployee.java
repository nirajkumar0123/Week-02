package employeemanagementsystem;

class FullTimeEmployee extends Employee implements Department{
    private int fixedSalary;
    private String department;

    public FullTimeEmployee(int employeeId, String name, int salary, int fixedSalary){
        super(employeeId, name, salary);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public int calculateSalary() {
        return fixedSalary;
    }
    @Override
    public void assignedDepartment(String departmentName){
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails(){
        return "Full-time Employee : - "+department;
    }
}