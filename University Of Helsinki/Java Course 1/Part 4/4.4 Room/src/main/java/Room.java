/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
Create a class named Room. Add the variables private String code and
private int seats to the class. Then create a constructor public
Room(String classCode, int numberOfSeats) through which values are
assigned to the instance variables.
 */
/**
 *
 * @author Spider
 */
public class Room {

    private String code;
    private int seats;

    public Room(String classCode, int numberOfSeats) {

        this.code = classCode;
        this.seats = numberOfSeats;

    }//end Room

}//end class
