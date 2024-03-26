
class Book {
    static int totalNoOfBooks;
    
    private String title;
    private String author;
    private String isbn;
    private boolean isborrowed;
    
    public void borrowBook() {
    
        if (isborrowed) {
            System.out.println(title + " : the book is already borrowed");
        } else {
            System.out.println("enjoy ur book " + title );
            totalNoOfBooks--;
            this.isborrowed=true;
        }
        
    }
    
    public void returnBook() {
        if (isborrowed) {
            System.out.println("thanks for reading the book : " + title );
            totalNoOfBooks++;
            isborrowed= false;
        } else {
            System.out.println(title+ " : the book is already in the library");
            
        }
    }
    
    static {
        totalNoOfBooks = 0;
    }
    {
        totalNoOfBooks++; //means that whenever the book object is created ,the number of book get increased by one
    }
    
    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }
    
    Book(String isbn, String title, String author) {  //constructor
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {  //constructor
        this(isbn, "unknown", "unknown"); // constructor chaining!
    }
}
public class LibraryManagementSystem {
public static void main(String[] args) {
    
    
    System.out.println("welcome to the library!!!");
    Book dsa =new Book("1" , "dsa", "xyz");
    
    Book book2 = new Book("2");
    
    dsa.borrowBook();
    System.out.println(Book.getTotalNoOfBooks()); //static method can be called either way
    book2.borrowBook();
    System.out.println(book2.getTotalNoOfBooks());
    
    dsa.borrowBook();
    dsa.returnBook();
        book2.returnBook();
        book2.returnBook();
        System.out.println(Book.getTotalNoOfBooks());
 
    }
}