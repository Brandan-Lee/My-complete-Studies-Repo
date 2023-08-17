import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Book> book = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Title:");
            String bookTitle = scanner.nextLine();
            
            if (bookTitle.isEmpty()){
                break;
            }//end if
            
            System.out.println("Pages:");
            int bookPages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int bookPublicationYear = Integer.valueOf(scanner.nextLine());
            
            book.add(new Book(bookTitle, bookPages, bookPublicationYear));
        }//end while
        System.out.println("What information will be printed?");
        String info = scanner.nextLine();
        
        for (Book newBook : book){
            if (info.equals("everything")){
                System.out.println(newBook);
            } else if (info.equals("name")){
                System.out.println(newBook.getTitle());
            }//end else if
            
        }//end for
        
    }//end main
}//end class
