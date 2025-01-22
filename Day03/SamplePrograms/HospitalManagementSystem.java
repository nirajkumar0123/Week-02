class Patient {
	private static int patientCounter = 101;
	//static variable
    static String hospitalName = "Hope Hospital";
    private static int totalPatients = 0; 
	
    private final int patientID; 
	
	//instance variable
    private String name;
    private int age;
    private String ailment;
	
    // Constructor to initialize instance variables
	public Patient(String name, int age, String ailment) {
        this.patientID = patientCounter++;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
	}
	
    // Static method to get total patients
    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
	}
	
    // Method to display patient details
    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital Name: " + hospitalName);
			} else {
            System.out.println("This object is not an instance of Patient.");
		}
	}
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
	
        Patient patient1 = new Patient("Alice", 30, "Fever");
        Patient patient2 = new Patient("Bob", 40, "Cold");
		
        // Displaying details of patients
        patient1.displayDetails();
        System.out.println();
        patient2.displayDetails();
		
		System.out.println();
        
        // Display total patients admitted
        Patient.getTotalPatients();
	}
}
