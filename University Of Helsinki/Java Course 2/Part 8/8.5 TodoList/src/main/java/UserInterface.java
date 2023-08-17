
import java.util.Scanner;

public class UserInterface {
    
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }//end UserInterface
    
    public void start() {
        
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equalsIgnoreCase("Stop")) {
                break;
            } else if (command.equalsIgnoreCase("Add")) {
                System.out.print("To add: ");
                String add = scanner.nextLine();
                this.list.add(add);
            } else if (command.equalsIgnoreCase("List")) {
                this.list.print();
            } else if (command.equalsIgnoreCase("remove")) {
                System.out.print("Which one is removed? ");
                int remove = Integer.valueOf(scanner.nextLine());
                this.list.remove(remove);
            }
        }
    }
}//end class
