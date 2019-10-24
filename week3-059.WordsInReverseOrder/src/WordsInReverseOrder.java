import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) {
            System.out.println("Type a word: ");
            String newWord = reader.nextLine();
            if(newWord.isEmpty()){
                Collections.reverse(words);
                System.out.println("You typed the following words: ");
                for (String str : words){
                    System.out.println(str);
                }
                break;
            }
            words.add(newWord);
        }
        
    }
}