package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> listOfSensors;
    private List<Integer> listOfAve;

    public AverageSensor() {

        this.listOfSensors = new ArrayList<>();
        this.listOfAve = new ArrayList<>();

    }//end constructor

    public void addSensor(Sensor toAdd) {

        this.listOfSensors.add(toAdd);

    }//end addSensor

    @Override
    public boolean isOn() {

        boolean isOn = false;

        for (Sensor e : this.listOfSensors) {

            if (e.isOn() == true) {

                isOn = true;

            } else {

                isOn = false;
                break;

            }//end if else

        }//end for
        
        return isOn;

    }//end isOn
    
    @Override 
    public void setOn() {
        
       for (Sensor e : this.listOfSensors) {
           
           e.setOn();
           
       }//end for 
        
    }//end setOn
    
    @Override 
    public void setOff() {
        
        for (Sensor e : this.listOfSensors) {
            
            e.setOff();
            
        }//end for
        
    }//end setOff
    
    @Override
    public int read() {
        
        int sum = 0;
        
        if (isOn() && !this.listOfSensors.isEmpty()) {
            
            for (Sensor e : this.listOfSensors) {
                
                sum += e.read();
                
            }//end for
            
            int average = sum / this.listOfSensors.size();
            this.listOfAve.add(average);
            return average;
             
        } else {
            
            throw new IllegalStateException("Error getting average of sensors");
            
        }//end else if
        
    }//end read
    
    public List<Integer> readings() {
        
        return listOfAve;
        
    }//end readings

}//end class
