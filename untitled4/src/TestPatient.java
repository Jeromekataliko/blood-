import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating default Patient object
        Patient defaultPatient = new Patient();
        System.out.println("Default Patient Data:");
        displayPatient(defaultPatient);

        // Getting user input for patient details
        System.out.println("\nEnter patient ID number: ");
        int userIdNumber = scanner.nextInt();
        System.out.println("Enter patient age: ");
        int userAge = scanner.nextInt();

        // Creating BloodData object with default values
        BloodData defaultBloodData = new BloodData();
        Patient userPatient = new Patient(userIdNumber, userAge, defaultBloodData);
        System.out.println("\nUser Patient Data:");
        displayPatient(userPatient);

        scanner.close();
    }

    // Method to display patient data
    private static void displayPatient(Patient patient) {
        System.out.println("ID Number: " + patient.getIdNumber());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Blood Data:");
        BloodData bloodData = patient.getBloodData();
        System.out.println("  Blood Type: " + bloodData.getBloodType());
        System.out.println("  Rh Factor: " + bloodData.getRhFactor());
    }
}
