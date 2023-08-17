
import java.util.ArrayList;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> Items;

    public Suitcase(int maximumWeight) {
        
        this.Items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
        
    }//end constructor

    public void addItem(Item Item) {
        
        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            
            return;
            
        }//end if

        this.Items.add(Item);
        
    }//end addItem

    public int totalWeight() {
        
        int summa = 0;
//        int indeksi = 0;
        
        summa = Items.stream()
                .map(items -> items.getWeight())
                .reduce(0, (a, b) -> a + b);

        return summa;
        
    }//end totalWeight

    public void printItems() {
        
        int indeksi = 0;
        
        while (indeksi < this.Items.size()) {
            
        Item t = this.Items.get(indeksi);
        System.out.println(t);
        indeksi++;
        
        }//end while
        
    }//end printItems

    public Item heaviestItem() {
        
        if (this.Items.isEmpty()) {
            
            return null;
            
        }//end if

        // Tutustumme järjestämiseen hieman myöhemmin kurssilla
        return this.Items.stream()
                .max((t1, t2) -> t1.getWeight() - t2.getWeight())
                .get();
        
    }//end heaviestItem

    @Override
    public String toString() {
        
        if (this.Items.isEmpty()) {
            
            return "no items (0 kg)";
            
        }//end if

        if (this.Items.size() == 1) {
            
            return "1 item (" + this.totalWeight() + " kg)";
            
        }//end if

        return this.Items.size() + " items (" + this.totalWeight() + " kg)";
        
    }//end toString
    
}//end class
