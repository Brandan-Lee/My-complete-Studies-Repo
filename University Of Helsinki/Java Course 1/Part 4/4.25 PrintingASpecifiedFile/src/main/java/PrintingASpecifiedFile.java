
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String file = scanner.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(file))){
            while (reader.hasNextLine()){
                String row = reader.nextLine();
                System.out.println(row);
            }//end while
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }//end try and catch
        
    }//end main
    
}//end class
