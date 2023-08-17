
import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight) {

        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();

    }//end constructor

    public void addSuitcase(Suitcase Suitcase) {

        if (this.totalWeight() + Suitcase.totalWeight() > maximumWeight) {

            return;

        }//end if

        this.suitcases.add(Suitcase);

    }//end addSuitcase

    public int totalWeight() {

        int summa = 0;
//        int indeksi = 0;
    
        summa = suitcases.stream()
                .map(suitcases -> suitcases.totalWeight())
                .reduce(0, (a, b) -> a + b);
        
        return summa;

    }//end totalWeight

    public void printItems() {

        int indeksi = 0;

        while (indeksi < this.suitcases.size()) {

            this.suitcases.get(indeksi).printItems();
            indeksi++;

        }//end while

    }//end printItems

    @Override
    public String toString() {

        if (this.suitcases.isEmpty()) {

            return "no suitcases (0 kg)";

        }//end if

        if (this.suitcases.size() == 1) {

            return "1 suitcase (" + this.totalWeight() + " kg)";

        }//end if

        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";

    }//end toString

}//end class
