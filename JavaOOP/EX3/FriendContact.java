public class FriendContact implements Contact {
    private String name;
    private String phoneNumber;

    public FriendContact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    
    public String getPhoneNumber() {
        return phoneNumber;

    }

    
    public void displayContactInfo() {
        System.out.println("Friend's Name: " + getName());
        System.out.println("Phone Number: " + getPhoneNumber());
    }
    public void friendCall(){
        System.out.println("Your friend is calling");
    }
    public void addContact(Contact contact) {
        this.newList.add(contact);
    }
}
