
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number");
        double a = reader.nextDouble();
        System.out.println("Type another number");
        double b = reader.nextDouble();
        double answer = a / b;
        
        System.out.println("Division: " + a + " / " + b + " = " + answer);
    }
}
