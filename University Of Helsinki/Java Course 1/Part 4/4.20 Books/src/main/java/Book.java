/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Spider
 */
public class Book {

    private String title;
    private int pages;
    private int publicationYear;

    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;

    }//end book

    public String getTitle() {
        return title;
        
    }//end getTitle
    
    public int getPages(){
        return pages;
        
    }//end getPages
    
    public int getPublicationYear(){
        return publicationYear;
        
    }//end getPublicationYear
    
    public String toString(){
        return title + ", " + pages + " pages, " + publicationYear;
    }//end toString
}//end class
