/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class StringUtils {
    
    public StringUtils(){
        
    }
    
    public static boolean included(String word, String searched){
        searched = searched.trim().toUpperCase();
        word = word.trim().toUpperCase();
        if(word == null || searched == null){
            return false;
        }
        return word.contains(searched);
    }
    
}
