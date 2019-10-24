
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class Exam {
    
    private ArrayList<Integer> array;
    private int accepted;
    
    public Exam(){
        array = new ArrayList<Integer>();
        accepted = 0;
    }
    
    public void newScore(Scanner scanner){
        int score = scanner.nextInt();
        if(score == -1){
            this.printScores();
        } else if(score >= 0 && score <= 60){
            if(score > 29){
                accepted++;
            }
            array.add(score);
            this.newScore(scanner);
        } else {
            this.newScore(scanner);
        }
    }
    
//    public void newScore(Scanner scanner){
//        int score = scanner.nextInt();
//        if(score >= 0 && score < 30){
//            grade0++;
//        } else if (score < 35){
//            grade1++;
//        } else if (score < 40){
//            grade2++;
//        } else if (score < 45){
//            grade3++;
//        } else if (score < 50){
//            grade4++;
//        } else if (score < 60){
//            grade5++;
//        } else {
//            
//        }
//    }
    
    public void printScores(){
        System.out.println("Grade distribution:");
            System.out.print("5: ");
            for (int i : array){
                if (i <= 60 && i >= 50){
                    System.out.print("*");
                }
            }
            System.out.println("\r");
            System.out.print("4: ");
            for (int i : array){
                if (i < 50 && i >= 45){
                    System.out.print("*");
                }
            }
            System.out.println("\r");
            System.out.print("3: ");
            for (int i : array){
                if (i < 45 && i >= 40){
                    System.out.print("*");
                }
            }
            System.out.println("\r");
            System.out.print("2: ");
            for (int i : array){
                if (i < 40 && i >= 35){
                    System.out.print("*");
                }
            }
            System.out.println("\r");
            System.out.print("1: ");
            for (int i : array){
                if (i < 35 && i >= 30){
                    System.out.print("*");
                }
            }
            System.out.println("\r");
            System.out.print("0: ");
            for (int i : array){
                if (i < 30 && i >= 0){
                    System.out.print("*");
                }
            }
            System.out.println("\r");
            System.out.println("Acceptance percentage: " + (double) 100 * accepted / array.size());
    }
    
}
