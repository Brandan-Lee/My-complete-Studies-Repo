/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Spider
 */
public class Counter {

    private int startValue;

    public Counter(int startValue) {
        this.startValue = startValue;
    }//end 1st counter\

    public Counter() {
        this(0);
    }//end 2nd Counter

    public int value() {
        return this.startValue;
    }//end value

    public void increase() {
        this.startValue++;
    }//end 1st increase

    public void increase(int increaseBy) {

        if (increaseBy >= 0) {
            this.startValue = this.startValue + increaseBy;
        }//end if

    }//end 2nd increase

    public void decrease() {
        this.startValue--;
    }//end 1st decrease

    public void decrease(int decreaseBy) {

        if (decreaseBy >= 0) {
            this.startValue = this.startValue - decreaseBy;
        }//end if
        
    }//end 2nd decrease
    
    public String toString(){
        return "Start value: " + this.startValue;
    }//end toString
}//end class
