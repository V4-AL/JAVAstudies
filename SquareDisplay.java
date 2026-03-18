import java.util.Scanner;

public class SquareDisplay {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Square Display Program!");
            System.out.println("Please enter a number to display its square:");
            int choice = scanner.nextInt();
            
            displaySquare(choice);
        }
    }
    
    // Method to display a square of 'x' characters
    public static void displaySquare(int size) {
        System.out.println();
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}