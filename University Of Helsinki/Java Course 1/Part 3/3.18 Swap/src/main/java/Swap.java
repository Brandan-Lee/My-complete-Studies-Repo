
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
      System.out.println("Give two indices to swap: ");

        // Implement here
        // asking for the two indices
        int i = Integer.valueOf(scanner.nextLine());
        int j = Integer.valueOf(scanner.nextLine());  
        // and then swapping them
        int swap = array[i];
        array[i] = array[j];
        array[j] = swap;
      
  

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
