
/*
Write a method public static void division(int numerator, int denominator)
that prints the result of the division of the numerator by the denominator.
Keep in mind that the result of the division of the integers is an integer —
in this case we want the result to be a floating point number.
*/

public class Division {

    public static void main(String[] args) {
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"
        division(3, 5);
        // division(3, 5);
    }//end main

    // implement the method here
    public static void division (int numerator, int denominator){
        System.out.println("" + numerator + " / " + denominator + " = " + 
                ((double) numerator / denominator));
    }//end division
}//end class
