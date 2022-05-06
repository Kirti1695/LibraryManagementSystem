package library;

import java.util.ArrayList;
public class Library {
    private ArrayList<Book> book_list = new ArrayList<>();
    Library(ArrayList<Book> bk){
        this.book_list = bk;
    }
    public void printBookList(){
        System.out.println();
        System.out.println("Books available in the library : ");
        for (Book bk: book_list) {
            if(bk.bookStatus())
                continue;
            System.out.print("Book \"" +bk.getBookName());
            System.out.println("\" Author name \"" + bk.getAuthorName()+"\"");
        }
    }
    public ArrayList<Book> returnBookList(){
        return book_list;
    }
    public void addBook(Book book){
        System.out.println();
        System.out.println("Book "+book.getBookName() +" added to the library");
        book_list.add(book);
    }
    public void removeBook(Book book){
        System.out.println();
        System.out.println("Book "+book.getBookName() +" removed from the library");
        book_list.remove(book);
    }
}