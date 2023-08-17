
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    
    private Map<String, Item> itemMap;
    
    public ShoppingCart() {
        
        this.itemMap = new HashMap<>();
        
    }//end constructor
    
    public void add(String product, int price) {
        
        if (itemMap.keySet().contains(product)) {
            
            increaseQuantity(product); 
            
        } else {
            
            this.itemMap.put(product, new Item(product, 1, price));
            
        }//end else if
        
    }//end add
    
    public void increaseQuantity(String product) {
        
        this.itemMap.get(product).increaseQuantity();
        
    }//end increaseQuantity
    
    public int price() {
        
        int totalPrice = 0;
        
        for (Item e : this.itemMap.values()) {
            
            totalPrice += e.price();
            
        }//end for
        
        return totalPrice;
        
    }//end price
    
    public void print() {
        
        for (String e : this.itemMap.keySet()) {
            
            System.out.println(this.itemMap.get(e).toString());
            
        }//end for
        
    }//end print
    
}//end class
