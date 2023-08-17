


import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest, j = 0;
        String name = "";
        
        while (true){
           String input = scanner.nextLine();
           
           if (input.equals("")){
               break;
           }//end if
           
           String[] col = input.split(",");
           oldest = Integer.valueOf(col[1]);
           
           if (oldest > j){
               j = oldest;
               name = col[0];
           }//end if
           
        }//end while
        System.out.println("Name of the oldest: " + name);
    }//end main
}//end class
