
import java.util.ArrayList;

public class MisplacingBox extends Box {
  
    private ArrayList<Item> misBoxList;
    
    public MisplacingBox() {
        
        this.misBoxList = new ArrayList<>();
        
    }//end constructor
    
    @Override
    public void add(Item item) {
        
        this.misBoxList.add(item);
        
    }//end add
    
    public boolean isInBox(Item item) {
        
        return false;
        
    }//end isInBox
    
}//end class
