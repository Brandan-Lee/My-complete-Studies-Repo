
public class Book {

    private String name;
    private int publishingYear;
    private int pageCount;
    private String author;

    public Book(String name, int ReleaseYear, int pages, String author) {
        
        this.name = name;
        this.publishingYear = ReleaseYear;
        this.pageCount = pages;
        this.author = author;
        
    }//end constructor

    public String getName() {
        
        return name;
        
    }//end getName

    public int getPublishingYear() {
        
        return publishingYear;
        
    }//end getPublishingYear

    public String getAuthor() {
        
        return author;
        
    }//end getAuthor

    public int getPagecount() {
        
        return pageCount;
        
    }//end getPageCount

}//end class
