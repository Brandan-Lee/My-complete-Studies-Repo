


public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        
    }//end constructor

    public String getFirstName() {
        
        return firstName;
        
    }//end getFirstName

    public String getLastName() {
        
        return lastName;
        
    }//end getLastName

    public int getBirthYear() {
        
        return birthYear;
        
    }//end getBirthYear

}
