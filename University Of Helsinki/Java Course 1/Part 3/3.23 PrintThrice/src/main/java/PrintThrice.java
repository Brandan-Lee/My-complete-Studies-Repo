
/*
Write a program, that reads a string from the user and then prints
it three times.
NB! The program should ask for only one string. Don't use a loop
here.
*/

import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a word: ");
        String word = scanner.nextLine();
        int count = 0;
        
//        System.out.print(word + word + word);
        
        while (count < 3){
            System.out.print(word);
            count++;
        }//end while
    }//end main
    
    /*
    Give a word: cake
    cakecakecake
    */
    
}//end class
