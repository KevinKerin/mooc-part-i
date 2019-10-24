
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
public class Phonebook {
    
    private ArrayList<Person> array;
    
    public Phonebook(){
        array = new ArrayList<Person>();
    }
    
    public void add(String name, String phoneNumber){
        Person newPerson = new Person(name, phoneNumber);
        array.add(newPerson);
    }
    
    public void printAll(){
        for (Person p : array){
            System.out.println(p);
        }
    }
    
    public String searchNumber(String name){
        for (Person p : array){
            if(p.getName().equalsIgnoreCase(name)){
                return p.getNumber();
            }
        } return "number not known";
    }
    
}
