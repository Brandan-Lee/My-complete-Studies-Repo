
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Input from the user
        int value1 = Integer.valueOf(scanner.nextLine());
        int value2 = Integer.valueOf(scanner.nextLine());
        
        //if 1st > 2nd print "1st greater than second"
        //if 1st < 2nd print "1st is smaller than 2nd"
        //otherwise print "1st = 2nd"
        if (value1 > value2) {
            System.out.println(value1 + " is greater than " + value2 + ".");
        } else if (value1 < value2) {
            System.out.println(value1 + " is smaller than " + value2 + ".");
        } else {
            System.out.println(value1 + " is equal to " + value2 + ".");
        }
    }
}
