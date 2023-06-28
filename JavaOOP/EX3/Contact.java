import java.util.ArrayList;
import java.util.List;

interface Contact {
    List<Contact> newList = new ArrayList<>(List.of());
    public String getName();

    public String getPhoneNumber();

    public void displayContactInfo();

}
