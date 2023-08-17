
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Spider
 */
public class Stack {
    
    private ArrayList <String> stack;
    
    public Stack(){
        this.stack = new ArrayList<>();
    }//end Stack
    
    public boolean isEmpty(){
        
        if (stack.isEmpty()){
            return true;
        } else {
            return false;
        }//end else if
    
    }//end isEmpty
    
    public void add(String value){
        this.stack.add(0, value);
    }//end add
    
    public ArrayList<String> values(){
        return this.stack;
    }//end values
    
    public String take(){
        return this.stack.remove(0);
    }//end take
    
}//end class
