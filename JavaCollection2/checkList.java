import java.util.List;

public class checkList {
    public boolean isContain(List<Integer> List, List<Integer> checkList) {
        boolean check = true;
        for (Integer integer : List) {
            if (!checkList.contains(integer)) {
                return false;
            }
        }
        return check;
    }
}
