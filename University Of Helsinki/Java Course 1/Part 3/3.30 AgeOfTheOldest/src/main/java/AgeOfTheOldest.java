
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest, j = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }//end if

            String[] col = input.split(",");
            oldest = Integer.valueOf(col[1]);

            if (oldest > j) {
                j = oldest;
            }//end if
        }//end while
        System.out.println("Age of the oldest: " + j);

    }//end main
}//end class
