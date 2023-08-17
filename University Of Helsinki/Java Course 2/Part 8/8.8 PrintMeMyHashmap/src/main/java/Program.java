
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!

        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }//end main

    public static void printKeys(HashMap<String, String> hashmap) {

        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }//end for

    }//end printKeys

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {

        for (String key : hashmap.keySet()) {

            if (!key.contains(text)) {
                continue;
            }//end if

            System.out.println(key);
        }//end for

    }//end printKeysWhere

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {

        for (String key : hashmap.keySet()) {

            if (!key.contains(text)) {
                continue;
            }//end if

            System.out.println(hashmap.get(key));
        }//end for

    }//end printValuesOfKeysWhere

}//end class
