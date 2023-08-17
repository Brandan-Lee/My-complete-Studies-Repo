
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    
    public Room(){
        persons = new ArrayList<>();
    }//end Room
    
    public void add(Person person){
        this.persons.add(person);
    }//end add
    
    public boolean isEmpty(){
        return this.persons.isEmpty();
    }//end isEmpty
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }//end getPersons
    
    public Person shortest(){
        
        if (this.persons.isEmpty()){
            return null;
        }//end if
        
        Person returnPerson = this.persons.get(0);
        
        for (Person person : persons){
            
            if (returnPerson.getHeight() > person.getHeight()){
                returnPerson = person;
            }//end if
            
        }//end for
        
        return returnPerson;
    }//end shortest
    
    public Person take(){
        
        if (this.persons.isEmpty()){
            return null;
        }//end if
        
        Person takePerson = this.persons.get(0);
        
        for (Person person : persons){
            
            if (takePerson.getHeight() > person.getHeight()){
                takePerson = person;
            }//end if
            
        }//end for
        
        this.persons.remove(takePerson);
        return takePerson;
    }//end take
}//end class
