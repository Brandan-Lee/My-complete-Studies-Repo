
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //counter variable
        int count = 0;
        
        //loop until user inputs 0 and print the total negative numbers
        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 0) {
                break;
            } else if (value < 0) {
                count++;
            }
        }
        System.out.println("Number of negative numbers: " + count);
    }
}
