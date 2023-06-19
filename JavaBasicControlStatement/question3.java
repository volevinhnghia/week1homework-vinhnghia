public class question3 {
    public static int isLeapYear(int year) {
        if (year % 4 != 0) {
            return 0;
        }
        if (year % 100 != 0) {
            return 1;
        }
        if (year % 400 != 0) {
            return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(question3.isLeapYear(Integer.parseInt(args[0])));
    }
}
