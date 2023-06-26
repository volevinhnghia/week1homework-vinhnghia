public class WorkContact implements Contact {
    private String name;
    private String phoneNumber;

    public WorkContact(String name, String phoneNumber) {
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
        System.out.println("Name: " + getName());
        System.out.println("Phone Number: " + getPhoneNumber());
    }

    public void workCall() {
        System.out.println("Your worker is calling");
    }
    
    public void addContact(Contact contact) {
        this.newList.add(contact);
    }
}
