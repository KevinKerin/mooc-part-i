/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class NightSky {
    
    private double density;
    private int height;
    private int width;
    private int starsCounter;
    
    public NightSky(double density, int width, int height){
        this.density = density;
        this.height = height;
        this.width = width;
        this.starsCounter = 0;
    }
    
    public NightSky(double density){
        this(density, 20, 10);
    }
    
    public NightSky(int width, int height){
        this(0.1, width, height);
    }
    
    public void printLine(){
        for (int i = 0; i < width; i++) {
            if(Math.random() <= density){
                starsCounter++;
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public void print(){
        starsCounter = 0;
        for (int i = 0; i < height; i++) {
            printLine();
            System.out.println("\r");
        }
    }
    
    public int starsInLastPrint(){
        return starsCounter;
    }
    
}
