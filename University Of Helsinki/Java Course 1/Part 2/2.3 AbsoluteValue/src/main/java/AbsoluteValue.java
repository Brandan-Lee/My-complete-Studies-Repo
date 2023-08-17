
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //first input
        int value = Integer.valueOf(scanner.nextLine());
        
        //if less than 0, print given value * -1. else print value
        if (value < 0) {
            System.out.println(value * -1);
        } else {
            System.out.println(value);
        }
    }
}
