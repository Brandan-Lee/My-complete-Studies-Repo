
/*
In the exercise base there is a class called Song that can be used to
create new objects that represent songs. Add to that class the equals
method so that the similarity of songs can be examined.
*/

public class Main {

    public static void main(String[] args) {
        // you can write code here for testing your program

        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }//end if

        if (jackSparrow.equals("Another object")) {
            System.out.println("Strange things are afoot.");
        }//end if
        
    }//end main
    
    /*
    Example of output
    Songs are equal
    */
    
}//end class
