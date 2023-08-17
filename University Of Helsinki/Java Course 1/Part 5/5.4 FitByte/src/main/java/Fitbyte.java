/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Spider
 */
public class Fitbyte {

    private int age;
    private int restingheartRate;

    public Fitbyte(int age, int restingHeartrate) {

        this.age = age;
        this.restingheartRate = restingHeartrate;

    }//end Fitbyte

    public double targetHeartRate(double percentageOfMaximum) {

        double maximumHeartRate = 206.3 - (0.711 * this.age);
        return (maximumHeartRate - this.restingheartRate)
                * (percentageOfMaximum) + this.restingheartRate;
        
    }//end targetHeartRate
}//end class
