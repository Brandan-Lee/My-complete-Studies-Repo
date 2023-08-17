
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> employees;
    
    public Employees() {
        
        this.employees = new ArrayList<>();
        
    }//end constructor
    
    public void add(Person personToAdd) {
        
        this.employees.add(personToAdd);
        
    }//end add
    
    public void add(List<Person> peopleToAdd) {
        
        Iterator<Person> iterator = peopleToAdd.iterator();
        
        while (iterator.hasNext()) {
            
            iterator.forEachRemaining(person -> employees.add(person));
            
        }//end while
        
    }//end class
    
    public void print() {
        
        for (Person p : this.employees) {
            
            System.out.println(p);
            
        }//end for
        
    }//end print
    
    public void print(Education education) {
        
        Iterator<Person> iterator = this.employees.iterator();
        
        while (iterator.hasNext()) {
            
            Person nextPerson = iterator.next();
            
            if (nextPerson.getEducation() == education) {
                
                System.out.println(nextPerson);
                
            }//end if
            
        }//end while
        
    }//end print
    
    public void fire(Education education) {
        
        Iterator<Person> iterator = this.employees.iterator();
        
        while (iterator.hasNext()) {
            
            if (iterator.next().getEducation() == education) {
                
                iterator.remove();
                
            }//end if
            
        }//end while
        
    }//end fire
            
}//end class
