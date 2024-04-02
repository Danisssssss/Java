abstract class Ellipse extends Shape {
    protected double r1;
    protected double r2;

    public double getArea() {
        return Math.floor(Math.PI * r1 * r2 * 100) / 100;
    }

    public double getPerimeter() {
        return Math.floor(2 * Math.PI * Math.sqrt((r1 * r1 + r2 * r2) / 2) * 100) / 100;
    }
}