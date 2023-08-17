
public class Person {
    
    private String name;
    private Education education;
    
    public Person(String name, Education education) {
        
        this.name = name;
        this.education = education;
        
    }//end constructor
    
    public Education getEducation() {
        
        return this.education;
        
    }//end getEducation
    
    public String toString() {
        
        return this.name + ", " + this.education;
        
    }
    
}//end class
