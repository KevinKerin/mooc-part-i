
public class Accounts {

    public static void main(String[] args) {
        
        Account a = new Account("kevin", 100);
        Account b = new Account("michael", 0);
        Account c = new Account("c", 0);
        
        transfer(a, b, 50);
        transfer(b, c, 25);
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        
   }
    
    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);        
    }
}
