
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todos;
    
    public TodoList() {
        this.todos = new ArrayList<String>();
    }//end TodoList
    
    public void add(String task) {
        this.todos.add(task);
    }//end add
    
    public void print() {
        
        for (String todo : todos) {
            System.out.println((todos.indexOf(todo) + 1) + ": " + todo);
        }//end for
        
    }//end print
    
    public void remove(int number) {
        this.todos.remove(number - 1);
    }//end remove
    
}//end class
