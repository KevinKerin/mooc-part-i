
import com.sun.org.apache.xpath.internal.XPathVisitable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class Counter {
    
    private int startingValue;
    private boolean check;
    private int currentValue;
    
    public Counter(){
        this(0, false);
    }
    
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    
    public Counter(boolean check){
        this(0, check);
    }
    
    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        if(check){
            this.check = check;            
        }
        this.currentValue = startingValue;
    }

    public int value(){
        return currentValue;
    }
    
    public void increase(){
        currentValue++;
    }
    
    public void increase(int increaseAmount){
        if(increaseAmount > 0){
            currentValue = currentValue + increaseAmount;
        }
    }
    
    public void decrease(){
        if (!(check && currentValue == 0))
        currentValue--;
    }
    
    public void decrease(int decreaseAmount){
        if(check && decreaseAmount > currentValue){
            currentValue = 0;
        } else if(decreaseAmount < 0){
            
        } else {
            currentValue = currentValue - decreaseAmount;
        }
    }
    
}
