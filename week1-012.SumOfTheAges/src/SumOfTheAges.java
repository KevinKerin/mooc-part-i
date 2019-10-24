
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        String name1, name2; 
        String test;
        int age1, age2, combo;
        
        System.out.println("Type your name: ");
        name1 = reader.nextLine();
        
        System.out.println("Type your age: ");
        age1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type your name: ");
        name2 = reader.nextLine();
        
        System.out.println("Type your age: ");
        age2 = reader.nextInt();
        
        combo = age1 + age2;
        
        System.out.println(name1 + " and " + name2 + " are " + combo + " years old in total.");
    }
}
