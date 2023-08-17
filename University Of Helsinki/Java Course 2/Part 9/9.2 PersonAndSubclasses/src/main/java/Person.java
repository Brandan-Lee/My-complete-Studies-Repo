
public class Person {
    
    private String name;
    private String address;
    
    public Person(String name, String address) {
        
        this.name = name;
        this.address = address;
        
    }//end Person
    
    @Override
    public String toString() {
        
        return this.name + "\n" + "  " + this.address;
        
    }//end toString
    
}//end class
