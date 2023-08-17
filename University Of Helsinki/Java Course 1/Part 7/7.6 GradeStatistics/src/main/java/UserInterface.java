
import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private GradeRegister register;
    
    public UserInterface(Scanner scanner, GradeRegister register) {
        this.scanner = scanner;
        this.register = register;
    }//end UserInterface
    
    public void start() {
        readPoints();
        System.out.println("");
        printAverageAll();
        printAveragePassing();
        printPassingPercentage();
        printGradeDistribution();
    }//end start
    
    public void readPoints() {
        System.out.println("Enter points totals, -1 stops:");
        
        while (true) {
        String input = scanner.nextLine();
        int points = Integer.valueOf(input);
        
        if (points == -1) {
            break;
        }//end if
        
        if (points < 0 || points > 100) {
            continue;
        }//end if
        
        this.register.addPoints(points);
        }//end while
        
    }//end readPoints
    
    public void printAverageAll() {
        System.out.println("Point average (all): " + 
                register.averageOfPointsAll());
    }//end printAverageAll
    
    public void printAveragePassing() {
        String nonePassing = "-";
        
        if (this.register.averageOfPassingPoints() == 0.00) {
            System.out.println("Point average (passing): " + nonePassing);
        } else {
            System.out.println("Point average (passing): " + 
                    this.register.averageOfPassingPoints());
        }//end else if
        
    }//end printAveragePassing
    
    public void printPassingPercentage() {
        System.out.println("Pass percentage: " + this.register.passPercentage());
    } //end prinPassPercentage
    
    public void printGradeDistribution() {
        System.out.println("Grade distribution:");
        
        int grade = 5;
        
        while (grade >= 0) {
            int stars = this.register.totalGradesFromPoints(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");
            grade--;
        }//end while
        
    }//end printGradeDistribution
    
    public static void printStars(int stars) {
        
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }//end while
        
    }//end printStars
}//end class
