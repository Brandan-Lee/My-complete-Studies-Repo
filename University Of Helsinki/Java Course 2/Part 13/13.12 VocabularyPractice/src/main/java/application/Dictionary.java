
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Dictionary {
    
    private HashMap<String, String> hmTranslations;
    private ArrayList<String> alWords;
    
    public Dictionary() {
        
        this.hmTranslations = new HashMap<>();
        this.alWords = new ArrayList<>();
        
    }//end constructor
    
    public String get(String word) {
        
        return this.hmTranslations.get(word);
        
    }//end get
    
    public void add(String word, String translation) {
        
        if (!this.hmTranslations.containsKey(word)) {
            
            this.alWords.add(word);
            
        }//end if
        
        this.hmTranslations.put(word, translation);
        
    }//end add
    
    public String getRandomWord() {
        
        Random random = new Random();
        return this.alWords.get(random.nextInt(this.alWords.size()));
        
    }//end getRandomWord
    
}//end class
