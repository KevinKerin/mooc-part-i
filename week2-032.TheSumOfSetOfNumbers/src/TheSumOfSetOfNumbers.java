
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        
        System.out.println("Until what? ");
        int cap = Integer.parseInt(reader.nextLine());
        
        for (int i = 0; i <= cap; i++) {
            sum += i;         
        }
        
        System.out.println("Sum is " + sum);
        
    }
}
