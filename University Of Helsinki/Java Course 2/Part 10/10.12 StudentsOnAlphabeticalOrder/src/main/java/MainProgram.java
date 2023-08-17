
/*
The exercise template includes the class Student, which has a name. Implement 
the Comparable interface in the Student class in a way, such that the compareTo
method sorts the students in alphabetical order based on their names.

The name of the Student is a String, which implements Comparable itself. You may
use its compareTo method when implementing the method for the Student class. 
Note that String.compareTo() also treats letters according to their size, while
the compareToIgnoreCase method of the same class ignores the capitalization 
completely. You may either of these methods in the exercise.
*/

public class MainProgram {

    public static void main(String[] args) {
        
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        System.out.println(first.compareTo(second));
        
    }//end main
    
    /*
    
    */
    
}//end class
