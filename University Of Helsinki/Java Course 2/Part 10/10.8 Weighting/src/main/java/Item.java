

public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        
        this.name = name;
        this.weight = weight;
        
    }//end constructor

    public String getName() {
        
        return this.name;
        
    }//end getName

    public int getWeight() {
        
        return this.weight;
        
    }//end getWeight

    @Override
    public String toString() {
        
        return this.name + ": (" + this.weight + " kg)";
        
    }//end toString
    
}//end class
