
import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }//end Hold
    
    public void addSuitcase(Suitcase suitcase){
        
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight){
            this.suitcases.add(suitcase);
        }//end if
        
    }//end addSuitcase
    
    public int totalWeight(){
        int sumOfWeight = 0;
        
        for (Suitcase suitcase : suitcases){
            sumOfWeight += suitcase.totalWeight();
        }//end for
        
        return sumOfWeight;
    }//end totalWeight
    
    public void printItems(){
       
        for (Suitcase suitcase : suitcases){
            System.out.println(suitcase.listItems());
        }//end for
        
    }//end printItems
    
    public String toString(){
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + 
                " kg)";
    }//end toString
}//end class
