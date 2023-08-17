
/*
Implement a class called Pipe, which has a single generic parameter type. The 
pipe works, such that we can add values into it and values can be taken out. 
Adding to the pipe happens from one end, and taking out from the other end. In 
other words, we always remove the value which has been inside the pipe the 
longest and add to it the newest value. The class should provide a parameterless
constructor as well as the following three methods:

public void putIntoPipe(T value) puts an object with a type in accordance with 
the type parameter given to the the class into the pipe.
public T takeFromPipe() takes out the value, which has been in the pipe the 
longest. In case there is nothing in the pipe, return null. Calling the method
returns the value, which has been in the pipe the longest, and removes it from 
the pipe.
public boolean isInPipe() returns the value true if the pipe has values. In case
the pipe is empty, it returns the value false.
Use ArrayList to implement the internal functionality of the class.
 */
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Pipe<String> pipe = new Pipe<>();
//        pipe.putIntoPipe("dibi");
//        pipe.putIntoPipe("dab");
//        pipe.putIntoPipe("dab");
//        pipe.putIntoPipe("daa");
//        
//        while (pipe.isInPipe()) {
//            
//            System.out.println(pipe.takeFromPipe());
//        }
    }//end main

}//end class
