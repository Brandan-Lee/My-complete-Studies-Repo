
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }//end if

            count++;
        }//end while
        System.out.println(count);

    }//end main
}//end class
