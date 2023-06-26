public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape reactangle = new Reactangle(43, 60);
        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("Circle");
        System.out.println("Circle's Area: " + circle.calculateArea());
        System.out.println("Circle's Perimeter: " + circle.calculatePerimeter());

        System.out.println("Reactangle");
        System.out.println("Reactangle's Area: " + reactangle.calculateArea());
        System.out.println("Reactangle's Perimeter: " + reactangle.calculatePerimeter());

        System.out.println("Triangle");
        System.out.println("Triangle's Area: " + triangle.calculateArea());
        System.out.println("Triangle's Perimeter: " + triangle.calculatePerimeter());
    }
}