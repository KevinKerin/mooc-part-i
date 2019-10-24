import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        return reverse(text).equalsIgnoreCase(text);
    }
    
    public static String reverse(String text) {
        String reverse = "";
        for (int i = text.length()-1; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
