/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class LyyraCard {
    
    private double balance;

    public LyyraCard(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "The card has " + balance + " euros";
    }
    
    public void payEconomical(){
        if(balance < 2.5){
            
        } else {
            balance = balance - 2.5;           
        }
    }
    
    public void payGourmet(){
        if(balance < 4){
            
        } else {
            balance = balance - 4;           
        }
    }
    
    public void loadMoney(double amount){
        if (amount < 0){
            
        } else {
            balance += amount;
        }
        if(balance > 150){
            balance = 150;
        }
    }
    
}
