
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<Item>();
    }//end Suitcase

    public void addItem(Item item) {

        if (this.totalWeight() + item.getWeight() <= maxWeight) {
            this.items.add(item);
        }//end if

    }//end addItem
    
    public void printItems(){
      
        for (Item item : items){
            System.out.println(item);
        }//end for
        
    }//end printItems
    
    public String listItems(){
        
        String listItems = "";
        
        for (Item item : items){
            listItems = items.toString() + "\n";
        }//end for
        
        return listItems;
    }//end listItems
    
    public Item heaviestItem(){
        
        if (this.items.isEmpty()){
            return null;
        }//end if
        
        Item heaviestObject = this.items.get(0);
        
        for (Item item : items){
            
            if (heaviestObject.getWeight() < item.getWeight()){
                heaviestObject = item;
            }//end if
        
        }//end for
        
        return heaviestObject;
    }

    public int totalWeight() {
        int sumOfWeights = 0;
        
        for (Item entry : items) {
            sumOfWeights += entry.getWeight();
        }//end for

        return sumOfWeights;
    }//end totalWeight

    public String toString() {
        
        String itemString = "";
        
        if (items.size() == 0){
            itemString = "no items (" + this.totalWeight() + " kg)";
        } else if (items.size() == 1){
            itemString = items.size() + " item (" + this.totalWeight() + " kg)";
        } else {
            itemString = items.size() + " items (" + this.totalWeight() + " kg)";
        }//end if else if else
        
        return itemString;
    }
}//end class
