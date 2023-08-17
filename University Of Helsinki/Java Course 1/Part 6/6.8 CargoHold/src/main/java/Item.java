
public class Item {
    private String name;
    private int weight;
    
    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }//end Item
    
    public String getName(){
        return this.name;
    }//end getName
    
    public int getWeight(){
        return this.weight;
    }//end getWeight
    
    public String toString(){
        return this.name + " (" + this.weight + " kg)";
    }//end toString
}//end class
