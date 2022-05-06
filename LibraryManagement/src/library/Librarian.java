package library;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Librarian extends Library{

    private String librarianName;
    Librarian(ArrayList<Book> book_list , String librarianName){
        super(book_list);
        System.out.println("Welcome "+ librarianName);
    }
    public void issueBook(Person person , Book book, ArrayList<Book> book_list){
        System.out.println();
        if(book.bookStatus()) {
            System.out.println("Sorry, the book is already issued");
            return;
        }
        System.out.println("Book "+book.getBookName() +" issued to "+person.getPersonName());
        book.isIssued(true);
    }
    public void getFees(Person p1,int days,Book b1){
//        System.out.print(p1.getPersonName()+" has to pay Rs ");
        p1.returnBook(days,b1);
//        return p1.getFee();
    }
}
