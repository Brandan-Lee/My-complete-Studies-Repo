
import java.util.Scanner;

public class Container {
    private int totalAmount;
    
    public Container() {
        this.totalAmount = 0;
    }//end container
    
    public int contains() {
        return this.totalAmount;
    }//end contains
    
    public void add (int amount) {
        
        if (amount >= 0) {
           
            if ((this.totalAmount + amount) <= 100) {
                this.totalAmount += amount;
            } else {
                this.totalAmount = 100;
            } //end else if
            
        }//end if
        
    }//end add
    
    public void remove (int amount) {
        
        if (amount >= 0) {
            
            if ((this.totalAmount - amount) >= 0) {
                this.totalAmount -= amount;
            } else {
                this.totalAmount = 0;
            }//end else if
            
        }//end if
        
    }//end remove
    
    public String toString() {
        return this.totalAmount + "/100";
    }//end toString
}//end class
