
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            
            String[] sentence = input.split(" ");
            
            for (String word : sentence){
                
                if (word.contains("av")){
                    System.out.println(word);
                }//end if
                
            }//end for
            
        }//end while
        
    }//end main
    
}//end class
