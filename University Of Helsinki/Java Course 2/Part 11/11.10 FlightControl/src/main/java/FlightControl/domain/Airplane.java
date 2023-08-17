
package FlightControl.domain;

public class Airplane {
  
    private String id;
    private int capacity;
    
    public Airplane(String id, int capacity) {
        
        this.id = id;
        this.capacity = capacity;
        
    }//end constructor
    
    public String getID() {
        
        return this.id;
        
    }//end getID
    
    public int getCapacity() {
        
        return this.capacity;
        
    }//end getCapacity
    
    public String toString() {
        
        return this.id + " (" + this.capacity + " capacity)";
        
    }//end toString
    
}//end class
