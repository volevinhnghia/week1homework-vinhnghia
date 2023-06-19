public class question1 {
    public static void evaluate(int score) {
        if (score <= 100 && score >= 80) {
            System.out.println("A score");
        } else if (score <= 79 && score >= 60) {
            System.out.println("B score");
        } else if (score <= 59 && score >= 40) {
            System.out.println("C score");
        } else if (score <= 39 && score >= 20) {
            System.out.println("D score");
        } else if (score <= 19 && score >= 0) {
            System.out.println("E score");
        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        question1.evaluate(90);
        question1.evaluate(70);
        question1.evaluate(50);
        question1.evaluate(30);
        question1.evaluate(10);
        question1.evaluate(120);
    }
}