import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        IPhone ip01 = new IPhone(new ArrayList<Photo>(List.of(new Photo("cat.jpg"))));
        IPhone ip02 = new IPhone();

        ip01.airdrop(ip02, "cat.jpg");
        System.out.println(ip02.getPhotos().get(0).getId());
        

    }
}