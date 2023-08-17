
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        
        while (true) {
            
            System.out.println("Input the name of the book, empty stops");
            String bookName = scanner.nextLine();
            
            if (bookName.isEmpty()) {
                
                System.out.println(books.size() + " books in total.");
                System.out.println("Books:");
                
                Comparator<Book> comparator = Comparator
                    .comparing(Book::getAgeRec)
                    .thenComparing(Book::getName);
                
                Collections.sort(books, comparator);
                
                books.stream()
                        .forEach(book -> System.out.println(book));
                
                break;
                
            }//end if
            
            System.out.println("Input the age recommendation:");
            int ageRec = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(bookName, ageRec));
            
        }//end while
        
    }//end main

}//end class
