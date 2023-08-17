
/*
Create the following method in the exercise template: public static void
printFromNumberToOne(int number). It should print the numbers from the number
passed as a parameter down to one. Two examples of the method's usage are
given below.
*/

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(2);
    }//end main
    
    public static void printFromNumberToOne(int number) {
        int i = 1;
        while (number >= i) {
            System.out.println(number);
            number--;
        }
    }//end print
    
    /*
    number 5
    5
    4
    3
    2
    1
    
    Number 2
    2
    1
    */
    
}//end class
