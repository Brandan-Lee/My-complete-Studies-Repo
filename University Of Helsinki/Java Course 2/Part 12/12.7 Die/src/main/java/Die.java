
import java.util.Random;

public class Die {

    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        
        this.random = new Random();
        this.numberOfFaces = numberOfFaces;
        
    }//end constructor

    public int throwDie() {
        
        return this.random.nextInt(this.numberOfFaces) + 1;
        
    }//end throwDie
    
}//end class
