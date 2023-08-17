
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> hm;
    
    public DictionaryOfManyTranslations() {
        
        this.hm = new HashMap<>();
        
    }//end DictionaryOfManyTranslations
    
    public void add(String word, String translation) {
        
        this.hm.putIfAbsent(word, new ArrayList<String>());
        this.hm.get(word).add(translation);
        
    }//end add
    
    public ArrayList<String> translate(String word) {
        
        ArrayList<String> empty = new ArrayList<>();
        return this.hm.getOrDefault(word, empty);
        
    }//end translate
    
    public void remove(String word) {
        
        this.hm.remove(word);
        
    }//end remove
}//end class
