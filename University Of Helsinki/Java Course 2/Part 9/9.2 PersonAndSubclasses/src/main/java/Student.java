
public class Student extends Person {
    
    private int credits;
    
    public Student(String name, String address) {
        
        super(name, address);
        this.credits = 0;
        
    }//end Student
    
    public int credits() {
        
        return this.credits;
        
    }//end credits;
    
    public void study() {
        
        this.credits++;
        
    }//end study
    
    @Override
    public String toString() {
        
        return super.toString() + " \n" + "  Study credits " + this.credits;
        
    }
    
}//end class
