
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        LotteryRow row = new LotteryRow();
        ArrayList<Integer> lotteryNumbers = row.numbers();
        System.out.println("Lottery numbers:");
        
        for (Integer number : lotteryNumbers) {
            
            System.out.print(number + " ");
            
        }//end for
        
        System.out.println("");
        
    }//end main
    
}//end class

