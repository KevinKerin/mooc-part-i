
import java.util.Arrays;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 150; i++) {
            System.out.print(i + " times tables: ");
            for (int j = 1; j <= 120; j++) {
                System.out.print(i * j + " ");                
            }
            System.out.println("\r");
        }
        
    }
    
}
