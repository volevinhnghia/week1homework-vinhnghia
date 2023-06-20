
public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double[] array = {543,12,234,34,12,4,5};
        System.out.println("Div 2 number: " + calc.div(5, 6));
        System.out.println("1st element: " + calc.first(""));
        System.out.println("Check even number: " + calc.evenCheck(9));
        System.out.println("Short sum: " + calc.sum((short) 2, (short) 3));
        System.out.println("Factorial: " + calc.factorial(10));
        System.out.println("Average: " + calc.average(array));
        System.out.println("Compare: " + calc.compare(34,25));
        System.out.println("Triangle Pythagorean: " + calc.trianglePythagorean(3,4));
        System.out.println("last element: " + calc.last("fgsfgsdfbhfdb"));
        calc.printTriagle(20);
    }
}