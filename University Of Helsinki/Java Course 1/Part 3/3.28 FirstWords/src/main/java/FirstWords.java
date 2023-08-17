
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }//end if
            
            String[] firstWord = input.split(" ");
            System.out.println(firstWord[0]);
            
        }//end while

    }
}
