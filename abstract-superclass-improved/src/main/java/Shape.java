abstract class Shape {
    private String color;
    private boolean filled;

    // Геттеры
    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    // Сеттеры
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract public double getArea();
    abstract public double getPerimeter();

    public String toString() {
        return "Area: " + getArea() + ", Perimeter: " + getPerimeter() + ", Color: " + color + ", Filled: " + filled;
    }
}
