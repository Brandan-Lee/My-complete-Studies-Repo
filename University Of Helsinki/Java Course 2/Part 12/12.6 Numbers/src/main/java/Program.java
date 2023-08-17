
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many random numbers should be printed?");
        int amountNumbers = Integer.valueOf(scanner.nextLine());
        Random numbers = new Random();
        
        for (int i = 0; i < amountNumbers; i++) {
            
            System.out.println(numbers.nextInt(amountNumbers)); 
            
        }//end for
        
    }//end main

}//end class
