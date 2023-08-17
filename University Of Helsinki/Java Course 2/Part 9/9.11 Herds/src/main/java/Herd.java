
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    
    private List<Movable> herdList;
    
    public Herd() {
        
        this.herdList = new ArrayList<>();
        
    }//end constructor
    
    public void addToHerd(Movable movable) {
        
        this.herdList.add(movable);
        
    }//end addToHerd
    
    @Override
    public void move(int dx, int dy) {
        
        for (Movable obj : this.herdList) {
            
            obj.move(dx, dy);
            
        }//end for
        
    }//end move
    
    @Override
    public String toString() {
        
        String newString = "";
        
        for (Movable mov : herdList) {
            
           newString += mov.toString().trim() + "\n";
            
        }//end for
        
        return newString;
        
    }
    
}//end class
