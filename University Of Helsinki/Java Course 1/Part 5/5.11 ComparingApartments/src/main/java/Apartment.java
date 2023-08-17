
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }//end apartment
    
    public boolean largerThan(Apartment compared){
        
        if((this.squares * rooms) > (compared.squares * compared.rooms)){
            return true;
        } else {
            return false;
        }//end else if
        
    }//end largerThan
    
    public int priceDifference(Apartment compared){
        
        int firstValue = this.princePerSquare * this.squares;
        int secondValue = compared.princePerSquare * compared.squares;
        int difference = firstValue - secondValue;
        
        if (difference >= 0){
            return difference;
        } else {
            return -1 * difference;
        }//end else if
        
    }//end priceDifference
    
    public boolean moreExpensiveThan(Apartment compared){
        
        if (this.princePerSquare > compared.princePerSquare){
            return true;
        } else {
            return false;
        }//end else if
        
    }//end moreExpensiveThan
}//end class
