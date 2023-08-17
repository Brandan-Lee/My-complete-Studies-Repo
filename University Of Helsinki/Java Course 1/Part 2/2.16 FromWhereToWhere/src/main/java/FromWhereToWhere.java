
/*
This exercise is the first two-part exercise. When you complete both parts, 
you will get two exercise points. You can also submit the exercise after 
completing only the first part.

1. Where to
Write a program which prints the integers from 1 to a number given by the user.

hint the number read from the user is now the upper limit of the condition. 
Remember that in Java a <= b means a is smaller or equal to b.

2. Where from
Ask the user for the starting point as well.
*/

import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //for loop
        System.out.println("Where to?");
        int input1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int input2 = Integer.valueOf(scanner.nextLine());
        for (int i = input2; i <= input1; i++){
            System.out.println(i);
        }//end for loop
        
//        //while loop
//        System.out.println("Where to?");
//        //variables
//        int input = Integer.valueOf(scanner.nextLine());
//        int i = 1;
//        while (i <= input) {
//            System.out.println(i);
//            i++;
//        }
        
    }//end of void
}
