
public class Item {
    
    private String product;
    private int qty;
    private int unitPrice;
    
    public Item(String product, int qty, int unitPrice) {
        
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
        
    }//end constructor
    
    public int price() {
        
        return this.unitPrice * qty;
        
    }//end price
    
    public void increaseQuantity() {
        
        this.qty++;
        
    }//end increaseQuantity
    
    public String toString() {
        
        return this.product + ": " + this.qty;
        
    }//end toString
    
}//end class
