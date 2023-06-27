
import java.util.Map;
import java.util.TreeMap;

public class freqCheck {
    public Map<String, Integer> checkFreq(String str) {
        Map<String, Integer> result = new TreeMap<>();
        String[] strArr = str.split("\\W+");// only take work, ignore space, ",",".",...
        if (str == "" || str == null) {
            System.out.println("Invalid String");
            result.put(str, -1);
            return result;
        }
        for (int i = 0; i < strArr.length; i++) {
            result.put(strArr[i], result.getOrDefault(strArr[i], 0) + 1);
        }
        return result;
    }
}
