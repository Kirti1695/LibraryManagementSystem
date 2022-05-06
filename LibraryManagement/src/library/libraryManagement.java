package library;

import java.util.ArrayList;

public class libraryManagement {
    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();
        Library centralLibrary = new Library(bookList);
        Librarian l1 = new Librarian(centralLibrary.returnBookList(),"Ramesh");

        Book b1 = new Book("Atomic Habits","James Clear",centralLibrary);
        l1.addBook(b1);

        Book b2 = new Book("Java : The complete reference" , "Herbert Schmidt", centralLibrary);
        l1.addBook(b2);

        Book b3 = new Book("Iki-gai" , "Hector Gracia", centralLibrary);
        l1.addBook(b3);

        Book b4 = new Book("To kill a Mocking Bird" , "Harper Lee",centralLibrary);
        l1.addBook(b4);

        Book b5 = new Book("Invisible Man" , "Ralph Ellison", centralLibrary);
        l1.addBook(b5);

        Book b6 = new Book("Jane Eyre" , "Charlotte Bronte", centralLibrary);
        l1.addBook(b6);

        centralLibrary.printBookList();

        Person p1 = new Person("Harry", "EIKJ95232");

//        l1.issueBook(p1,b1,centralLibrary.returnBookList());
        p1.issueBook(b3);
        centralLibrary.printBookList();

//        l1.printBookList();

        l1.removeBook(b4);
        l1.printBookList();

        l1.getFees(p1,15,b2);

        Person p2 = new Person("Kirti" ,"ABC12345");
        l1.issueBook(p2,b2,centralLibrary.returnBookList());
        p2.returnBook(10,b2);
        p2.payFees(29,centralLibrary.returnBookList(),b2);
    }
}
