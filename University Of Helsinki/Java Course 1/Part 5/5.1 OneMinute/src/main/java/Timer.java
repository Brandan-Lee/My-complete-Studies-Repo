/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Spider
 */
public class Timer {
    
    private ClockHand hundredths;
    private ClockHand seconds;
    
    public Timer(){
        this.hundredths = new ClockHand(100);
        this.seconds = new ClockHand(60);
        
    }//end timer
    
    public void advance(){
       
        this.hundredths.advance();
        
        if (this.hundredths.value() == 0){
            this.seconds.advance();
        }//end if
        
    }//end advance
    
    public String toString(){
        return seconds + ":" + hundredths;
    }//end toString
}//end class
