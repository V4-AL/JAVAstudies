import java.util.Scanner;

public class CircuitBoardTest {
    public static void main(String[] args) {
        // Variables
        double boardHealth = 100.0;
        int spikeCount = 0;
        int userChoice = 1;
        
        Scanner scanner = new Scanner(System.in);
        
        // The Loop - do-while ensures at least one spike
        do {
            // Action: Increment spike count
            spikeCount++;
            
            // Prompt user for damage
            System.out.print("Enter damage for Spike " + spikeCount + ": ");
            double damage = scanner.nextDouble();
            
            // Subtract damage from board health
            boardHealth -= damage;
            
            // Output: Print remaining health after each spike
            System.out.println("Board Health after Spike " + spikeCount + ": " + boardHealth);
            System.out.println();
            
            // Health Check and User Input
            if (boardHealth > 0) {
                System.out.print("Continue testing? (1 for Yes, 0 for No): ");
                userChoice = scanner.nextInt();
                System.out.println();
            } else {
                // Board is fried, exit loop
                break;
            }
            
        } while (boardHealth > 0 && userChoice == 1);
        
        // Final Output
        System.out.println("Total spikes the board survived: " + spikeCount);
        
        if (boardHealth <= 0) {
            System.out.println("TEST TERMINATED: Component Destroyed.");
        }
        
        scanner.close();
    }
}