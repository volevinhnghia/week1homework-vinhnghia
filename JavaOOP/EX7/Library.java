import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public boolean add(Book book) {
        for (Book checkBook : this.books) {
            if (book.title == checkBook.title) {
                return false;
            }
        }
        this.books.add(book);
        return true;
    }

    public boolean removeByTitle(String title){
        for (Book book : this.books) {
            if (book.title == title) {
                
            }
        }
    }

}
