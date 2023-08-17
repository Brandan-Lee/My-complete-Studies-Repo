
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();
        while (true) {
            System.out.println("First: " + container1.toString());
            System.out.println("Second: " + container2.toString());

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }//end if
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equalsIgnoreCase("add")) {
                container1.add(amount);
            } else if (command.equalsIgnoreCase("move")) {
                
                if (container1.contains() < amount) {
                    amount = container1.contains();
                }//end if
                
                container1.remove(amount);
                container2.add(amount);
            } else if (command.equals("remove")) {
                container2.remove(amount);
            }
        }//end while

    }//end main

}//end class
