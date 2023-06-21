import java.util.ArrayList;
import java.util.List;

public class Transform {
    List<Integer> transform( List<String> arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            result.add(i, i);
        }
        return result;
    }
}
