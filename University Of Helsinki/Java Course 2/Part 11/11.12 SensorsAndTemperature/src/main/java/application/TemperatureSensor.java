
package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean isOn;
    
    public TemperatureSensor() {
        
        this.isOn = false;
        
    }//end constructor
    
    @Override
    public boolean isOn() {
        
        return this.isOn;
        
    }//end isOn
    
    @Override
    public void setOn() {
        
        if (!this.isOn) {
            
            this.isOn = true;
            
        }//end if
        
    }//end setOn
    
    @Override
    public void setOff() {
        
        if (this.isOn) {
            
            this.isOn = false;
            
        }//end if
        
    }//end setOff
    
    @Override
    public int read() {
        
        if (isOn()) {
            
            Random rand = new Random();
            int range = 30 - (-30) + 1;
            return rand.nextInt(range) + (-30);
            
        } else {
            
            throw new IllegalStateException("Error reading temperature sensor");
            
        }//end if else
        
    }//end read
    
}//end class
