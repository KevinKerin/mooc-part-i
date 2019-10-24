
public class Main {

    public static void main(String[] args) {
        Multiplier threeMult = new Multiplier(3);
        Multiplier fourMult = new Multiplier(4);
        Multiplier twentyMult = new Multiplier(20);
        
        System.out.println(threeMult.multiply(6));
        System.out.println(twentyMult.multiply(9));
                
    }
}
