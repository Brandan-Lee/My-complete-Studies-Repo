
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
//        int[] array = {3, 1, 5, 99, 3, 12};

//        int[] numbers = {6, 5, 8, 7, 11};
//        System.out.println("Smallest: " + MainProgram.smallest(numbers));
//        int[] numbers = {6, 5, 8, 7, 11};
//        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
//        int[] numbers = {-1, 6, 9, 8, 12};
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

//        int[] numbers = {3, 2, 5, 4, 8};
//
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 1, 0);
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 0, 3);
//        System.out.println(Arrays.toString(numbers));


    }//end main

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < smallest) {
                smallest = array[i];
            }//end if

        }//end for
        return smallest;
    }//end smallest

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }//end if

        }//end for
        return index;
    }//end indexOfSmallest

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int smallest = table[index];

        for (int i = startIndex; i < table.length; i++) {

            if (table[i] < smallest) {
                smallest = table[i];
                index = i;
            }//end if

        }//end for

        return index;
    }//end indexOfSmallest

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }//end swap
    
    public static void sort(int[] array) {
        int index = 0;
        System.out.println(Arrays.toString(array));
        
        while (index < array.length) {
            swap(array, index, indexOfSmallestFrom(array, index));
            System.out.println(Arrays.toString(array));
            index++;
        }//end while
        
    }//end sort
    
}//end class
