
/*
In this exercise we are going to create a program that allows for searching for
recipes based on their name, cooking time, or the name of an ingredient. The
program should read the recipes from a file that the user provides. It might be
a good idea to brush up on reading information from files (part 4) before
beginning

Each recipe consists of three or more rows in a recipe file. The first row is
for the name of the recipe, the second the cooking time (an integer), and the 
third and possibly following rows list the ingredients used in the recipe. An
empty row follows the last ingredient row. There can be many recipes in a 
single file. Below, an example file containing recipes is described.

Pancake dough
60
milk
egg
flour
salt
butter

Meatballs
20
ground meat
egg
breadcrumbs

Tofu rolls
30
tofu
rice
water
carrot
cucumber
avocado
wasabi

The program will be implemented in parts. First we'll create the possibility to
read and list recipes. After that we'll add the functionality to search for 
recipes based on their name, cooking time, or the name of an ingredient.

1. Reading and listing recipes
First create the functionality to read and list recipes. The user interface of 
the program is described below. You may assume that the user only enters files
that exist. Below we assume that the example recipes given earlier in the
exercise description are stored in the file recipes.txt.

2. Finding recipes by name
Make it possible to find recipes by their names. Finding by name is done with
the command find name, after which the user is asked for the name that is used
to search. The search should print all the recipes whose names contain the
string given by the user.

3. Searching for recipes by cooking time
Next, implement the possibility to find recipes based on their cooking time.
This is done with the command find cooking time, after which the user is asked 
for the longest acceptable cooking time. The program should react by printing 
all the recipes whose cooking times don't exceed the cooking time given by the 
user (so equal or less time).

4. Finding recipes based on their ingredients
Finally, add the functionality to search for recipes based on their ingredients.
This is done by choosing the command find ingredient, after which the user is 
asked for a string. The program should then print all the recipes that contain
the specified string. Notice that with this option the given string must match 
exactly the ingredient that is searched for (e.g. "ugar" will return different 
results than "sugar").
 */
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Objects;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final ArrayList<Recipe> recipes = new ArrayList<>();
        System.out.print("File to read: ");
        final String file = scanner.nextLine();
        System.out.println("");

        try (Scanner fileReader = new Scanner(new File(file))) {

            while (fileReader.hasNextLine()) {
                //read a recipe and create an object to represent it
                final String recipeName = fileReader.nextLine();
                int recipeTime = Integer.valueOf(fileReader.nextLine());
                Recipe recipe = new Recipe(recipeName, recipeTime);

                //add recipe to the list
                recipes.add(recipe);

                //add ingredients for the recipe
                while (fileReader.hasNextLine()) {
                    final String ingredient = fileReader.nextLine();

                    //ingredients end with an empty line
                    if (ingredient.isEmpty()) {
                        break;
                    }//end if

                    recipe.addIngredient(ingredient);
                }//end while
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }//end try catch

        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking "
                + "time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
//        System.out.println("find name - searches recipes by name");

        while (true) {
            System.out.print("Enter command: ");
            final String command = scanner.nextLine();

            if (command.equalsIgnoreCase("list")) {
                System.out.println("");
                System.out.println("Recipes:");

                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }//end for

                System.out.println("");
            } else if (command.equalsIgnoreCase("stop")) {
                break;
            } else if (command.equalsIgnoreCase("find name")) {
                System.out.print("Searched word: ");
                final String searchedWord = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");

                for (Recipe recipe : recipes) {

                    if (recipe.getname(searchedWord)) {
                        System.out.println(recipe);
                    }//end if

                }//end for
                System.out.println("");
            } else if (command.equalsIgnoreCase("find cooking time")) {
                System.out.print("Max cooking time: ");
                final int cookingTime = Integer.valueOf(scanner.nextLine());

                System.out.println("");
                System.out.println("Recipes:");

                for (Recipe recipe : recipes) {

                    if (recipe.cookingTimeAtMost(cookingTime)) {
                        System.out.println(recipe);
                    }//end if

                }//end for
                System.out.println("");
            } else if (command.equalsIgnoreCase("find ingredient")) {
                System.out.print("Ingredient: ");
                final String ingredient = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");

                for (Recipe recipe : recipes) {

                    if (recipe.getIngredients(ingredient)) {
                        System.out.println(recipe);
                    }//end if

                }//end for
                
            }//end else ifs if
            
        }//end while
        System.out.println("");
    }//end main
    
    /*
    Examples of output
    File to read: recipes.txt

    Commands:
    list - lists the recipes
    stop - stops the program

    Enter command: list

    Recipes:
    Pancake dough, cooking time: 60
    Meatballs, cooking time: 20
    Tofu rolls, cooking time: 30

    Enter command:  stop
    
    2.
    File to read: recipes.txt

    Commands:
    list - lists the recipes
    stop - stops the program
    find name - searches recipes by name
    
    Enter command: list
    
    Recipes:
    Pancake dough, cooking time: 60
    Meatballs, cooking time: 20
    Tofu rolls, cooking time: 30
    
    Enter command: find name
    Searched word: roll
    
    Recipes:
    Tofu rolls, cooking time: 30
    
    Enter command:  stop
    
    3.
    File to read: recipes.txt

    Commands:
    list - lists the recipes
    stop - stops the program
    find name - searches recipes by name
    find cooking time - searches recipes by cooking time
    
    Enter command: find cooking time
    Max cooking time: 30
    
    Recipes:
    Meatballs, cooking time: 20
    Tofu rolls, cooking time: 30    
    
    Enter command: find cooking time
    Max cooking time: 15
    
    Recipes:

    Enter command: find name
    Searched word: roll 

    Recipes:
    Tofu rolls, cooking time: 30

    Enter command:  stop
    
    4. 
    File to read: recipes.txt

    Commands:
    list - lists the recipes
    stop - stops the program
    find name - searches recipes by name
    find cooking time - searches recipes by cooking time
    find ingredient - searches recipes by ingredient

    Enter command: find cooking time
    Max cooking time: 30

    Recipes:
    Meatballs, cooking time: 20
    Tofu rolls, cooking time: 30

    Enter command: find ingredient
    Ingredient: sugar
    
    Recipes:
    Pancake dough, cooking time: 60
    
    Enter command: find ingredient
    Ingredient: egg
    
    Recipes:    
    Pancake dough, cooking time: 60
    Meatballs, cooking time: 20
    
    Enter command: find ingredient
    Ingredient: gg
    
    Recipes:
    
    Enter command:  stop
     */
    
}//end class

    