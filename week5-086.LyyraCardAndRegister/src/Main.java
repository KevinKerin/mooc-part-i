public class Main {
    public static void main(String[] args) {
        CashRegister unicafeExactum = new CashRegister();
        System.out.println( unicafeExactum );

        LyyraCard cardOfJim = new LyyraCard(10);

        System.out.println(cardOfJim.pay(8));
    }
}
  