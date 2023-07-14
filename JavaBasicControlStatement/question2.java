public class question2 {
    public static int compare(int a, int b) {

        return (a < b) ? -1 : ((a == b) ? 0 : 1);
    }

    public static void main(String[] args) {
        System.out.println("result: " + question2.compare(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }
}
