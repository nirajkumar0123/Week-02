import java.util.ArrayList;

class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Add a new department
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Add an employee to a specific department
    public void addEmployeeToDepartment(String departmentName, String employeeName, int employeeId) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                department.addEmployee(employeeName, employeeId);
                return;
            }
        }
        System.out.println("Department not found: " + departmentName);
    }

    // Display company information
    public void displayCompanyInfo() {
        System.out.println("Company Name: " + name);
        for (Department department : departments) {
            department.displayDepartmentInfo();
        }
    }

    // Delete the company (remove all departments and their employees)
    public void deleteCompany() {
        departments.clear();
        System.out.println("Company \"" + name + "\" and all its departments and employees have been deleted.");
    }

    // Private inner class: Department
    private class Department {
        private String name;
        private ArrayList<Employee> employees;

        public Department(String name) {
            this.name = name;
            this.employees = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addEmployee(String employeeName, int employeeId) {
            employees.add(new Employee(employeeName, employeeId));
        }

        public void displayDepartmentInfo() {
            System.out.println("Department Name: " + name);
            System.out.println("Employees:");
            for (Employee employee : employees) {
                employee.displayEmployeeDetails();
            }
        }

        // Private inner class: Employee
        private class Employee {
            private String employeeName;
            private int employeeId;

            public Employee(String employeeName, int employeeId) {
                this.employeeName = employeeName;
                this.employeeId = employeeId;
            }

            public void displayEmployeeDetails() {
                System.out.println("  - Employee Name: " + employeeName + ", ID: " + employeeId);
            }
        }
    }
}

public class DepartmentComposition {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("Tech Solutions");

        // Add departments
        company.addDepartment("Engineering");
        company.addDepartment("Human Resources");

        // Add employees to departments
        company.addEmployeeToDepartment("Engineering", "Alice", 101);
        company.addEmployeeToDepartment("Engineering", "Bob", 102);
        company.addEmployeeToDepartment("Human Resources", "Charlie", 201);

        // Display company information
        company.displayCompanyInfo();

        // Delete the company
        System.out.println("\nDeleting the company...");
        company.deleteCompany();
    }
}
