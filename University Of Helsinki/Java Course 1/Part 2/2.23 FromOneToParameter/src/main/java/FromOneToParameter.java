
/*
Create the following method in the exercise template: public static void
printUntilNumber(int number). It should print the numbers from one to the
number passed as a parameter. Two examples of the method's usage are given
below.
*/

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(2);
    }//end main

    public static void printUntilNumber (int number) {
        int i = 1;
        while (i <= number){
            System.out.println(i);
            i++;
        }//end while loop
    }//end printUntilNumber
    
    /*
    Number = 5
    1
    2
    3
    4
    5
    
    Number = 2
    1
    2
    */
}//end class
