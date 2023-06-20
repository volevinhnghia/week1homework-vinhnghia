import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        stringChallenge dupe = new stringChallenge();
        System.out.println(Arrays.toString(dupe.dedupe("jfydthtgsthjg")));
        System.out.println(dupe.findChar("dgsfb", 3));
        System.out.println(dupe.replace("Local Host Server IP is {}", "127.0.0.1"));
    }
}