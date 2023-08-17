
/*
implement a class List. This exercise has no tests — test your class using the
examples in the material and your own tests. This exercise is worth 2 points.
*/

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//add
//        List<String> myList = new List<>();
//        myList.add("hello");
//        myList.add("world");

//        List<String> myList = new List<>();
//        for (int i = 0; i < 11; i++) {
//
//            myList.add("hello");
//
//        }//end for

//contains
//        List<String> myList = new List<>();
//        System.out.println(myList.contains("hello"));
//        myList.add("hello");
//        System.out.println(myList.contains("hello"));

//remove
//        List<String> myList = new List<>();
//        System.out.println(myList.contains("hello"));
//        myList.add("hello");
//        System.out.println(myList.contains("hello"));
//        myList.remove("hello");
//        System.out.println(myList.contains("hello"));

//search
//        List<String> myList = new List<>();
//        System.out.println(myList.contains("hello"));
//        myList.add("hello");
//        System.out.println(myList.contains("hello"));
//        int index = myList.indexOfValue("hello");
//        System.out.println(index);
//        System.out.println(myList.value(index));
//        myList.remove("hello");
//        System.out.println(myList.contains("hello"));

//size
        List<String> myList = new List<>();
        myList.add("hello");
        myList.add("world");

        for (int i = 0; i < myList.size(); i++) {
            
            System.out.println(myList.value(i));
            
        }//end for

    }//end main

    /*
    Examples of output
    //contains method
    false
    true
    
    //remove method
    false
    true
    false
    
    //search method
    false 
    true
    0
    hello
    false
    
    //size method
    hello
    world
     */
}//end class
