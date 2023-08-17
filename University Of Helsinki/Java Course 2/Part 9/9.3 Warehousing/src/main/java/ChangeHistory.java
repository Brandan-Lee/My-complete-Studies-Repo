
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class ChangeHistory {
    
    private ArrayList<Double> historyList;
    
    public ChangeHistory() {
        
        this.historyList = new ArrayList<>();
        
    }//end constructor
    
    public void add(double status) {
        
        this.historyList.add(status);
        
    }//end add
    
    public void clear() {
        
        this.historyList.clear();
        
    }//end clear
    
    public double maxValue() {
        
        if (this.historyList.isEmpty()) {
            
            return 0.0;
            
        }//end if
        
        double max = this.historyList.get(0);
        
        for (Double d: this.historyList) {
            
            if (max < d) {
                
                max = d;
                
            }//end if
            
        }//end for
        
        return max;
        
    }//end maxValue
    
    public double minValue() {
        
        if (this.historyList.isEmpty()) {
            
            return 0.0;
            
        }//end if
        
        double min = this.historyList.get(0);
        
        for (Double d: this.historyList) {
            
            if (min > d) {
                
                min = d;
                
            }//end if
            
        }//end for
        
        return min;
        
    }//end minValue
    
    public double average() {
        
        int sum = 0;
        
        if (this.historyList.isEmpty()) {
            
            return 0.0;
            
        }//end if
        
        for (double e: this.historyList) {
            
            sum += e;
            
        }//end for
        
        return 1.0 * sum / this.historyList.size();
        
    }//end average
    
    @Override
    public String toString() {
        
        return this.historyList.toString();
        
    }//end toString
    
    @Override
    public int hashCode() {
        
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.historyList);
        
        return hash;
        
    }//end hashCode
    
    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            
           return true; 
            
        }//end if
        
        if (obj == null) {
            
            return false;
            
        }//end if
        
        if (getClass() != obj.getClass()) {
            
            return false;
            
        }//end if
        
        final ChangeHistory other = (ChangeHistory) obj;
        
        if (!Objects.equals(this.historyList, other.historyList)) {
            
            return false;
            
        }//end if
        
        return true;
        
    }//end equals
    
    
}//end class
