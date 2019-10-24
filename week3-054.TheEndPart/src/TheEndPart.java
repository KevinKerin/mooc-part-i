import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        
        System.out.println("Length of the end part: ");
        int substr = reader.nextInt();
        
        try {
           System.out.println("Result: " + word.substring(word.length()-(substr)));
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Index is bigger than word length. Try smaller number");
        }
    }
}  
        
   
    

