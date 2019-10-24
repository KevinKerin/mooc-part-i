/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class Player {
    
    private String name;
    private int goalsScored;

    public Player(String name){
        this(name, 0);
    }
    
    public Player(String name, int goalsScored) {
        this.name = name;
        this.goalsScored = goalsScored;
    }
    
    
    public String getName(){
        return name;
    }
    
    public int goals(){
        return goalsScored;
    }

    @Override
    public String toString() {
        return (name + ", goals " + goalsScored);
    }
    
    
    
}
