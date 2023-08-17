
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
public class Package {
    private ArrayList<Gift> gifts;
   
    public Package(){
        gifts = new ArrayList<>();
    }//end Package
    
    public void addGift(Gift gift){
        gifts.add(gift);
    }//end addGift
    
    public int totalWeight(){
        
        if (gifts.isEmpty()){
            return -1;
        }//end if
        
        int totalWeight = 0;
        
        for (Gift gift : gifts){
            totalWeight += gift.getWeight();
        }//end for
        
        return totalWeight;
    }//end totalWeight
}//end class
