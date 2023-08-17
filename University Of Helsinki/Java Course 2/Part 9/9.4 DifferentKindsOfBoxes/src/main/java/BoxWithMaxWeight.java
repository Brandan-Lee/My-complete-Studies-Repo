
import java.util.ArrayList;


public class BoxWithMaxWeight extends Box {
    
    private ArrayList<Item> itemsInMaxBox;
    private int capacity;
    
    public BoxWithMaxWeight(int capacity) {
        
        this.itemsInMaxBox = new ArrayList<>();
        this.capacity = capacity;
        
    }//end constructor
    
    public int currentAmount() {
        
        int sum = 0;
        
        for (Item e : itemsInMaxBox) {
            
            sum += e.getWeight();
            
        }//end for
        
        return sum;
        
    }//end currentAmount
    
    @Override
    public void add(Item item) {
        
       if (currentAmount() + item.getWeight() <= this.capacity) {
           
           itemsInMaxBox.add(item);
           
       }//end if
        
    }//end add
    
    @Override
    public boolean isInBox(Item item) {
        
        return itemsInMaxBox.contains(item);
        
    }//end isInBox
    
}//end class
