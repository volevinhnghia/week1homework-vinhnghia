import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberName;
    private List<Book> bookRent;

    public Member() {
        this.memberName = "";
        this.bookRent = new ArrayList<>();
    }

    public Member(String memberName) {
        this.memberName = memberName;
        this.bookRent = new ArrayList<>();
    }

    public Member(String memberName, List<Book> bookRent) {
        this.memberName = memberName;
        this.bookRent = bookRent;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public List<Book> getBookRent() {
        return bookRent;
    }

    public void setBookRent(List<Book> bookRent) {
        this.bookRent = bookRent;
    }

    @Override
    public String toString() {
        return "Member [memberName=" + memberName + ", bookRent=" + bookRent.toString() + "]";
    }

    public boolean isContainsBookName(List<Book> list, String name) {
        return list.stream().filter(o -> o.getBookName().equals(name)).findFirst().isPresent();
    }

    public boolean isRentBook(Book book) {
        if (!isContainsBookName(this.bookRent, book.getBookName())) {
            this.bookRent.add(book);
            return true;
        } else {
            System.out.println("Already rent this book");
            return false;
        }
    }

}
