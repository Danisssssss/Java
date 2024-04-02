class BaseRectangle extends Rectangle {
    public BaseRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return "Rectangle\n Width: " + width + ", Height: " + height + ", " + super.toString();
    }
}