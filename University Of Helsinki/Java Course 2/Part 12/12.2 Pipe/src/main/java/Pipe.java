
import java.util.ArrayList;
import java.util.List;


public abstract class Pipe<T> implements List<T> {
    
    private List<T> pipeList;
    
    
    public Pipe() {
        
        this.pipeList = new ArrayList<>();
        
    }//end constructor
     
    public void putIntoPipe(T value) {
        
        if (!this.pipeList.isEmpty()) {
            
            this.pipeList.clear();
            
        }//end if
        
        this.pipeList.add(value);
        
    }//end putIntoPipe
    
    public T takeFromPipe() {
        
        if (this.pipeList.isEmpty()) {
            
            return null;
            
        }//end if
        
        T longest = this.pipeList.get(this.pipeList.size() - 1);
        this.pipeList.remove(longest);
        return longest;
        
    }//end takeFromPipe
    
    
    public boolean isInPipe() {
        
        if (this.pipeList.isEmpty()) {
            
            return false;
            
        } else {
            
            return true;
            
        }//end else if
        
    }//end isInPipe
    
}//end class
