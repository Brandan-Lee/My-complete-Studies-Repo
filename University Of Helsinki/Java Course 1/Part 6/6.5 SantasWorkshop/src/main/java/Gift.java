/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Spider
 */
public class Gift {

    private String name;
    private int weight;

    public  Gift(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }//end Package

    public String getName() {
        return this.name;
    }//end getName

    public int getWeight() {
        return this.weight;
    }//end getWeight

    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }//end toString
    
}//end class
