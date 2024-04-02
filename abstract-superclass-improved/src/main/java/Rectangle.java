abstract class Rectangle extends Shape {
    protected double width;
    protected double height;

    public double getArea() {
        return Math.floor(width * height * 100) / 100;
    }

    public double getPerimeter() {
        return Math.floor(2 * width + 2 * height * 100) / 100;
    }
}