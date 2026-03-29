import java.util.Scanner;

//  ElectricityBillCalculator - A program to help residents estimate their electricity bills
// based on individual appliance usage with surcharge calculation for high consumption.
public class ElectricityBillCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Variables to track totals
		double COST_PER_KWH = 0.20;
		double totalConsumption = 0.0;
		double totalCost = 0.0;

		// Get number of appliances from user
		System.out.println("Enter the total number of appliances: ");
		int n = scanner.nextInt();

		// Loop through each appliance to collect consumption and calculate cost
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter consumption 			(kWh) for Appliance " + i + ": ");
			double consumption = scanner.nextDouble();

			// Calculate base cost
			double baseCost = consumption * COST_PER_KWH;
			double finalCost = baseCost;
			boolean surchargeApplied = false;

			// Apply 15% surcharge if consumption exceeds 100 kWh
			if (consumption > 100) {
				finalCost = baseCost * 1.15;  // Add 15% surcharge
				surchargeApplied = true;
			}

			// Update running totals
			totalConsumption += consumption;
			totalCost += finalCost;

			// Display information for this appliance
			System.out.printf("  → Appliance #%d: %.2f kWh → $%.2f",
							  i, consumption, finalCost);

			if (surchargeApplied) {
				System.out.println(" [SURCHARGE APPLIED - High Consumption]");
			} else {
				System.out.println();
			}
		}

		// Display final totals
		
		System.out.println("BILLING SUMMARY");
		System.out.printf("Total Consumption: %.2f kWh%n", totalConsumption);
		System.out.printf("Total Cost:        $%.2f%n", totalCost);
		System.out.println("\nNote: A 15%% surcharge is applied to appliances consuming over 100 kWh.");

		scanner.close();
	}
}
