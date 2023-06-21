import java.util.List;

public class Migrate {
    void migrate(List<String> left, List<String> right) {
        right.addAll(left);
        left.clear();
    }
}
