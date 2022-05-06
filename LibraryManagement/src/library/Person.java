package library;

import java.util.ArrayList;

public class Person {
    private String person_name, id;
    private int fee;
    private ArrayList<Book> issuedBooks = new ArrayList<>();
    public Person(String personName, String ID){
        this.person_name = personName;
        this.id = ID;
        this.fee = 0;
    }
    public String getPersonName(){
        return this.person_name;
    }
    public int getFee(){
        return this.fee;
    }
    public void setIssuedBook(Book b){

    }
    public void issueBook(Book book){
        System.out.println();
        if(book.bookStatus()){
            System.out.println("Book is already issued");
            return ;
        }
        System.out.println("Book "+book.getBookName() +" issued to "+this.getPersonName());
        issuedBooks.add(book);
        book.isIssued(true);
    }
    public void returnBook(int days , Book book){
        System.out.println();
        if(days<=7)
            this.fee = 2*7;
        else
            this.fee = 2*7 + 5*(days-7);  //fine for extra days
        System.out.println("Pay Fees : You ("+this.getPersonName() +") have to pay Rs "+this.fee);
    }
    public void payFees(int fees , ArrayList<Book> book_list , Book book){
        System.out.println();
            System.out.println("Fees Paid and Book returned");
            book_list.add(book);
            book.isIssued(false);
    }
}
