
public class Program {

    public static void main(String[] args) {
        // main program
        Die die = new Die(6);
        int i = 0;
        
        while (i < 10) {
            
            System.out.println(die.throwDie());
            i++;
            
        }//end while

    }//end main
    
    /*
    Examples of output. Random outputs
    1
    6
    6
    3
    5
    6
    3
    3
    1
    5
    */
    
}//end class
