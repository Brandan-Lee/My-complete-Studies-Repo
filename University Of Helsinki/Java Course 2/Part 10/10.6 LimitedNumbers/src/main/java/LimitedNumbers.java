
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userInputList = new ArrayList<>();
        
        while (true) {
            
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput < 0) {
                
                userInputList.stream()
                        .filter(num -> num <= 5)
                        .forEach(num -> System.out.println(num));
                
                break;
                
            }//end if
            
            userInputList.add(userInput);
            
        }//end while
        
    }//end main
    
}//end class
