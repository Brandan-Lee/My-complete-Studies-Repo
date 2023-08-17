import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }//end JokeManager
    
    public void addJoke(String joke){
        this.jokes.add(joke);
    }//end addJoke
    
    public String drawJoke(){
        if(this.jokes.isEmpty()){
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            return jokes.get(index);
        }//end else if
    }//end drawJoke
    
    public void printJokes(){
        for(String joke: this.jokes){
            System.out.println(joke);
        }//end for
    }//end printJokes
}//end class