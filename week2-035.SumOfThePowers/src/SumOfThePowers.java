
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int index = Integer.parseInt(reader.nextLine());
        int answer = 0;
        
        for (int i = index; i >= 0; i--) {
            answer += Math.pow(2, i);
        }
        
        System.out.println("The result is " + answer);
    }
}
