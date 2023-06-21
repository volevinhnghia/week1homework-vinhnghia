import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Insert ins = new Insert();
        RemoveAt rmv = new RemoveAt();
        Migrate mig = new Migrate();
        LinkedList<String> left = new LinkedList<String>(List.of("a", "b", "c"));
        ArrayList<String> right = new ArrayList<String>();

        LinkedList<String> arr = new LinkedList<String>(List.of("mid"));
        System.out.println(arr);
        ins.insertHead(arr, "head"); // ["head", "mid"]
        System.out.println(arr);
        ins.insertTail(arr, "tail"); // ["head", "mid", "tail"]
        System.out.println(arr);
        rmv.remove(arr, 1);
        System.out.println(arr);

        System.out.println("Before migrate: left: " + left + " right: " + right);
        mig.migrate(left, right);
        System.out.println("After migrate: left: " + left + " right: " + right);
    }
}