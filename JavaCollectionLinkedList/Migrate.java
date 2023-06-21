import java.util.*;

public class Migrate {
    public List<String> migrate(LinkedList<String> left, ArrayList<String> right) {
        int size = left.size();
        for (int i = 0; i < size; i++) {
             right.add(left.pop());
        }
        return right;
    }
}
