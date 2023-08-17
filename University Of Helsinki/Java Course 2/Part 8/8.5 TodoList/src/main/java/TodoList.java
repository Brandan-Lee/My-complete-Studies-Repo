
import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> list;
    
    public TodoList() {
        this.list = new ArrayList<>();
    }//end TodoList
    
    public void add(String task) {
        this.list.add(task);
    }//end add
    
    public void print() {
        
        int i = 1;
        
        for (String task : list) {
            System.out.println(i + ": " + task);
            i++;
        }//end for
        
    }//end print
    
    public void remove(int number) {
        number -= 1;
        this.list.remove(number);
    }//end remove
    
}//end class
