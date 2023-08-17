
package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

public class TextUI {

    private FlightControl flightControl;
    private Scanner scanner;
    
    public TextUI(FlightControl flightControl, Scanner scanner) {
        
        this.flightControl = flightControl;
        this.scanner = scanner;
        
    }//end constructor
    
    public void start() {
        
        startAssetControl();
        System.out.println();
        startFlightControl();
        System.out.println();
        
    }//end start
    
    private void startAssetControl() {
        
        System.out.println("Airport Asset Control");
        System.out.println("---------------------");
        System.out.println();
        
        while (true) {
            
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            
            System.out.println(" > ");
            String answer = scanner.nextLine();
            
            if (answer.equals("1")) {
            
                addAirplane();
                
            } else if (answer.equals("2")) {
                
               addFlight();
                
            } else if (answer.equalsIgnoreCase("x")) {
                
                break;
                
            }//end if elese if else if
             
        }//end while
        
    }//end startAssetControl
    
    private void addAirplane() {
        
        System.out.print("Give the airplane id: ");
        String airplaneID = scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        int airplaneCapacity = Integer.valueOf(scanner.nextLine());
        
        this.flightControl.addAirplane(airplaneID, airplaneCapacity);
        
    }//end addAirplane
    
    private void addFlight() {
        
        System.out.print("Give the airplane id: ");
        Airplane airplane = askForAirplane();
        System.out.print("Give the departure airport id: ");
        String departureID = scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String targetID = scanner.nextLine();
        
        this.flightControl.addFlight(airplane, departureID, targetID);
        
    }
    
    private Airplane askForAirplane() {
        
        Airplane airplane = null;
        
        while (airplane == null) {
            
            String ID = scanner.nextLine();
            airplane = flightControl.getAirplane(ID);
            
            if (airplane == null) {
                
                System.out.println("No airplane with the id " + ID + ".");
                
            }//end if
            
        }//end while
        
        return airplane;
        
    }//end askForAirplane
    
    private void startFlightControl() {
        
        System.out.println("Flight Control");
        System.out.println("--------------");
        System.out.println();
        
        while (true) {
            
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String answer = scanner.nextLine();
            
            if (answer.equals("1")) {
                
                printAirplanes();
                
            } else if (answer.equals("2")) {
                
               printFlights();
                
            } else if (answer.equals("3")) {
                
                printAirplaneDetails();
                
            } else if (answer.equalsIgnoreCase("x")) {
                
                break;
                
            }//end if else if else if else if
            
        }//end while
        
    }//end startFlightControl
    
    private void printAirplanes() {
        
        for (Airplane planes : flightControl.getAirplanes()) {
            
            System.out.println(planes);
            
        }//end for
        
    }//end printAirplanes
    
    private void printFlights() {
        
        for (Flight flights : flightControl.getFlights()) {
            
            System.out.println(flights);
            System.out.println("");
            
        }//end for
        
    }//end printFlights
    
    private void printAirplaneDetails() {
        
        System.out.print("Give the airplane id: ");
        Airplane plane = askForAirplane();
        System.out.println(plane);
        System.out.println();
        
    }//end printAirplaneDetails
    
}//end class
