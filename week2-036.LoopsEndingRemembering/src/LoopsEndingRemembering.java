import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        boolean minusOne = false;
        double sum = 0;
        double counter = 0;
        double average = 0.00;
        int even = 0, odd = 0;
               
        
        System.out.println("Type numbers: ");
        do {
          int num = reader.nextInt();
          if(num >=0){
              sum += num;
              counter++;
              if(num % 2 == 0){
                even++;
              } else{
                odd++;
              }
          }
          if(num == -1){
              minusOne = true;
              average = sum / counter;
              System.out.println("Thank you and see you later!");
              System.out.println("The sum is " + (int) sum);
              System.out.println("How many numbers: " + (int) counter);
              System.out.println("Average: " + average);
              System.out.println("Even numbers: " + even);
              System.out.println("Odd numbers: " + odd);
          }
        } while (minusOne == false);
        
    }
}
