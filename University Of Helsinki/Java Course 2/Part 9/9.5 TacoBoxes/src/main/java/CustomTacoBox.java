
public class CustomTacoBox implements TacoBox {
    
    private int tacos;
    
    public CustomTacoBox(int tacos) {
        
        this.tacos = tacos;
        
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
