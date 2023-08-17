
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //sum variable
        int sum = 0;
        
        //loop until user inputs 0. count all of the user inputs together
        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 0) {
                break;
            } else {
                sum = sum + value;
            }
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}
