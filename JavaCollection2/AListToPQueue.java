import java.util.PriorityQueue;
import java.util.List;

public class AListToPQueue {
    public PriorityQueue<String> toPQueue(List<String> list) {
        PriorityQueue<String> result = new PriorityQueue<>(list);
        return result;
    }
}
