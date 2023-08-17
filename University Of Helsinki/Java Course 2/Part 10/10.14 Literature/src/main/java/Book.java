
public class Book {
    
    private String name;
    private int ageRec;
    
    public Book(String name, int ageRec) {
        
        this.name = name;
        this.ageRec = ageRec;
        
    }//end constructor
    
    public String getName() {
        
        return this.name;
        
    }//end getName
    
    public void setName(String name) {
        
        this.name = name;
        
    }//end setName
    
    public int getAgeRec() {
        
        return this.ageRec;
        
    }//end getAgeRec
    
    public void setAgeRec(int ageRec) {
        
        this.ageRec = ageRec;
        
    }//end setAgeRec
    
    public String toString() {
        
        return this.name + " (recommended for " + this.ageRec + " year-olds or "
                + "older";
        
    }//end toString
    
}//end class
