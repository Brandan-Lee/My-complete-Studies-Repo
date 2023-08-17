
package FlightControl.domain;

public class Flight {
    
    private Airplane airplane;
    private Place departureAirport;
    private Place targetAirport;
    
    public Flight(Airplane airplane, Place departureAirport, Place targetAirport) {
        
        this.airplane = airplane;
        this.departureAirport = departureAirport;
        this.targetAirport = targetAirport;
        
    }//end constructor
    
    public Airplane getAirplane() {
        
        return this.airplane;
        
    }//end getAirplane
    
    public Place getDepartureAirport() {
        
        return this.departureAirport;
        
    }//end getdepartureAirport
    
    public Place getTargetAirport() {
        
        return this.targetAirport;
        
    }//end getDepartureAirport
    
    public String toString() {
        
        return this.airplane.toString() + " (" + this.departureAirport + "-" +
                this.targetAirport + ")";
        
    }//end toString
    
}//end class
