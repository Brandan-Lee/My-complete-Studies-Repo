/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Spider
 */
public class Gauge {
    
    private int value;
    
    public Gauge(){
        this.value = 0;
    }
    
    public void increase(){
        if (value < 5){
            value++;
        }
    }//end increae
    
    public void decrease(){
        if (value > 0){
            value--;
        }//end if 
    }//end decrease
    
    public int value(){
        return value;
    }//end value
    
    public boolean full(){
        if (value == 5){
            return true;
        } else {
            return false;
        }//end else if
        
    }//end full
}//end class
