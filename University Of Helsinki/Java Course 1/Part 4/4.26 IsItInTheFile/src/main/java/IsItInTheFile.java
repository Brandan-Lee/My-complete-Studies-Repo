
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(file))) {

            while (reader.hasNextLine()) {
                list.add(reader.nextLine());

            }//end while
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed");
        }//end try catch

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        while (true) {
            if (list.contains(searchedFor)) {
                System.out.println("Found!");
                break;
            } else {
                System.out.println("Not found.");
                break;
            }//end else if
        }//end while
    }//end main
}//end class
