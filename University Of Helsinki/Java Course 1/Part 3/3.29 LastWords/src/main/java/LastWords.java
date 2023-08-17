
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }//end if
               
            String[] lastWord = input.split(" ");
            System.out.println(lastWord[lastWord.length - 1]);
        }//end while
    }//end main
}//end class
