

public class Checker {

    public Checker() {
        
    }//end constructor
    
    public boolean isDayOfWeek(String string) {
        
        if (string.toLowerCase().matches("mon|tue|wed|thu|fri|sat|sun")) {
            
            return true;
            
        } else {
            
            return false;
            
        }//end if else
        
    }//end isDayOfWeek
    
    public boolean allVowels(String string) {
        
        if (string.toLowerCase().matches("[aeiou]*")) {
            
            return true;
            
        } else {
            
            return false;
            
        }//end else if
        
    }//end allVowels
    
    public boolean timeOfDay(String string) {
        
        if (string.matches("([0-2][0-3]):([0-5][0-9]):([0-5][0-9])")) {
            
            return true;
            
        } else {
            
            return false;
            
        }//end else if
        
    }//end timeOfDay
    
}//end class
