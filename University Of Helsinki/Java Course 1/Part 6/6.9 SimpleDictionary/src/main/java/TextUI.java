
import java.util.Scanner;
import java.util.ArrayList;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
        
    }//end TextUI

    public void start() {

        while (true) {
            System.out.print("Command:");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.print("Word:");
                String word = scanner.nextLine();
                System.out.print("Translation:");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);
            } else if (command.equals("search")) {
                System.out.print("To be translated:");
                String translated = scanner.nextLine();
                String returnTranslated = simpleDictionary.translate(translated);
                
                if (returnTranslated == null){
                    System.out.println("Word " + translated + " was not found"); 
                } else {
                    System.out.println("Translation:" + returnTranslated);
                }//end else if
                
            } else {
                System.out.println("Unknown command");
                continue;
            }// end if else if else if else

        }//end while
    }
}//end class
