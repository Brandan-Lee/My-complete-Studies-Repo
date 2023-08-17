/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Spider
 */
public class Song {
    
    private String name;
    private int lengthInSeconds;
    
    public Song (String name, int length){
        this.name = name;
        this.lengthInSeconds = length;
    }//end Song
    
    public String name(){
        return name;
    }//end name
    
    public int length(){
        return lengthInSeconds;
    }
}//end class
