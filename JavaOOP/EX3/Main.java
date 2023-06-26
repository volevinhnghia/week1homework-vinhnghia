public class Main {
    public static void main(String[] args) {
        FriendContact newFrContact = new FriendContact("Nguyen Van A", "0957385748");
        WorkContact newContact = new WorkContact("Nguyen Van B", "0385738675");



        newFrContact.displayContactInfo();
        newFrContact.friendCall();



        newContact.displayContactInfo();
        newContact.workCall();
        newFrContact.addContact(new FriendContact("Nguyen Van A", "0957385748b"));
        newContact.addContact(new FriendContact("Nguyen Van A", "0957385748a"));
        System.out.println(Contact.newList);


    }
}