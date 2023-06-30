
public class Main {
    public static void main(String[] args) {
        // EX2 Manage Library
        Library lib = new Library();
        Book book1 = new Book("A", "aa", 1);
        Book book5 = new Book("B", "bb", 1);
        Book book4 = new Book("C", "cc", 1);
        Book book3 = new Book("D", "dd", 1);
        Book book2 = new Book("A", "aa", 1);

        Member member1 = new Member("Nguyen Van A");
        Member member2 = new Member("Nguyen Van B");
        Member member3 = new Member("Nguyen Van C");
        Member member4 = new Member("Nguyen Van D");
        lib.addBook(book2);
        lib.addBook(book3);
        lib.addBook(book4);
        lib.addBook(book5);
        lib.addBook(book1);
        lib.addMember(member1);
        lib.addMember(member2);
        lib.addMember(member3);
        lib.addMember(member4);
        System.out.println("Original Library: ");
        lib.showAllBooks();
        lib.showAllMembers();


        
        System.out.println("After member1 rent book2 and book3: ");
        lib.memberRentBook(member1, book2);
        lib.memberRentBook(member1, book3);
        lib.showAllBooks();
        lib.showAllMembers();



        System.out.println("After member1 gave back book3: ");
        lib.memberGiveBackBook(member1, book3);
        lib.showAllBooks();
        lib.showAllMembers();

    }
}