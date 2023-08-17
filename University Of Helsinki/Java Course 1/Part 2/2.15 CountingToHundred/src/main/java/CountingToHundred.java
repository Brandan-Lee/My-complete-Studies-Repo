
/*
Write a program, which reads an integer from the user. Then the program prints 
numbers from that number to 100. You can assume that the user always gives a
number less than 100. Below are some examples of the expected functionality.


*/

import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //input and maxnumber variables
        int input = Integer.valueOf(scanner.nextLine());
        
        for (int i = input; i <= 100; i++) {
            System.out.println(i);
        } //end for loop 
    } //end void
    /*
    examples of output
    
    99
    99
    100
    
    -4
    -4
    -3
    -2
    -1
    0
    1
    2
    ... (many numbers in between) ...
    98  
    99
    100
    */
}
