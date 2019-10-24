import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        Exam exam = new Exam();
        
        System.out.println("Type exam scores, -1 completes");
        
        exam.newScore(reader);
        
        
    }
}
