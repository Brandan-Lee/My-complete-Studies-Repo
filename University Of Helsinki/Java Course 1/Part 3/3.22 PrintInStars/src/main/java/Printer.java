
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }//end main

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i]; j++){
                System.out.print("*");
            }//end for 2
            System.out.println("");
        }//end for 1
    }//end printArrayInStars

}//end class
