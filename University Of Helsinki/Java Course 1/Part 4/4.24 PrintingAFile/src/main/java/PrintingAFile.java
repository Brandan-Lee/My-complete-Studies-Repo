
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(Paths.get("data.txt"))){
            
            while (scanner.hasNextLine()){
                String row = scanner.nextLine();
                System.out.println(row);
            }//end while
        
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }//end catch
    }//end main
}//end class
