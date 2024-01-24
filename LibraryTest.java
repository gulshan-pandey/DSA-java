class Library {
    private String[] availableBooks;
    private String[] issuedBooks;

    // Default constructor
    public Library() {
        this.availableBooks = new String[0];
        this.issuedBooks = new String[0];
    }

    // Constructor with available books initialization
    public Library(String[] availableBooks) {
        this.availableBooks = availableBooks;
        this.issuedBooks = new String[0];
    }

    // Method to issue a book
    public void issueBook(String bookTitle) {
        if (isBookAvailable(bookTitle)) {
            // Remove book from available books
            removeFromArray(availableBooks, bookTitle);
            // Add book to issued books
            addToIssuedBooks(bookTitle);
            System.out.println("Book '" + bookTitle + "' issued successfully.");
        } else {
            System.out.println("Book '" + bookTitle + "' not available for issuing.");
        }
    }

    // Method to return a book
    public void returnBook(String bookTitle) {
        if (isBookIssued(bookTitle)) {
            // Remove book from issued books
            removeFromArray(issuedBooks, bookTitle);
            // Add book back to available books
            addToAvailableBooks(bookTitle);
            System.out.println("Book '" + bookTitle + "' returned successfully.");
        } else {
            System.out.println("Book '" + bookTitle + "' not issued or invalid book title.");
        }
    }

    // Method to display available books
    public void showAvailableBooks() {
        System.out.println("Available Books:");
        for (String book : availableBooks) {
            System.out.println(book);
        }
    }

    // Getter for available books
    public String[] getAvailableBooks() {
        return availableBooks;
    }

    // Setter for available books
    public void setAvailableBooks(String[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    // Getter for issued books
    public String[] getIssuedBooks() {
        return issuedBooks;
    }

    // Setter for issued books
    public void setIssuedBooks(String[] issuedBooks) {
        this.issuedBooks = issuedBooks;
    }

    // Helper method to check if a book is available
    private boolean isBookAvailable(String bookTitle) {
        return arrayContains(availableBooks, bookTitle);
    }

    // Helper method to check if a book is issued
    private boolean isBookIssued(String bookTitle) {
        return arrayContains(issuedBooks, bookTitle);
    }

    // Helper method to add a book to the available books array
    private void addToAvailableBooks(String bookTitle) {
        availableBooks = extendArray(availableBooks, bookTitle);
    }

    // Helper method to add a book to the issued books array
    private void addToIssuedBooks(String bookTitle) {
        issuedBooks = extendArray(issuedBooks, bookTitle);
    }

    // Helper method to extend the array with a new element
    private String[] extendArray(String[] array, String element) {
        String[] newArray = new String[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = element;
        return newArray;
    }

    // Helper method to remove an element from the array
    private void removeFromArray(String[] array, String element) {
        int index = indexOf(array, element);
        if (index != -1) {
            String[] newArray = new String[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
            array = newArray;
        }
    }

    // Helper method to check if the array contains a certain element
    private boolean arrayContains(String[] array, String element) {
        for (String item : array) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }

    // Helper method to get the index of an element in the array
    private int indexOf(String[] array, String element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
}


public class LibraryTest {
    public static void main(String[] args) {
        // Creating a Library object with default constructor
        Library library = new Library();

        // Displaying available books (should be empty)
        library.showAvailableBooks();

        // Adding some books to the library
        String[] initialBooks = {"Book1", "Book2", "Book3"};
        library.setAvailableBooks(initialBooks);

        // Displaying available books after adding
        System.out.println("\nAvailable Books after adding:");
        library.showAvailableBooks();

        // Issuing a book
        library.issueBook("Book1");

        // Displaying available books after issuing
        System.out.println("\nAvailable Books after issuing:");
        library.showAvailableBooks();

        // Displaying issued books
        System.out.println("\nIssued Books:");
        for (String book : library.getIssuedBooks()) {
            System.out.println(book);
        }

        // Trying to issue a non-existent book
        library.issueBook("NonExistentBook");

        // Returning a book
        library.returnBook("Book1");

        // Displaying available books after returning
        System.out.println("\nAvailable Books after returning:");
        library.showAvailableBooks();
    }
}

