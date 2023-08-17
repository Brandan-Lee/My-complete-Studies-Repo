
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory historyListObj = new ChangeHistory();

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {

        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        
        this.historyListObj.add(initialBalance);

    }//end ProductWarehouseWithHistory

    public String history() {

        return this.historyListObj.toString();

    }//end history

    public void addToWarehouse(double amount) {

        double result = 0;
        result = (double) super.getBalance() + amount;
        this.historyListObj.add(result);
        super.addToWarehouse(amount);

    }//end addToWarehouse

    public double takeFromWarehouse(double amount) {

        double result = 0;
        result = (double) super.getBalance() - amount;
        this.historyListObj.add(result);
        
        return super.takeFromWarehouse(amount);

    }//end takeFromWarehouse
    
    public void printAnalysis() {
        
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.historyListObj.toString());
        System.out.println("Largest amount of product: " + this.historyListObj.maxValue());
        System.out.println("Smallest amount of product: " + this.historyListObj.minValue());
        System.out.println("Average: " + this.historyListObj.average());
        
    }//end printAnalysis

}//end class
