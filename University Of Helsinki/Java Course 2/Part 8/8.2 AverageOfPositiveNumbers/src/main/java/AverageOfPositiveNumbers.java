
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            int value = Integer.valueOf(scanner.nextLine());

            if (value == 0) {
                break;
            } else if (value > 0) {
                sum += value;
                count++;

            }//end if else

        }//end while
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        }//end if

        System.out.println(1.00 * sum / count);
    }//end main

}//end class
