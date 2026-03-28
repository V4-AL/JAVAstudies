public class WarehouseTemperatureSensor {
    
    public static void main(String[] args) {
        // Step 1: Setup
        double[] temperatures = {2.5, 3.0, 15.0, 4.2, -1.0, 22.0, 3.8, 5.0};
        double sum = 0.0;
        int validSensorCount = 0;
        
        System.out.println("=== Warehouse Temperature Sensor Analysis ===\n");
        
        // Step 2: The Loop - Iterate through all sensors
        for (int i = 0; i < temperatures.length; i++) {
            
            // Step 3: The Logic (The Filtering)
            if (temperatures[i] <= 10.0) {
                // Valid reading
                sum += temperatures[i];
                validSensorCount++;
            } else {
                // Invalid reading - Sensor Error
                System.out.println("Sensor " + i + ": " + temperatures[i] 
                                   + "°C - ERROR: Reading Ignored");
            }
        }
        
        // Step 4: Final Summary
        System.out.println("\n--- Final Summary ---");
        System.out.println("Total Valid Sensors Found: " + validSensorCount);
        
        if (validSensorCount > 0) {
            double average = sum / validSensorCount;
            System.out.printf("Final Average Temperature: %.2f°C%n", average);
        } else {
            System.out.println("No valid sensor readings found.");
        }
    }
}