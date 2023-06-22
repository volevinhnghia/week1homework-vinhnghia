
import java.util.Map;
import java.util.TreeMap;

public class freqCheck {
    public Map<String, Integer>  checkFreq(String str) {
        Map<String, Integer> result = new TreeMap<>();
        String[] strArr = str.split("\\W+");
        for (int i = 0; i < strArr.length; i++) {
            if (result.containsKey(strArr[i])) {
                result.put(strArr[i], result.get(strArr[i]) + 1);
                continue;
            }
            result.put(strArr[i], 1);
        }
        return result;
    }
}
