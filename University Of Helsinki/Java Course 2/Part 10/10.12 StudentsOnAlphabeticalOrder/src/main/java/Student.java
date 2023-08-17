

public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        
        this.name = name;
        
    }//end constructor

    public String getName() {
        
        return name;
        
    }//end getName

    @Override
    public String toString() {
        
        return name;
        
    }//end toString

    public int compareTo(Student obj) {
        
        return this.getName().compareToIgnoreCase(obj.getName());
        
    }//end compareTo
    
}//end class
