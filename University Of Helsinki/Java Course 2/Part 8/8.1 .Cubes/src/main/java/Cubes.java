
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            final String value = scanner.nextLine();
            
            if (value.equalsIgnoreCase("end")) {
                break;
            } else {
                System.out.println(calculateCube(Integer.valueOf(value)));
            }
        }//end while
         
    }//end main
    
    public static int calculateCube (int number) {
        return number * number * number;
    }//end calculateCube
}
