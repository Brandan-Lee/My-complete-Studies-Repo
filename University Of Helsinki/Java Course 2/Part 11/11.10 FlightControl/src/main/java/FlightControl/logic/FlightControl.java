
package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.HashMap;

public class FlightControl {
    
    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;
    private HashMap<String, Place> places;
    
    public FlightControl() {
        
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
        
    }//end constructor
    
    public void addAirplane(String ID, int capacity) {
        
        Airplane plane = new Airplane(ID, capacity);
        this.airplanes.put(ID, plane);
        
    }//end addAirplane
    
    public void addFlight(Airplane plane, String departureID, String targetID) {
        
        this.places.putIfAbsent(departureID, new Place(departureID));
        this.places.putIfAbsent(targetID, new Place(targetID));
        
        Flight flight = new Flight(plane, this.places.get(departureID),
                this.places.get(targetID));
        this.flights.put(flight.toString(), flight);
        
    }//end addFlight
    
    public Collection<Airplane> getAirplanes() {
        
        return this.airplanes.values();
        
    }//end getAirplanes
    
    public Collection<Flight> getFlights() {
        
        return this.flights.values();
        
    }//end getFlights
    
    public Airplane getAirplane(String ID) {
        
        return this.airplanes.get(ID);
        
    }//end getAirplane
    
}//end class
