
package application;

public class StandardSensor implements Sensor {
    
    private int number;
    
    public StandardSensor(int number) {
        
        this.number = number;
        
    }//end constructor
    
    @Override
    public boolean isOn() {
        
        return true;
        
    }//end isOn
    
    @Override
    public void setOn() {
        
        return;
        
    }//end setOn
    
    @Override
    public void setOff() {
        
        return;
        
    }//end setOff
    
    @Override
    public int read() {
        
        return this.number;
        
    }//end read
    
}//end class
