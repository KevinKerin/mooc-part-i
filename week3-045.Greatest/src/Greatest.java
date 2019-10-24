
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int maxFirstTwo = Math.max(number1, number2);
        return Math.max(maxFirstTwo, number3);
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
        
        int resulta = greatest(22, 0, 3);
        System.out.println("Greatest: " + resulta);
        
        int resultb = greatest(2, 7, 300);
        System.out.println("Greatest: " + resultb);
        
        int resultc = greatest(7, 7, 3);
        System.out.println("Greatest: " + resultc);
    }
}
