import java.util.Scanner;

public class Vehicle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle number: ");
        int vehicleNumber = sc.nextInt();

        System.out.print("Enter waste collected in kilograms: ");
        double wasteCollected = sc.nextDouble();

        System.out.print("Enter number of collection points: ");
        int collectionPoints = sc.nextInt();

        System.out.print("Enter vehicle status (Good/Bad): ");
        char vehicleStatus = sc.next().charAt(0);

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected: " + wasteCollected + " kg");
        
        System.out.println("Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);

        sc.close();
    }
}