
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //counter and sum variable
        int count = 0;
        int sum = 0;

        //loop through until user inputs 0. count all positive numbers together 
        //and work out the average. display suitable message if user inputs 0;
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 0) {
                break;
            } else if (value > 0) {
                count++;
                sum = sum + value;
            }
        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        }
        System.out.println(1.0 * sum / count);
    }
}
