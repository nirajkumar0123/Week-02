package hospitalmanagementsystem;

import java.util.List;

public class PatientManagement {

    public static void createAndManagePatients(List<Patient> patients) {
        // Create patient instances
        Patient inPatient = new InPatient("P101", "Alice", 30, 2000, 5); // 5 days at 2000/day
        Patient outPatient = new OutPatient("P102", "Bob", 45, 500);    // Consultation fee: 500

        // Add medical records
        ((MedicalRecord) inPatient).addRecord("Admitted for surgery");
        ((MedicalRecord) outPatient).addRecord("Visited for a fever check-up");

        // Add patients to the list
        patients.add(inPatient);
        patients.add(outPatient);
    }
}

