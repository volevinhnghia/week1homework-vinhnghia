import java.util.*;

public class sumArrayList {
    public int sumArray(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}
