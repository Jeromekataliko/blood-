// TestBloodData.java
import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BloodData defaultBloodData = new BloodData();
        System.out.println("Default Blood Data:");
        displayBloodData(defaultBloodData);

        System.out.println("\nEnter blood type (O, A, B, AB): ");
        BloodType userBloodType = BloodType.valueOf(scanner.next().toUpperCase());
        System.out.println("Enter Rh factor (+ or -): ");
        BloodFactor userRhFactor = BloodFactor.valueOf(scanner.next().toUpperCase());

        BloodData userBloodData = new BloodData(userBloodType, userRhFactor);
        System.out.println("\nUser Blood Data:");
        displayBloodData(userBloodData);

        scanner.close();
    }

    private static void displayBloodData(BloodData bloodData) {
        System.out.println("Blood Type: " + bloodData.getBloodType());
        System.out.println("Rh Factor: " + bloodData.getRhFactor());
    }
}

