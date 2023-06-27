import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicate {
    public void removeDup(List<String> arr) {
        Set<String> listWithoutDup = new LinkedHashSet<>(arr);
        arr.clear();
        arr.addAll(listWithoutDup);
    }
}
