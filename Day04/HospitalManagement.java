import java.util.ArrayList;

class Patient {
    private String name;
    private int id;
    private ArrayList<Doctor> doctors;

    public Patient(String name, int id) {
        this.name = name;
        this.id = id;
        this.doctors = new ArrayList<>();
    }

    // Add doctor to patient's list
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.addPatient(this); // Ensure bidirectional association
        }
    }

    public void displayDoctors() {
        System.out.println("Patient: " + name + " (ID: " + id + ") is consulting with:");
        for (Doctor doctor : doctors) {
            System.out.println("Dr. " + doctor.getName());
        }
    }

    public String getName() {
        return name;
    }
	
	public int getId(){
		return id;
	}
}

class Doctor {
    private String name;
    private int id;
    private ArrayList<Patient> patients;

    public Doctor(String name, int id) {
        this.name = name;
        this.id = id;
        this.patients = new ArrayList<>();
    }

    // Add patient to doctor's list
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Ensure bidirectional association
        }
    }

    // Communication -> Simulate a consultation
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            System.out.println("Dr. " + name + " has not been assigned to Patient " + patient.getName() + ".");
            return;
        }
        System.out.println("Dr. " + name + " is consulting Patient " + patient.getName() + ".");
    }

    public void displayPatients() {
        System.out.println("Dr. " + name + " (ID: " + id + ") is consulting with:");
        for (Patient patient : patients) {
            System.out.println(" - " + patient.getName());
        }
    }

    public String getName() {
        return name;
    }
	
	public int getId(){
		return id;
	 }
}

class Hospital {
    private String name;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(String doctorName, int doctorId) {
        Doctor doctor = new Doctor(doctorName, doctorId);
        doctors.add(doctor);
    }

    public void addPatient(String patientName, int patientId) {
        Patient patient = new Patient(patientName, patientId);
        patients.add(patient);
    }

    public Doctor findDoctorById(int id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                return doctor;
            }
        }
        return null;
    }

    public Patient findPatientById(int id) {
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                return patient;
            }
        }
        return null;
    }

    public void displayHospitalDetails() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            doctor.displayPatients();
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            patient.displayDoctors();
        }
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
	
        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Add doctors
        Doctor doctor1 = new Doctor("John Smith", 1);
        Doctor doctor2 = new Doctor("Emily Brown", 2);

        // Add patients
        Patient patient1 = new Patient("Alice Johnson", 101);
        Patient patient2 = new Patient("Bob Williams", 102);

        // Associate doctors and patients
        doctor1.addPatient(patient1);
        doctor2.addPatient(patient1);
        doctor2.addPatient(patient2);

        // Display details
        doctor1.displayPatients();
        doctor2.displayPatients();
        patient1.displayDoctors();
        patient2.displayDoctors();

        // Simulate consultations
        System.out.println("\nConsultations:");
        doctor1.consult(patient1); // Valid consultation
        doctor2.consult(patient2); // Valid consultation
        doctor1.consult(patient2); // Invalid consultation
    }
}
