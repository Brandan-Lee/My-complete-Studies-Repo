
/*
The exercise template contains a base that reads numbers from the user
and adds them to a list. Reading is stopped once the user enters the
number -1.

Modify the program so that after reading the numbers it calculates and
prints the sum of the numbers in the list.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }//end if

            list.add(input);
        }//end while
        
        for (int i : list){
            sum += i;
        }//end for

        System.out.println("Sum: " + sum);

        // toteuta listan lukujen summan laskeminen tänne
    }//end main
    
    /*
    Example of output
    72
    2
    8
    11
    -1
    
    Sum: 93
    */
    
}//end class

