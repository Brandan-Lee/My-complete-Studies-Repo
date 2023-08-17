
import java.util.ArrayList;

public class Recipe {
    
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }//end Recipe
    
    public boolean cookingTimeAtMost(int max) {
        return this.cookingTime <= max;
    }//end getName
    
    public boolean getname(String searchedFor) {
        return this.name.contains(searchedFor);
    }//end setName
    
    public boolean getIngredients(String ingredient) {
        return this.ingredients.contains(ingredient);
    }//end getCookingTime
    
    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }//end setCookTime
    
    public String toString() {
       return this.name + ", cooking time: " + this.cookingTime;
    }//end toString
    
}//end class
