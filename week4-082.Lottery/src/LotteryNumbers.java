import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.random = new Random();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        for (int i = 0; i < 7; i++) {
            int num = (random.nextInt(39) + 1);
            if(containsNumber(num)){
                System.out.println(num + " already in list. Choosing another number");
               i--; 
            } else {
                numbers.add(num);
            }
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}
