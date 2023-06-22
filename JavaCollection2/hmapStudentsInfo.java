import java.util.HashMap;
import java.util.Map;

public class hmapStudentsInfo {
    public Map<String, Integer> studentID(String[] name, int[] id) {
        Map<String, Integer> result = new HashMap<>();
        int n = (name.length >= id.length) ? name.length : id.length;
         for (int i = 0; i < n; i++) {
             result.put(name[i], id[i]);
        }
        return result;
    }
}
