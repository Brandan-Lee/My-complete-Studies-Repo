
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {

            String row = scanner.nextLine();

            if (row.equalsIgnoreCase("end")) {

                System.out.println("Print the average of the negative numbers"
                        + " or the positive numbers? (n/p)");
                String userInput = scanner.nextLine();

                if (userInput.isEmpty()) {

                    continue;

                } else if (userInput.equalsIgnoreCase("n")) {

                    double averageOfNegatives = input.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .filter(i -> i < 0)
                            .average()
                            .getAsDouble();

                    System.out.println("Average of the negative numbers: "
                            + averageOfNegatives);

                } else if (userInput.equalsIgnoreCase("p")) {

                    double averageOfPositives = input.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .filter(i -> i > 0)
                            .average()
                            .getAsDouble();

                    System.out.println("Average of the positive numbers: "
                            + averageOfPositives);

                }//end if else if else if
                
                break;
                
            }//end if

            input.add(row);

        }//end while

        

    }//end main

}//end class
