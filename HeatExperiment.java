import java.util.Scanner;

public class HeatExperiment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number of experiments
        System.out.print("Enter the number of experiments: ");
        int numExperiments = scanner.nextInt();
        
        // Variable to store the sum of all averages
        double totalAverage = 0;
        
        // Loop through each experiment
        for (int i = 1; i <= numExperiments; i++) {
            // Get temperature readings
            System.out.print("Experiment " + i + " - Enter morning temperature (°C): ");
            double morningTemp = scanner.nextDouble();
            
            System.out.print("Experiment " + i + " - Enter evening temperature (°C): ");
            double eveningTemp = scanner.nextDouble();
            
            // Calculate average temperature for this experiment
            double average = (morningTemp + eveningTemp) / 2;
            
            // Add to running total
            totalAverage += average;
            
            // Check if unstable and print status
            if (average > 100) {
                System.out.println("Experiment " + i + ": " + average + "°C - STATUS: UNSTABLE");
            } else {
                System.out.println("Experiment " + i + ": " + average + "°C - STATUS: NORMAL");
            }
        }
        
        // Calculate and display the grand average
        double grandAverage = totalAverage / numExperiments;
        System.out.println("\nFinal Grand Average: " + grandAverage + "°C");
        
        scanner.close();
    }
}