
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the points [0-60]: ");
        int score = reader.nextInt();
        String grade = "";
        
        if(score <= 29){
            grade = "failed";
        } else if (score >= 30 && score <= 34) {
            grade = "1";
        } else if (score >= 35 && score <= 39) {
            grade = "2";
        } else if (score >= 40 && score <= 44) {
            grade = "3";
        } else if (score >= 45 && score <= 49) {
            grade = "4";
        } else if (score >= 50 && score <= 60) {
            grade = "5";
        } else {
            System.out.println("Error.");
        }
        
        System.out.println("Grade: " + grade);
        
    }
}
