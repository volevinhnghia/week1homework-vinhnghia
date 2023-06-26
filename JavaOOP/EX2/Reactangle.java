public class Reactangle extends Shape {
    private double width;
    private double height;

    public Reactangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {
        return getHeight()*getWidth();
    }

    public double calculatePerimeter() {
        return (getWidth() + getHeight()) * 2;
    }
}
