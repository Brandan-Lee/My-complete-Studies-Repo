
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            System.out.println("");
            
            if (command.equalsIgnoreCase("add") && amount >= 0) {
                first += amount;
                
                if (first >= 100) {
                    first = 100;
                }//end if
                  
            } else if (command.equalsIgnoreCase("move") && amount >= 0) {
                
                if (amount > first) {
                    amount = first;
                }//end if
                
                first -= amount;
                second += amount;
                
                if (second >= 100) {
                    second = 100;
                }//end if
                
            } else if (command.equalsIgnoreCase("remove") && amount >= 0) {
                
                if (second < amount) {
                    second = 0;
                } else {
                    second -= amount;
                } //end else if
                
            }

        }//end while
    }//end main

}//end class
