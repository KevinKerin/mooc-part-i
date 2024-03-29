import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    /*
    num is 8, range is 1-10
    average is 5
    greater than 5? y 
    range now 6-10, average now 7
    greater than 7? y
    range now 8-10, average now 8
    greater than 8? n
    range now 7-8, average now 7
    
    
    */
    
    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);

        while(lowerLimit != upperLimit){
            int avg = average(lowerLimit, upperLimit);
            boolean question = isGreaterThan(avg);
            if(question){
                lowerLimit = avg+1;
            } else {
                upperLimit = avg;
            }
        }
        System.out.println("The number you're thinking of is " + lowerLimit);
        
    }

    public boolean isGreaterThan(int value){
        System.out.println("Is your number greater than " + value + "? (y/n)");
        char answer = reader.next().charAt(0);
        if(answer == 'y' || answer == 'n'){
            return answer == 'y';
        } else {
            System.out.println("Character not recognised.");
            return isGreaterThan(value);
        }
    }
    
    public int average(int num1, int num2){
        return (num1 + num2) / 2;
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
