
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;
    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.points = new ArrayList<Integer>();
        this.passingPoints = new ArrayList<>();
        this.grades = new ArrayList<>();
    }//end GradeRegister

    public void addPoints(int points) {
        this.points.add(points);

        if (points >= 50) {
            this.passingPoints.add(points);
        }//end if

        this.grades.add(pointsToGrade(points));
    }//end addPoints

    public double averageOfPointsAll() {
        int lengthAll = this.points.size();
        int total = 0;

        if (this.points.isEmpty()) {
            return -1;
        } else {

            for (Integer point : this.points) {
                total += point;
            }//end for

        }//end else if
        return 1.0 * total / lengthAll;
    }//end averagePointsAll

    public double averageOfPassingPoints() {
        int passingLength = passingPoints.size();
        int total = 0;

        if (passingPoints.isEmpty()) {
            return 0.00;
        } else {

            for (Integer passingPoint : passingPoints) {
                total += passingPoint;
            }//end for

        }//end if else

        return 1.0 * total / passingLength;
    }//end averageOfPassingPoints

    public double passPercentage() {
        int participants = this.points.size();
        int passing = this.passingPoints.size();
        double passingRatio = (double) passing / participants;
        
        if (participants == 0) {
            return -1;
        } else {
            return 100.00 * passingRatio;
        }//end else if

    }//end passPercentage

    public static int pointsToGrade(int points) {
        int grade = 0;

        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }// end else ifs if

        return grade;
    }//end pointsToGrade

    public int totalGradesFromPoints(int grade) {
        int total = 0;

        for (Integer received : this.grades) {

            if (received == grade) {
                total++;
            }//end if

        }//end for
        return total;
    }//end totalGradesFromPoints
}//end class
