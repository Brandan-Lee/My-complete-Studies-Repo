
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
        
    }//end constructor

    public ArrayList<Integer> numbers() {
        
        return this.numbers;
        
    }//end numbers

    public void randomizeNumbers() {
        
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        Random random = new Random();
        
        for (int i = 0; i < 7; i++) {
            
            int numbers = random.nextInt(40) + 1;
            
            while (containsNumber(numbers)) {
                
                numbers = random.nextInt(40) + 1;
                
            }//end while
            
            this.numbers.add(numbers);
            
        }//end for
                
    }//end randomizeNumbers

    public boolean containsNumber(int number) {
        
        // Check here whether the number is among the drawn numbers
        return this.numbers.contains(number);
        
        
    }//end containsNumber
    
}//end class

