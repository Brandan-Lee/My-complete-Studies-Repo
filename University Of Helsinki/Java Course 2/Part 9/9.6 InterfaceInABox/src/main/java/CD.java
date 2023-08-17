
public class CD implements Packable {
    
    private String artist;
    private String nameOfCD;
    private int publicationYear;
    private double weightOfAllCDs;
    
    public CD(String artist, String nameOfCD, int publicationYear) {
        
        this.artist = artist;
        this.nameOfCD = nameOfCD;
        this.publicationYear = publicationYear;
        this.weightOfAllCDs = 0.1;
        
    }//end constructor
    
    @Override
    public double weight() {
        
        return this.weightOfAllCDs;
        
    }//end weight
    
    @Override
    public String toString() {
        
        return this.artist + ": " + this.nameOfCD + " (" + this.publicationYear 
                + ")";
        
    }//end toString
    
}//end class
