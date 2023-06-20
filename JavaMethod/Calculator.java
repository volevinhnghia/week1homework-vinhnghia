public class Calculator {
    public double div(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        return a;
    }

    public String first(String a) {
        if (a == "" || a == null) {
            return "null";
        }
        String[] x = a.split("");

        return x[0];
    }

    public String last(String a) {
        if (a == "" || a == null) {
            return "null";
        }
        String[] x = a.split("");

        return x[a.length() - 1];
    }

    public boolean evenCheck(int a) {
        if (a == 0)
            return false;
        return (a % 2 == 0) ? true : false;
    }

    public short sum(short a, short b) {
        return (short) (a + b);
    }

    public int factorial(int a) {
        int result = 1;
        for (int i = 1; i < a; i++) {
            result *= i;
        }
        return result;
    }

    public double average(double[] a) {
        if (a == null) {
            return -1;
        }
        double result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result / a.length;
    }

    public int compare(int a, int b) {
        return (a < b) ? b : ((a == b) ? 0 : a);
    }

    public double trianglePythagorean(double a, double b) {
        if (a <= 0 && b <= 0) {
            System.out.println("Invalid");
            return -1;
        }
        return Math.sqrt(a * a + b * b);
    }

    public void printTriagle(int n) {
        if (n <= 0) {
            return;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n * 2 - 1; j++) {
                if (j <= n - i || j >= n + i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
