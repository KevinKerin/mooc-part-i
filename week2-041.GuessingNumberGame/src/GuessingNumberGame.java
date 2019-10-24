
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int userNumber, numberOfGuesses = 0;
        
        do{
            System.out.println("Guess a number: ");
            userNumber = reader.nextInt();
            numberOfGuesses++;
            
            if(numberDrawn > userNumber){
                System.out.println("The number is greater, guesses made: " + numberOfGuesses);
            } else if (numberDrawn < userNumber){
                System.out.println("The number is lesser, guesses made: " + numberOfGuesses);
            } else {
                System.out.println("Congratulations, your guess is correct!");
            }
        } while(numberDrawn != userNumber);

        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
