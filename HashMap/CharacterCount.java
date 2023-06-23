import java.util.HashMap;
import java.util.Map;

//Character count
public class CharacterCount {
    public void wordCounter(String word) {
        HashMap<String, Integer> result = new HashMap<>();
        String[] splitString = word.split("");
        if (word == "" || word == null) {
            System.out.println("Invalid word");
            return;
        }
        for (String string : splitString) {
            if (result.containsKey(string)) {
                result.put(string, result.get(string) + 1);
                continue;
            }
            result.put(string, 1);
        }
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println("Character: " + entry.getKey() + "| Freq: " + entry.getValue());
        }
    }

}
