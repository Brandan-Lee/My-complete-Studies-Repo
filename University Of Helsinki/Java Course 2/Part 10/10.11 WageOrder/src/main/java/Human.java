
public class Human implements Comparable<Human> {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        
        this.name = name;
        this.wage = wage;
        
    }//end constructor

    public String getName() {
        
        return name;
        
    }//end getName

    public int getWage() {
        
        return wage;
        
    }//end getWage

    @Override
    public String toString() {
        
        return name + " " + wage;
        
    }//end toString
    
    @Override
    public int compareTo(Human obj) {

        if (this.getWage() == obj.wage) {
            
            return 0;

        }//end if

        return obj.getWage() - this.getWage();

    }//end compareTo
    
}//end 
