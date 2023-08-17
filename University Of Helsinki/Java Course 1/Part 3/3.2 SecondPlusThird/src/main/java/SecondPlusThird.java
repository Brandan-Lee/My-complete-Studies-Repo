
/*
In the exercise template there is a program that reads integers from the
user and adds them to a list. This ends when the user enters 0. The program
then prints the first value on the list.

Modify the program so that instead of the first value, the program prints
the sum of the second and third numbers. The program is allowed to malfunction
if there are fewer than three entries on the list, so you don't need to
prepare for such an event at all.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }//end if
            
            numbers.add(number);
        }//end while
        
        int sum = (numbers.get(1)) + (numbers.get(2));
        System.out.println(sum);
    }//end main
    
    /*
    examples of output
    1
    3
    5
    7
    0
    8
    
    2
    3
    4
    0
    7
    */
    
}//end class
