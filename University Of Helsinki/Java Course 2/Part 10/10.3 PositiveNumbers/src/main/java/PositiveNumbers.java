
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

    }//end main
    
    public static List<Integer> positive(List<Integer> numbers) {
        
        ArrayList<Integer> getPos = numbers.stream()
               .filter(i -> i > 0)
               .collect(Collectors.toCollection(ArrayList::new));
        
        return getPos;
                
        
    }//end positive
    
}//end class
