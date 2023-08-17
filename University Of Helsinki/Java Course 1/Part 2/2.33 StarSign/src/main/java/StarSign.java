
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }//end main

    public static void printStars(int number) {
        // first part of the exercise
        for (int i = 0; i < number; i++){
            System.out.print("*");
        }//end for loop
        System.out.println("");
    }//end printStars

    public static void printSquare(int size) {
        // second part of the exercise
        for (int i = 0; i < size; i++){
            printStars(size);
        }//end for loop
    }//end printSquare

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        for (int i = 0;i < height; i++){
            printStars(width);
        }//end for loop
    }//end printRectangle

    public static void printTriangle(int size) {
        // fourth part of the exercise
        for (int i = 1; i <= size; i++){
            printStars(i);
        }//end for loop
    }//end printTriangle
}//end class
