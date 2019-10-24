
import java.util.InputMismatchException;
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
public class NewClass {
    
    public static void main(String[] args) {
       
        root();
        //array();
        //sum();
        
           
    }
    
    public static void sum(){
        Scanner reader = new Scanner(System.in);
        
        try {
            System.out.println("Enter a number: ");
            int num1 = reader.nextInt();

            System.out.println("Enter another number: ");
            int num2 = reader.nextInt();

            int sum = num1 + num2;
        
            System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
            
            
        } catch (InputMismatchException ex){
            
            System.out.println(ex.getMessage() + "\n");
            System.out.println("Error: try again \n");
            sum();
            
        }
    }
    
    public static void array(){
        
        Scanner reader = new Scanner(System.in);
                
        int[] array = new int[100];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        
        System.out.println("Array successfully created.");
        
        try {
            System.out.println("Enter a number between 0-99 to search our array: ");
            int index = Integer.parseInt(reader.nextLine());
            System.out.println("You chose index " + index + ". Number at this index: " + array[index]);
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Index out of bounds exception thrown. Enter a number between 0-99");
        }

        
    }
    
    public static void root() throws NullPointerException {
        
        try {
            
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = reader.nextInt();
            
            if(num < 0){
                throw new ArithmeticException("Number cannot be negative");
            }
        
            double root = Math.sqrt(num);
            System.out.println("Square root of " + num + " is " + root);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage() + " here");
            System.out.println("test");
        }
        
        
        
    }
    
}
