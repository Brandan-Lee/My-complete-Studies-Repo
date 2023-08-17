
/*
Reading
1. Implement a program that asks the user for numbers (the program first prints
"Write numbers: ") until the user gives the number -1. When the user writes -1, 
the program prints "Thx! Bye!" and ends.
 */
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int sum = 0;
        int count = 0;
        double average = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Give numbers:");
        while (number != -1) {
            number = Integer.valueOf(scanner.nextLine());
            if (number >= 0) {
                sum += number;
                count++;
                if (number % 2 == 0 && number != -1) {
                    even++;
                } else {
                    odd++;
                }//nested if end
            }//if end
            average = (double) sum / count;
        }//end while loop
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }//end main
}//end class
