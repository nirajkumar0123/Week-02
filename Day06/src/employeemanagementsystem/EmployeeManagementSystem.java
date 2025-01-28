package employeemanagementsystem;

import java.util.ArrayList;

class EmployeeManagementSystem{
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        FullTimeEmployee fulltime = new FullTimeEmployee(1, "Niraj", 1000, 10000);
        fulltime.assignedDepartment("HR");
        employees.add(fulltime);

        PartTimeEmployee parttime = new PartTimeEmployee(2, "Abhii", 10000, 500, 10);
        parttime.assignedDepartment("Sales");
        employees.add(parttime);

        //Display the employee Details
        for(Employee employee : employees){
            employee.displayDetails();
            System.out.println();
        }
    }
}
