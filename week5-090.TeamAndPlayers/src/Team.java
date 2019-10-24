
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class Team {
    
    private String name;
    private ArrayList<Player> list;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        list = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return name;
    }
    
    public void addPlayer(Player player){
        if(list.size() < maxSize){
            list.add(player);
        }
    }
    
    public void printPlayers(){
        for (Player pl : list){
            System.out.println(pl);
        }
    }
    
    public void setMaxSize(int size){
        this.maxSize = size;
    }
    
    public int size(){
        return list.size();
    }
    
    public int goals(){
        int goals = 0;
        for(Player pl : list){
            goals += pl.goals();
        }
        return goals;
    }
    
}
