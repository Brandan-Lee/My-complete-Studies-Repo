
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("first");
        names.add("second");
        names.add("second");
        names.add("second");

        System.out.println(returnSize(names));

    }//end main
    
    public static int returnSize(Set<String> aSet) {
        
        return aSet.size();
        
    }//end returnSize
    
}//end class
