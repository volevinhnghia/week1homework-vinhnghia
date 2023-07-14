public class question6 {
    public static int[][] mul(int[][] x, int[][] y) {
        int result[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = 0;
                for (int j2 = 0; j2 < result.length; j2++) {
                    result[i][j] += x[i][j2] * y[j2][j];
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        return result;
    }

    public static void main(String[] args) {
        question6.mul(new int[][] { { 1, 2 }, { 1, 2 } }, new int[][] { { 2, 1 }, { 2, 1 } });
    }
}
