
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
public class Database {
    
    private ArrayList<String> englishBirds;
    private ArrayList<String> latinBirds;
    private ArrayList<Integer> observations;
    
    public Database(){
        englishBirds = new ArrayList<String>();
        latinBirds = new ArrayList<String>();
        observations = new ArrayList<Integer>();
    }
    
    public void begin(Scanner reader){
        System.out.println("?");
        String str = reader.nextLine();
        if(str.equalsIgnoreCase("add")){
            add(reader);
            begin(reader);
        } else if (str.equalsIgnoreCase("observation")){
            observation(reader);
            begin(reader);
        } else if (str.equalsIgnoreCase("statistics")){
            statistics();
            begin(reader);
        } else if (str.equalsIgnoreCase("show")){
            show(reader);
            begin(reader);
        } else if (str.equalsIgnoreCase("quit")){
            
        } else {
            System.out.println("Command not recognised.");
            begin(reader);
        }
    }
    
    public void add(Scanner reader){
        System.out.println("Name: ");
        englishBirds.add(reader.nextLine());
        System.out.println("Latin Name: ");
        latinBirds.add(reader.nextLine());
        observations.add(0);
    }
    
    public void observation(Scanner reader){
        System.out.println("What was observed:? ");
        String bird = reader.nextLine();
        for (String str : englishBirds){
            if(str.trim().equalsIgnoreCase(bird)){
               int index = englishBirds.indexOf(str);
               observations.set(index, observations.get(index) + 1);
               return;
            }
        }
        System.out.println("Is not a bird!");
    }
    
    public void statistics(){
        for (int i = 0; i < englishBirds.size(); i++) {
            System.out.println(englishBirds.get(i) + " (" + latinBirds.get(i) + "): " + observations.get(i) + " observations");
        }
    }
    
    public void show(Scanner reader){
        System.out.println("What?");
        String search = reader.nextLine();
        for (String str : englishBirds){
            if(str.trim().equalsIgnoreCase(search)){
                int index = englishBirds.indexOf(str);
                System.out.println(englishBirds.get(index) + " (" + latinBirds.get(index) + "): " + observations.get(index) + " observations");
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
    
    
}
