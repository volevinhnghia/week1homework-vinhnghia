import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Insert ins = new Insert();
        Transform trans = new Transform();
        Migrate mig = new Migrate();
        List<String> left = new ArrayList<String>(List.of("x", "y"));
        List<String> right = new ArrayList<String>(List.of("z"));
        List<String> arr = new ArrayList<String>(List.of("mid"));
        // Ex3
        System.out.println("Array before: " + arr);
        ins.insertHead(arr, "head");
        System.out.println("After add head: " + arr);
        ins.insertTail(arr, "tail");
        System.out.println("After add tail: " + arr);
        // Ex5
        trans.transform(arr);
        System.out.println("After transform: " + trans.transform(arr));
        // Ex4
        System.out.println("Before migrate: left: " + left + " right: " + right);
        mig.migrate(left, right);
        System.out.println("After migrate: left: " + left + " right: " + right);

    }
}