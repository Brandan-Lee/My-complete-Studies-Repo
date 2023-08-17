
/*
Write a program that reads the user's input as strings. When the user inputs an
empty string (only presses enter), the input reading will be stopped and the 
program will print all the user inputs.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userInputList = new ArrayList<>();
        
        while (true) {            
            
            String userInput = scanner.nextLine();
            
            if (userInput.isEmpty()) {
                
                userInputList.stream()
                        .forEach(word -> System.out.println(word));
                break;
                
            }//end if
            
            userInputList.add(userInput);
            
        }//end while
        
    }//end main
    
    /*
    Example of output
    first
    second
    war is peace: 1984
    
    first
    second
    war is peace: 1984
    */
    
}//end class
