
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
        
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }//end for loop
        System.out.println("Factorial: " + factorial);
    }//end main
    /*
    Sample output:
    
    Give a number: 3
    Factorial: 6
    The internal calculation here was 1 * 2 * 3 = 6
    
    Give a number: 10
    Factorial: 3628800

    And now the internal calculation was 1 * 2 * 3 * ... * 8 * 9 * 10 = 3628800
    */
}//end class
