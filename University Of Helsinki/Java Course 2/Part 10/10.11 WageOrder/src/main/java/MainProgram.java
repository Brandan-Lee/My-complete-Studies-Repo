
/*
You are provided with the class Human. A human has a name and wage information.
Implement the interface Comparable in a way, such that the overridden compareTo
method sorts the humans according to wage from largest to smallest salary.
*/

import java.util.ArrayList;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("Matti", 150000));
        humans.add(new Human("Merja", 500));
        humans.add(new Human("Pertti", 80));

        System.out.println(humans);
        Collections.sort(humans);
        System.out.println(humans);

    }//end main
    
    /*
    [Matti 150000, Merja 500, Pertti 80]
    [Matti 150000, Merja 500, Pertti 80]
    */
    
}//end class
