
public class Organism implements Movable {
    
    private int x;
    private int y;
    
    public Organism(int x, int y) {
        
        this.x = x;
        this.y = y;
        
    }//end constructor
    
    public void move(int dx, int dy) {
        
        this.x += dx;
        this.y += dy;
        
    }//end move
    
    public String toString() {
        
        return "x: " + this.x + "; y: " + this.y;
        
    }//end toString
    
}//end class
