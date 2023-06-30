import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> listBooks;
    private List<Member> listMembers;

    public Library(List<Book> listBooks, List<Member> listMembers) {
        this.listBooks = listBooks;
        this.listMembers = listMembers;
    }

    public Library() {
        this.listBooks = new ArrayList<>();
        this.listMembers = new ArrayList<>();
    }

    public List<Book> getListBooks() {
        return listBooks;
    }

    public void setListBooks(List<Book> listBooks) {
        this.listBooks = listBooks;
    }

    public List<Member> getListMembers() {
        return listMembers;
    }

    public void setListMembers(List<Member> listMembers) {
        this.listMembers = listMembers;
    }

    public void showAllMembers() {
        for (Member member : listMembers) {
            System.out.println(member.toString());
        }
    }

    public void showAllBooks() {
        for (Book book : listBooks) {
            System.out.println(book.toString());
        }
    }

    public boolean isContainsBookName(List<Book> list, String name) {
        return list.stream().filter(o -> o.getBookName().equals(name)).findFirst().isPresent();
    }

    public boolean isContainsMemberName(List<Member> list, String name) {
        return list.stream().filter(o -> o.getMemberName().equals(name)).findFirst().isPresent();
    }

    public void addMember(Member member) {
        if (!isContainsMemberName(this.listMembers, member.getMemberName())) {
            this.listMembers.add(member);
        } else
            System.out.println("Member already exist");

    }

    public void addBook(Book book) {
        if (!isContainsBookName(this.listBooks, book.getBookName())) {
            this.listBooks.add(book);
        } else
            for (Book checkBook : this.listBooks) {
                if (checkBook.getBookName().equals(book.getBookName())) {
                    checkBook.setBookQuantity(checkBook.getBookQuantity() + 1);
                    break;
                }
            }

    }

    public void memberRentBook(Member member, Book book) {
        if (book.getBookQuantity() == 0) {
            System.out.println("Out of stock");
        } else if (member.isRentBook(book)) {
            for (Book checkBook : this.listBooks) {
                if (checkBook.getBookName().equals(book.getBookName())) {
                    checkBook.setBookQuantity(checkBook.getBookQuantity() - 1);
                    break;
                }
            }
        }
    }

    public void memberGiveBackBook(Member member, Book book) {
        if (member.isContainsBookName(member.getBookRent(), book.getBookName())) {
            for (int i = 0; i < member.getBookRent().size(); i++) {
                if (member.getBookRent().get(i).getBookName().equals(book.getBookName())) {
                    member.getBookRent().remove(i);
                    for (Book checkBook : this.listBooks) {
                        if (checkBook.getBookName().equals(book.getBookName())) {
                            checkBook.setBookQuantity(checkBook.getBookQuantity() + 1);
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
}