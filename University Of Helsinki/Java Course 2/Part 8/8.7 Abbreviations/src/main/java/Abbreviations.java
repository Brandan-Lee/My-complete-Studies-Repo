
import java.util.HashMap;

public class Abbreviations {
    
    private HashMap<String, String> map;
    
    public Abbreviations() {
        this.map = new HashMap<>();
    }//end Abbreviations
    
    public void addAbbreviation(String abbreviation, String explanation) {
        this.map.put(abbreviation, explanation);
    }//end addAbbreviation
    
    public boolean hasAbbreviation(String abbrevaition) {
        return this.map.containsKey(abbrevaition);
    }//end hasAbbrevaition
    
    public String findExplanationFor(String abbreviation) {
        return this.map.get(abbreviation);
    }//end findExplanationFor
    
}//end class
