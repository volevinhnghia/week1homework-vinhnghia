public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double calculateArea() {
        double s = (getA() + getB() + getC()) / 2;
        return Math.sqrt(s * (s - getA()) * (s - getB()) * (s - getC()));
    }
    public double calculatePerimeter(){
        return getA()+getB()+getC();
    }
}
