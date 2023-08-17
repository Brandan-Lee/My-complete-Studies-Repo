
package FlightControl.domain;

public class Place {
    
    private String ID;
    
    public Place(String ID) {
        
        this.ID = ID;
        
    }//end constructor
    
    @Override
    public String toString() {
        
        return this.ID;
        
    }//end toString
    
}//end class
