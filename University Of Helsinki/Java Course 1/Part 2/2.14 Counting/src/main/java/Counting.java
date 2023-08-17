
/*
1
Write a program that reads an integer from the user. Next, the program prints 
numbers from 0 to the number given by the user. You can assume that the user 
always gives a positive number. Below are some examples of the expected 
functionality.
*/

import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //counter and user input
//        int number = 0;
//        int value = Integer.valueOf(scanner.nextLine());
//        while (number <= value) {
//            System.out.println(number);
//            number++;
//            } //end while loop
        
        // or
        
        //user input
        int input = Integer.valueOf(scanner.nextLine());
        for (int count = 0; count <= input; count++) {
            System.out.println(count);
        } //end for loop
    } // end void
    /*
    example of outputs
    
    4
    0
    1
    2   
    3
    4
    
    1
    0
    1
    */
}
