
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account kevin = new Account("Kevin", 100);
        kevin.deposit(20);
        System.out.println(kevin.toString());
    }

}
