
/*
The exercise template contains a base that reads numbers from the user
and adds them to a list. Reading is stopped once the user enters the
number -1.

Expand the program by adding a functionality that asks the user for a
number, and reports that number's index in the list. If the number is
not found, the program should not print anything.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }//end if

            list.add(input);
        }//end while
        
        System.out.println("Search for?");
        int search = Integer.valueOf(scanner.nextLine());
        //int listNumber = list.get(0); 
        
        for (int i = 0; i < list.size(); i++){
            //int number = list.get(i);
            if (search == list.get(i)){
                System.out.println(search + " is at index " + i);
            }//end if
           
        }//end for
        

        // implement here finding the indices of a number
    }//end main
    
    /*
    examples of output
    72
    2
    8
    8
    11
    -1
    
    Search for? 2
    2 is at index 1
    
    72
    2
    8
    8
    11
    -1
    
    Search for? 8
    8 is at index 2
    8 is at index 3
    */
    
}//end class
