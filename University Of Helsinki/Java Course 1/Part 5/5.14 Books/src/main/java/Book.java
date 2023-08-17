
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compared){
        
        if (this == compared){
            return true;
        }//end if
        
        if (!(compared instanceof Book)){
            return false;
        }//end if
        
        Book comparedBook = (Book) compared;
        
        if (this.name.equals(comparedBook.name) 
                && this.publicationYear == comparedBook.publicationYear){
            return true;
        }//end if
        
        return false;
    }
    


}
