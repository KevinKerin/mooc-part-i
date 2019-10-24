
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int length, amount;
        
        System.out.println("Welcome to the seed generator");
        PasswordRandomizer randomizer = new PasswordRandomizer(81);
        System.out.println("How many seeds would you like?");
        amount = reader.nextInt();
        for (int i = 0; i < amount; i++) {
            if(i < 9){
                System.out.println("Seed  " + (i+1) + ": " + randomizer.createPassword());
            } else {
                System.out.println("Seed " + (i+1) + ": " + randomizer.createPassword());
            }
        }
    }
}
