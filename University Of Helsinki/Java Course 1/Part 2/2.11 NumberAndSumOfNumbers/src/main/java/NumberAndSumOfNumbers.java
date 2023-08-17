
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //counter and sum variable
        int count = 0;
        int sum = 0;
        
        //loop until user inputs 0. Count all inputs and count them together
        while (true) {
            System.out.println("Give a number: ");
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 0) {
                break;
            } else {
                count++;
                sum = sum + value;
            }  
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}
