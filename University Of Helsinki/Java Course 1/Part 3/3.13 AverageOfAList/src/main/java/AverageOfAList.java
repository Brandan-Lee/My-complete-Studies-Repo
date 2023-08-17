
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        double average = 0;
        
        while (true){
            int in = Integer.valueOf(scanner.nextLine());
            if (in == -1){
                break;
            }//end if
            
            numbers.add(in);
        }//end while
        
        for (int i: numbers){
            sum += i;
        }//end for
        average = (double) sum / numbers.size();
        
        System.out.println("Average: " + average);
    }//end main
}//end class
