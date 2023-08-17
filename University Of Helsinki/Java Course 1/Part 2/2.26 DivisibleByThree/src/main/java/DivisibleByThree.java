
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        divisibleByThreeInRange(2, 10);
    }//end main
    
    public static void divisibleByThreeInRange(int beginning, int end) {
        int i = 0;
        while (beginning <= end) {
            if (beginning % 3 == 0) {
                System.out.println(beginning);
              
            }//end of if
            beginning++;
        }//end of while loop 
    }//end divisibleByThreeInRange
}//end class
