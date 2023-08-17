/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Spider
 */
public class Archive {
  
    private String identifier;
    private String name;
    
    public Archive(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }//end archive
    
    public String getIdentifier(){
        return this.identifier;
    }//end getIdentifier
    
    public String getName(){
        return this.name;
    }//end getName
    
//    public boolean equals(Object compared){
//     
//        if (this == compared){
//            return true;
//        }//end if
//        
//        if (!(compared instanceof Archive)){
//            return false;
//        }//end if
//        
//        Archive comparedItems = (Archive) compared;
//        
//        return this.identifier.equals(comparedItems.identifier);
//    }//end equals
}//end class

