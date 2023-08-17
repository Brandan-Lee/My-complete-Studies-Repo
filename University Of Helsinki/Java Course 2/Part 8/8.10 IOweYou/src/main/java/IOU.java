
import java.util.HashMap;


public class IOU {
 
    private HashMap<String, Double> hashmap;
    
    public IOU() {
        this.hashmap = new HashMap<>();
    }//end IOU
    
    public void setSum(String toWhom, double amount) {
        
        if (this.hashmap.containsKey(toWhom)) {
            amount += this.hashmap.get(toWhom);
            this.hashmap.put(toWhom, amount);
            return;
        }//end if
        
        this.hashmap.put(toWhom, amount);
                
    }//end setSum
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.hashmap.getOrDefault(toWhom, 0.00);
    }//end howMuchDoIOweTo
    
}//end class
