import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        System.out.println("First character: " + firstCharacter(reader.nextLine()));
    }
    
    public static char firstCharacter(String str){
        return str.charAt(0);
    }
    
}
