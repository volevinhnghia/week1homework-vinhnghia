import java.util.Collections;
import java.util.List;

public class maxValueAList {
    public int maxValue(List<Integer> arr) {

        Collections.sort(arr);
        return arr.get(arr.size() - 1);

    }
}
