
import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }//end UserInterface
    
    public void start() {
        
        while (true) {
            System.out.print("Command");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add");
                String toAdd = scanner.nextLine();
                todoList.add(toAdd);
            } else if (command.equals("list")) {
                todoList.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed?");
                int remove = Integer.valueOf(scanner.nextLine());
                todoList.remove(remove);
            }//end else if
        }//end if
        
    }//end start
    
}//end class
