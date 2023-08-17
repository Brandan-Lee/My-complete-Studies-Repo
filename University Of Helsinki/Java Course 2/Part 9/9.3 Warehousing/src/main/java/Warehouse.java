

public class Warehouse {

    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        
        if (capacity > 0.0) {
            
            this.capacity = capacity;
            
        } else {
            
            this.capacity = 0.0;
            
        }//end else if

        this.balance = 0.0;
        
    }//end Warehouse

    public double getBalance() {
        
        return this.balance;
        
    }//end getBalance

    public double getCapacity() {
        
        return this.capacity;
        
    }//end getCapacity

    public double howMuchSpaceLeft() {
        
        return this.capacity - this.balance;
        
    }//end howMuchSpaceLeft

    public void addToWarehouse(double amount) {
        
        if (amount < 0) {
            
            return;
            
        }//end if
        
        if (amount <= howMuchSpaceLeft()) {
            
            this.balance = this.balance + amount;
            
        } else {
            
            this.balance = this.capacity;
            
        }//end else if
        
    }//end addToWarehouse

    public double takeFromWarehouse(double amount) {
        
        if (amount < 0) {
            
            return 0.0;
            
        }//end if
        
        if (amount > this.balance) {
            
            double allThatWeCan = this.balance;
            this.balance = 0.0;
            return allThatWeCan;
            
        }//end if

        this.balance = this.balance - amount;
        return amount;
        
    }//end takeFromWarehouse

    public String toString() {
        
        return "balance = " + this.balance + ", space left " + howMuchSpaceLeft();
        
    }//end toString
    
}//end class
