import java.util.HashMap;
import java.util.LinkedList;

public class CheckFreqOnLinkedList {
    public void CheckFreq(LinkedList<String> list) {
        HashMap<String, Integer> map = new HashMap<>();
        if (list == null) {
            System.out.println("Invalid List");
            return;
        }
        for (String string : list) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        System.out.println(map);
    }
}
