
/*
Write a program that reads strings from the user. If the input is
empty, the program stops reading input and halts. For each non-empty
input it splits the string input by whitespaces and prints each part
of the string on a new line.
 */

import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] pieces;
       
       while (true){
           String text = scanner.nextLine();
           if (text.equals("")){
               break;
           }//end if
           
           pieces = text.split(" ");
           
           for (String split : pieces){
               System.out.println(split);
           }//end for
           
       }//end while
       
    }//end main

    /*
    Example of output
    once upon a time
    once
    upon
    a
    time

    a little program
    a
    little
    program

    halted
halted
     */
}//end class
