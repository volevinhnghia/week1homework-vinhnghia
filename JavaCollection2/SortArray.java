
import java.util.Comparator;
import java.util.List;

public class SortArray {
    public void sortArrayAlphabet(List<String> arr) {
        arr.sort(
                Comparator.<String, Character>comparing(s -> Character.toUpperCase(s.charAt(0))).thenComparing(s -> s));
    }
}
