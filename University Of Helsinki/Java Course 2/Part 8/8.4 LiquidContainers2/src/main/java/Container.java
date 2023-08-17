
public class Container {

    private int amount;

    public Container() {
        this.amount = 0;
    }//end Container

    public int contains() {
        return this.amount;
    }//end contains

    public void add(int amount) {

        if (amount < 0) {
            return;
        }//end if

        this.amount += amount;

        if (this.amount >= 100) {
            this.amount = 100;
        }//end if

    }//end add

    public void remove(int amount) {

        if (amount < 0) {
            return;
        }//end if

        this.amount -= amount;

        if (this.amount < 0) {
            this.amount = 0;
        }//end if
        
    }//end remove

    public String toString() {
        return this.amount + "/100";
    }
}//end class
