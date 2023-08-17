
/*
Add the following methods to the Main class:

public static void sort(int[] array) that sorts an array of integers.
public static void sort(String[] array) that sorts an array of strings.
public static void sortIntegers(ArrayList<Integer> integers) that sorts a list
of integers.
public static void sortStrings(ArrayList<String> strings) that sorts a list of
strings.
Be sure to use the ready-made Java libraries in your implementation.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};

        // array of strings
        String[] stringArray = {"bobbity", "fobbity", "ribbity", "hobbity", "skip"};
        // ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(4);
        numbers.add(-4);
        numbers.add(2);
        numbers.add(9);
//        // ArrayList of strings
        ArrayList<String> strings = new ArrayList<>();
        strings.add("x");
        strings.add("i");
        strings.add("k");
        strings.add("y");
        strings.add("j");
        strings.add("z");

        // Use sort method defined below to sort an 
        // array of integers
        System.out.println("Array of integers");
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("");

//         Another sort method for sorting strings
        System.out.println("Array of strings");
        System.out.println(Arrays.toString(stringArray));
        sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        System.out.println("");

//        // Use method to sort an ArrayList of numbers
        System.out.println("ArrayList of numbers");
        System.out.println(numbers);
        sortIntegers(numbers);
        System.out.println(numbers);
        System.out.println("");

//        // Another method to sort an ArrayList of strings
        System.out.println("ArrayList of strings");
        System.out.println(strings);
        sortStrings(strings);
        System.out.println(strings);
        System.out.println("");
    }//end main

    public static void sort(int[] array) {
        Arrays.sort(array);
    }//end sort

    public static void sort(String[] array) {
        Arrays.sort(array);
    }//end sort

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }//end sortIntegers

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }//end sortStrings

    /*
    Examples of output
    1st sort method integers
    Array of integers
    [3, 1, 5, 99, 3, 12]
    [1, 3, 3, 5, 12, 99]
    
    2nd sort method Strings
    Array of strings
    [bobbity, fobbity, ribbity, hobbity, skip]
    [bobbity, fobbity, hobbity, ribbity, skip]
    
    Sort of ArrayList integers
    ArrayList of numbers
    [3, 5, 4, -4, 2, 9]
    [-4, 2, 3, 4, 5, 9]
    
    Sort of ArrayList Strings
    ArrayList of strings
    [x, i, k, y, j, z]
    [i, j, k, x, y, z]
     */
}//end class
