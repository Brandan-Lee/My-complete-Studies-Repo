
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Containers container;
    
    public UserInterface(Scanner scanner, Containers container) {
        this.scanner = scanner;
        this.container = container;
    }//end UserInterface
    
    public void start() {
        
        while (true) {
            printFirstContainer();
            printSecondContainer();
        }//end while
        
    }//end start
    
    public String printFirstContainer() {
        return this.container.getFirstContainer() + "/100";
    }//end printFirstContainer
    
    public String printSecondContainer() {
        return this.container.getSecondContainer() + "/100";
    }
}    

