import java.util.Scanner;
public class TEST {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int integers[] = {2,4,6,8,10,12,14,16,18,20};
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<integers.length; i++){
            sum += integers[i];
        }
        System.out.println("Sum: " + sum);

        double average = (double) sum / integers.length;
        System.out.println("Average: " + average);

        int factorial = 1;
        for(int i=11; i>1 ; --i){ 
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);

        System.out.println("Enter a number from 1 to 20, inclusive: ");
        int userInput = scanner.nextInt();
        
        int[] evenNumbers = new int[10];
        int index = 0;
        for(int i=1; i<=20; i++){
            if(i % 2 == 0){
                evenNumbers[index] = i;
                index++;
            }
        }
        System.out.println("Even numbers entered for calculations: ");
        for(int i=0; i<index; i++){
            System.out.print(evenNumbers[i] + ",");
        }
        System.out.println();

        int sum1 = 0;
        for(int i=0; i<index; i++){
            sum1 += evenNumbers[i];
        }  
        System.out.println("Sum of even numbers: " + sum1); 

        int factorial2 = 1;
        for(int i=userInput; i>1 ; --i){ 
            factorial *= i;
        }
        System.out.println("Factorial of " + userInput + ": " + factorial2);   
        
        double root= Math.sqrt(factorial2); 
        System.out.println("Square root of the factorial of the input happens to be: " + root);

        

        
        
        
        
        scanner.close();

    }

}