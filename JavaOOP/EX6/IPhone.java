import java.util.ArrayList;
import java.util.List;

public class IPhone {
    public List<Photo> photos;

    public IPhone() {
        this.photos = new ArrayList<Photo>();
    }

    public IPhone(List<Photo> photos) {
        this.photos = photos;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public void addPhoto(List<Photo> photos) {
        this.photos.addAll(photos);
    }

    public void airdrop(IPhone other, String id) {
        other.addPhoto(new ArrayList<Photo>(List.of(new Photo(id))));
    }

}
