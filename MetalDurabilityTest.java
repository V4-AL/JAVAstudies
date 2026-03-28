import java.util.Scanner;

public class MaterialDurabilityTest {
	public static void main(String[] args) {
		// Variables
		double structuralIntegrity = 100.0;
		int cycleCount = 0;
		final double FAILURE_THRESHOLD = 15.0;

		Scanner scanner = new Scanner(System.in);

		// The Loop
		while (structuralIntegrity > FAILURE_THRESHOLD) {
			cycleCount++;

			// Input
			System.out.print("Enter pressure force for Cycle " + cycleCount + ": ");
			double pressureForce = scanner.nextDouble();

			// Damage
			structuralIntegrity -= pressureForce;

			// The "Stress" - extra fatigue damage
			if (pressureForce > 20.0) {
				structuralIntegrity -= 5.0;
				System.out.println("High pressure detected! Additional fatigue damage applied.");
			}

			// Output after each cycle
			System.out.println("Remaining Structural Integrity: " + structuralIntegrity);
			System.out.println();
		}

		// Final Output
		System.out.println("Material Failure at Cycle " + cycleCount + "!");
		System.out.println("Final Integrity Level: " + structuralIntegrity);

		scanner.close();
	}
}