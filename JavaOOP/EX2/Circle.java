public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public double calculatePerimeter() {
        return 2 * getRadius() * Math.PI;
    }
}
