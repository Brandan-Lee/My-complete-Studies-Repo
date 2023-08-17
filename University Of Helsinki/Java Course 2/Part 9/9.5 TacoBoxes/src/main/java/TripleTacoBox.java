
public class TripleTacoBox implements TacoBox {

    private int tacos;

    public TripleTacoBox() {

        this.tacos = 3;

    }//end constructor

    @Override
    public int tacosRemaining() {

        return this.tacos;

    }//end tacosRemaining
    
    @Override
    public void eat() {
        
        if (this.tacos != 0) {
            
            this.tacos--;
            
        }//end if
        
    }//end eat
    
}//end class
