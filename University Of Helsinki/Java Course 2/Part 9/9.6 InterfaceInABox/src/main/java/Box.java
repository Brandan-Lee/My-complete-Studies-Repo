
import java.util.ArrayList;

public class Box implements Packable {
    
    private double maxCapacity;
    private ArrayList<Packable> itemsInBox;
    
    public Box(double maxCapacity) {
        
        this.maxCapacity = maxCapacity;
        this.itemsInBox = new ArrayList<>();
        
    }//end constructor
    
    public void add(Packable itemToPack) {
        
        if (this.weight() + itemToPack.weight() <= maxCapacity) {
            
            this.itemsInBox.add(itemToPack);
            
        }//end if
        
    }//end add
    
    @Override
    public double weight() {
        
        double sum = 0;
        
        for (Packable e: itemsInBox) {
            
            sum += e.weight();
            
        }//end for
        
        return sum;
        
    }//end weight
    
    @Override
    public String toString() {
        
        return "Box: " + itemsInBox.size() + " items, total weight " + 
                this.weight() + " kg";
        
    }//end toString
    
}//end class
