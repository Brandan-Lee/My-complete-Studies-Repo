
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));
        
    }//end main

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest,
            int largest) {

        int sum = 0;
        int start = fromWhere;
        int end = toWhere;

        if (fromWhere < 0) {

            start = 0;

        }//end if

        if (toWhere > array.length) {

            end = array.length;

        }//end if

        while (start < end) {

            if (array[start] <= largest && array[start] >= smallest) {

                sum += array[start];

            }//end if

            start++;

        }//end while

        return sum;

    }//end sum

}//end class
