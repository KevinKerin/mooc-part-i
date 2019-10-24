
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<String>();
        
        while(true){
            System.out.println("Type a word: ");
            String str = reader.nextLine();
            if(arrayList.contains(str)){
                System.out.println("You gave the word " + str + " twice");
                break;
            }
            arrayList.add(str);
        }
        
    }
}
