
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        Database db = new Database();
        
        db.begin(reader);
        
    }

}
