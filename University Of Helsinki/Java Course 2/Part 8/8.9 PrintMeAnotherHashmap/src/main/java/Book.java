
public class Book {

    private String name;
    private String contents;
    private int publicationYear;

    public Book(String name, int publicationYear, String contents) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.contents = contents;
    }//end Book

    public String getName() {
        return this.name;
    }//end getName

    public void setName(String name) {
        this.name = name;
    }//end setName

    public int getPublicationYear() {
        return this.publicationYear;
    }//end getPublicationYear

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }//end setPublicationYear

    public String getContents() {
        return this.contents;
    }//end getContents

    public void setContents(String contents) {
        this.contents = contents;
    }//end setContents

    public String toString() {
        return "Name: " + this.name + " (" + this.publicationYear + ")\n"
                + "Contents: " + this.contents;
    }//end toString
}//end class
