package hospitalmanagementsystem;

import java.util.List;

public class PatientBilling {

    public static void displayBillingDetails(List<Patient> patients) {
        // Display patient details and billing dynamically using polymorphism
        System.out.println("Hospital Patient Management System:");
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Bill Amount: " + patient.calculateBill());

            if (patient instanceof MedicalRecord medicalRecord) {
                System.out.println("Medical Records: " + medicalRecord.viewRecords());
            }
            System.out.println("--------------------------------");
        }
    }
}

