import java.util.List;

public class Insert {
    public void insertHead(List<String> arr, String item) {
        arr.add(0, item);
    }

    public void insertTail(List<String> arr, String item) {
        arr.add(arr.size(), item);
    }
}
