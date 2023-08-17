
import java.util.Objects;


public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        
        this.name = name;
        this.weight = weight;
        
    }//end constructor

    public Item(String name) {
        
        this(name, 0);
        
    }//end Item

    public String getName() {
        
        return name;
        
    }//end getName

    public int getWeight() {
        
        return weight;
        
    }//end getWeight
    
    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            
            return false;
            
        }//end if
        
        if (obj == null) {
            
            return false;
            
        }//end if
        
        if (getClass() != obj.getClass()) {
            
            return false;
            
        }//end if
        
        final Item other = (Item) obj;
        
        if (!Objects.equals(this.name, other.name)) {
            
            return false;
            
        }//end if
        
        return true;
        
    }//end equals
    
    @Override
    public int hashCode() {
        
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.name);
        //hash = 19 * hash + Objects.hashCode(this.weight);
        return hash;
        
    }//end hashCode
    
}//enbd class
