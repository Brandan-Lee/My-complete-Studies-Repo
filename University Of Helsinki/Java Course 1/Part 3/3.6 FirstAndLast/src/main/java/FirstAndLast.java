
/*
In the exercise template there is a program that reads inputs from the
user and adds them to a list. Reading is stopped once the user enters
an empty string.

Modify the program to print both the first and the last values after
the reading ends. You may suppose that at least two values are read
into the list.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }//end if

            list.add(input);
        }//end while
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));
    }//end main
    
    /*
    examples of output
    Tom
    Emma
    Alex
    Mary

    Tom
    Mary
    
    Juno
    Elizabeth
    Mason
    Irene
    Olivia
    Liam
    Ida
    Christopher
    Mark
    Sylvester
    Oscar

    Juno
    Oscar
    */
}//end class
