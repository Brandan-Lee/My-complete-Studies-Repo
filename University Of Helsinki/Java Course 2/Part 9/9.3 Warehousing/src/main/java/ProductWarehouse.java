
public class ProductWarehouse extends Warehouse {
    
    private String productName;
    
    public ProductWarehouse(String productName, double capacity) {
        
        super(capacity);
        this.productName = productName;
        
    }//end ProductWarehouse
    
     public String getName() {
         
        return productName;
        
    }//end getProductName
    
    public void setName(String productName) {
        
        this.productName = productName;
        
    }//end setProductName
    
    @Override
    public String toString() {
        
        return getName() + ": " + super.toString();
        
    }//end toString
    
}//end class
