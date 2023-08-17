
/*
The exercise template contains a sketch of a program that reads user-provided 
information about people. Expand the program so that it will print all the 
unique last names of the user-provided people in alphabetical order.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastNames {

    public static void main(String[] args) {
        
        ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.println("Continue personal information input? \"quit\" ends:");
            String continueQ = "quit";
            
            if(scanner.hasNextLine()) {
                
                continueQ = scanner.nextLine();
                
            }//end if

            if (continueQ.equals("quit")) {
                
                persons.stream()
                        .map(person -> person.getLastName())
                        .sorted()
                        .distinct()
                        .forEach(lName -> System.out.println(lName));
                
                break;
                
            }//end if

            System.out.print("Input first name: ");
            String firstName = "NaN";
            
            if(scanner.hasNextLine()){
                
                firstName = scanner.nextLine();
                
            }//end if
            
            System.out.print("Input last name: ");
            String lastName = "NaN";
            
            if(scanner.hasNextLine()){
                
                lastName = scanner.nextLine();
            
            }//end if
            
            System.out.print("Input the year of birth: ");
            int birthYear = 0;
            
            if(scanner.hasNextLine()){
                
                birthYear = Integer.valueOf(scanner.nextLine());
            
            }//end if

            persons.add(new Person(firstName, lastName, birthYear));
            System.out.println("");
            
        }//end while

        
    }//end main
    
    /*
    Example of output
    Continue personal information input? "quit" ends:

    Input first name: Ada
    Input last name: Lovelace
    Input the year of birth: 1815

    Continue personal information input? "quit" ends:

    Input first name: Grace
    Input last name: Hopper
    Input the year of birth: 1906

    Continue personal information input? "quit" ends:

    Input first name: Alan
    Input last name: Turing
    Input the year of birth: 1912

    Continue personal information input? "quit" ends:
    quit

    Unique last names in alphabetical order:
    Hopper  
    Lovelace
    Turing  
    */
    
}//end class
