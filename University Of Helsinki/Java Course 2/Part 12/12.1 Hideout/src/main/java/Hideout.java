
import java.util.ArrayList;
import java.util.List;

public abstract class Hideout<T> implements List<T> {
    
    private List<T> hideoutList;
    
    public Hideout() {
        
        this.hideoutList = new ArrayList<>();
        
    }//end constructor
    
    public void putIntoHideout(T toHide) {
        
        if (!this.hideoutList.isEmpty()) {
            
            this.hideoutList.clear();
            
        }//end if
        
        this.hideoutList.add(toHide);
        
    }//end putIntoHideout
    
    public T takeFromHideout() {
        
        if (this.hideoutList.isEmpty()) {
            
            return null;
            
        }//end if
        
        T value = this.hideoutList.get(0);
        this.hideoutList.clear();
        return value;
        
    }//end takeFromHideout
    
    public boolean isInHideout() {
        
        if (this.hideoutList.isEmpty()) {
            
            return false;
            
        } else {
            
            return true;
            
        }//end if else
        
    }//end isInHideout
    
}//end class
