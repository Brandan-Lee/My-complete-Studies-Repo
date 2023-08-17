package FlightControl;

import FlightControl.logic.FlightControl;
import FlightControl.ui.TextUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        FlightControl testFC = new FlightControl();
        Scanner scanner = new Scanner(System.in);
        TextUI ui = new TextUI(testFC, scanner);
        ui.start();
        
    }//end main
    
}//end class
