package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        
        if ((name != null && name.length() <= 40 && !name.equals("")) && 
                (age >=0 && age <= 120)) {
        
                this.name = name;
                this.age = age;
            
        } else {
            
            throw new IllegalArgumentException("The name entered was incorrect");
            
        }//end if else

    }//end constructor

    public String getName() {
        
        return name;
        
    }//end getName

    public int getAge() {
        
        return age;
        
    }//end getAge
    
}//end class
