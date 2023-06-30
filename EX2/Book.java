public class Book {
    private String bookName;
    private String authorName;
    private int bookQuantity;
    
    public Book(String bookName, String authorName, int bookQuantity) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookQuantity = bookQuantity;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public int getBookQuantity() {
        return bookQuantity;
    }
    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }
    @Override
    public String toString() {
        return "Book [bookName=" + getBookName() + ", authorName=" + getAuthorName() + ", bookQuantity=" + getBookQuantity() + "]";
    }
    
    
}
