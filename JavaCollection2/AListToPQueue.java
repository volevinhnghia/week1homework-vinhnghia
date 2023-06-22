import java.util.PriorityQueue;
import java.util.List;

public class AListToPQueue {
    public PriorityQueue<Object> toPQueue(List<Object> list) {
        PriorityQueue<Object> result = new PriorityQueue<>(list);
        return result;
    }
}
