/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Spider
 */
public class Film {

    private String name;
    private int ageRating;

    public Film(String filmName, int filmAgeRating) {
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }//end film

    public String name() {
        return name;
    }//end name

    public int ageRating() {
        return ageRating;
    }//end agerating
    
}//end class
