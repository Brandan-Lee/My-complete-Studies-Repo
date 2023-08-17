
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    
    private Map<String, Integer> prices;
    private Map<String, Integer> stockBalanceMap;
    
    
    public Warehouse() {
        
        this.prices = new HashMap<>();
        this.stockBalanceMap = new HashMap<>();
        
    }//end constructor
    
    public void addProduct(String product, int price, int stock) {
        
        this.prices.put(product, price);
        this.stockBalanceMap.put(product, stock);
        
    }//end addProduct
    
    public int price(String product) {
        
        return this.prices.getOrDefault(product, -99);
                   
    }//end price
    
    public int stock(String product) {
        
        return this.stockBalanceMap.getOrDefault(product, 0);
        
    }//end stock
    
    public boolean take(String product) {
        
        if (this.stock(product) > 0) {
            
            this.stockBalanceMap.put(product, this.stockBalanceMap.get(product) - 1);
            return true;
            
        } else {
            
            return false;
            
        }//end else if
        
    }//end take
    
    public Set<String> products() {
        
        Set<String> productSet = new HashSet<>();
        
        for (String key : this.prices.keySet()) {
            
            productSet.add(key);
            
        }//end for
        
        return productSet;
        
    }//end products
    
}//end class
