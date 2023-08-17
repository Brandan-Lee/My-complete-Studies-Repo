
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //sum and average and counter variable;
        int sum = 0;
        //double average = 0.0;
        int counter = 0;
        
        
        //loop through until user inputs 0. count all input up and get the 
        //average
        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 0) {
                break;
            } else {
                sum = sum + value;
                counter++;
                //average = sum / counter;
            }
        }
        System.out.println("Average of the numbers: " + 1.0 * sum / counter);
    }
}
