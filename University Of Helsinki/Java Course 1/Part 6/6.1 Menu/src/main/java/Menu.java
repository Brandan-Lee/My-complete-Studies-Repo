
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    
    public void addMeal(String meal){
        
        if (this.meals.contains(meal)){
            return;
        } else {
            this.meals.add(meal);
        }//end else if
        
    }//end addMeal
    
    public void printMeals(){
        
        for (String meal: this.meals){
            System.out.println(meal);
        }//end for
    
    }//end printMeals
    
    public void clearMenu(){
        this.meals.clear();
    }//end clearMenu
}//end class
