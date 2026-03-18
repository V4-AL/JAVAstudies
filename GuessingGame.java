import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            int numberToGuess = random.nextInt(100) + 1;// Generates a number between 1 and 100
            int GuessCount = 0;
            int userGuess;
            
            System.out.println("Welcome to the Guessing Game!");
            System.out.println("I have selected a number between 1 and 100. Can you guess it?");
            
            do {
                System.out.println("Your Guess : ");
                userGuess = scanner.nextInt();
                GuessCount ++;
                
                if (userGuess > numberToGuess){
                    System.out.println("Too High, Chump. Try Again! XD");
                }
                else if (userGuess < numberToGuess){
                    System.out.print("Too low, brosqito. Are you even trying??");
                }
            }
            while(userGuess != numberToGuess);
            
            System.out.println("Finally!!! About Damn time, chump");
            System.out.println("You made " + GuessCount + "Guesses (ToT)" );
        }
    }
}