package hospitalmanagementsystem;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis; // Sensitive data

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters and setters to encapsulate sensitive data
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }


    public abstract double calculateBill(); // Polymorphism: Different calculation for different patient types

    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}


