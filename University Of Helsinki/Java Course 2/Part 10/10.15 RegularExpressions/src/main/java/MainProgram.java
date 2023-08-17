
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Checker testChecker = new Checker();

        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        if (testChecker.isDayOfWeek(input) || testChecker.allVowels(input) ||
                testChecker.timeOfDay(input)) {
            
            System.out.println("The form is correct");
            
        } else {
            
            System.out.println("The form is incorrect");
            
        }//end else if
        

    }//end main
}//end class
