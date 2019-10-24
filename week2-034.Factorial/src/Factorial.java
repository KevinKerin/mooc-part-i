import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int factorial = Integer.parseInt(reader.nextLine());
        int answer = 1;
        
        for (int i = 1; i <= factorial; i++) {
            answer = answer * i;
        }
        
        System.out.println("Factorial is " + answer);
        
    }
}
