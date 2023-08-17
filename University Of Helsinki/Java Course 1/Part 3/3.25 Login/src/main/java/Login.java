
/*
Write a program that recognizes the following users:

username	password
alex	sunshine
emma	haskell
*/

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username:");
        String username = scanner.nextLine();
        System.out.print("Enter password:");
        String password = scanner.nextLine();
        
        if (username.equals("alex") && password.equals("sunshine")){
            System.out.println("You have successfully logged in!");
        } else if (username.equals("emma") && password.equals("haskell")){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("The username or password is incorrect!");
        }//end if else if else
        
    }//end main
    
    /*
    example of output
    Enter username: alex
    Enter password: sunshine
    You have successfully logged in!
    
    Enter username: emma
    Enter password: haskell
    You have successfully logged in!
    
    Enter username: alex
    Enter password: thunderstorm
    Incorrect username or password!
    */
    
}//end class
