public class question4 {
    public static void printEven(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("All even number to " + args[0] + " :");
        printEven(Integer.parseInt(args[0]));
    }
}
