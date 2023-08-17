
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //create a counter variable
        int count = 0;
        
        //loop through user input until they input 0 and count the amount of 
        //inputs from the user
        while (true) {
            System.out.println("Give a number: ");
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 0) {
                break;
            } else {
                count++;
            }
        }
        System.out.println("Number of numbers: " + count);
    }
}
