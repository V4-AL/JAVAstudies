import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        String[] colorOptions = {"Red", "Green", "Blue", "Orange", "Yellow"};
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            int scoreCount=0;
            int index = random.nextInt(colorOptions.length);
            String selectedColor = colorOptions[index];
            selectedColor = colorOptions[random.nextInt(colorOptions.length)];
            int GuessCount = 0;
            System.out.println("Welcome To ESP Game, by yours truly!!!!!!!");
            System.out.println("I have selected a color from the following options: Red, Green, Blue, Orange, Yellow");
            System.out.println("Can you guess the color I have selected?");
           
        
            while (GuessCount <= 10){
                System.out.println("Your Guess : ");
                GuessCount++;
                
                
                String userGuess = scanner.nextLine();

                if(userGuess.equalsIgnoreCase(selectedColor)) {
                    System.out.println("Well Done, Brosquito");
                    scoreCount++;
                }else {
                    System.out.println("Incorrect");
                }

            }
            System.out.println("Your Score is: " + scoreCount);
            
        }
    }
    
}
