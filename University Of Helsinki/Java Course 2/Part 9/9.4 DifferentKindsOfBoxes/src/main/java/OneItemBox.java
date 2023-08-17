
import java.util.ArrayList;

public class OneItemBox extends Box {
    
    private ArrayList<Item> oneItemBox;  
    
    public OneItemBox() {
        
        this.oneItemBox = new ArrayList<>();
        
    }//end constuctor
    
    @Override
    public void add(Item item) {
        
        if (this.oneItemBox.isEmpty()) {
            
            oneItemBox.add(item);
            
        }//end if
        
    }//end add
    
    @Override
    public boolean isInBox(Item item) {
        
        return oneItemBox.contains(item);
        
    }//end isInBox
    
}//end class
