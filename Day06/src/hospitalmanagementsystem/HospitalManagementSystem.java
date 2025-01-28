package hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class HospitalManagementSystem {

    public static void main(String[] args) {
        // Create a list to hold patients
        List<Patient> patients = new ArrayList<>();

        // Create and manage patients
        PatientManagement.createAndManagePatients(patients);

        // Display billing details for all patients
        PatientBilling.displayBillingDetails(patients);
    }
}

