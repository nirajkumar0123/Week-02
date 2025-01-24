import java.util.ArrayList;

class University {
    private String name;
    private ArrayList<Department> departments; // Composition relationship

    University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    public void displayDepartments() {
        System.out.println(this.name + " departments:");
        if (departments.isEmpty()) {
            System.out.println("No departments available.");
            return;
        }
        for (Department department : departments) {
            System.out.println(department.getName());
        }
    }

    public void addFacultyToDepartment(String departmentName, Faculty faculty) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                department.addFaculty(faculty);
                return;
            }
        }
        System.out.println("Department not found: " + departmentName);
    }

    public void displayFacultiesInDepartment(String departmentName) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                department.displayFaculties();
                return;
            }
        }
        System.out.println("Department not found: " + departmentName);
    }

    // Delete the university (clears all departments)
    public void deleteUniversity() {
        departments.clear(); // All departments are removed
        System.out.println(this.name + " and all its departments have been deleted.");
    }

    // Inner class for Department to enforce composition
    private class Department {
        private String name;
        private ArrayList<Faculty> faculties; // Aggregation relationship

        Department(String name) {
            this.name = name;
            this.faculties = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addFaculty(Faculty faculty) {
            this.faculties.add(faculty);
        }

        public void displayFaculties() {
            System.out.println(this.name + " faculties:");
            if (faculties.isEmpty()) {
                System.out.println("No faculties in this department.");
                return;
            }
            for (Faculty faculty : faculties) {
                System.out.println(faculty.getName());
            }
        }
    }
}

class Faculty {
    private String name;

    Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class UniversityComposition {
    public static void main(String[] args) {
        // Create a university
        University university = new University("ABC University");

        // Add departments
        university.addDepartment("Maths");
        university.addDepartment("Physics");

        // Display departments
        university.displayDepartments();

        // Create faculties
        Faculty faculty1 = new Faculty("Dr. Neeraj");
        Faculty faculty2 = new Faculty("Dr. Harshit");
        Faculty faculty3 = new Faculty("Dr. Ananya");

        // Add faculties to departments
        university.addFacultyToDepartment("Maths", faculty1);
        university.addFacultyToDepartment("Maths", faculty2);
        university.addFacultyToDepartment("Physics", faculty2);
        university.addFacultyToDepartment("Physics", faculty3);

        // Display faculties in departments
        System.out.println();
        university.displayFacultiesInDepartment("Maths");
        university.displayFacultiesInDepartment("Physics");

        // Try to display faculties for a non-existent department
        System.out.println();
        university.displayFacultiesInDepartment("Chemistry");

        // Delete the university
        System.out.println("\nDeleting the University...");
        university.deleteUniversity();
        university = null;

        // Demonstrate that Faculty objects are still accessible
        System.out.println("\nFaculty objects remain independent:");
        System.out.println(faculty1.getName());
        System.out.println(faculty2.getName());
        System.out.println(faculty3.getName());
		
    }
}
