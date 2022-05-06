package library;
public class Book {
    private String book_name;
    private String author_name;
    private boolean isIssued;
    Book(String book , String author , Library l1){
        this.book_name = book;
        this.author_name = author;
//        l1.addBook(Book this);
        this.isIssued = false;
    }
    public String getBookName(){
        return this.book_name;
    }
    public String getAuthorName(){
        return this.author_name;
    }
    public void isIssued(boolean status){
        this.isIssued = status;
    }
    public boolean bookStatus(){
        return this.isIssued;
    }
}
