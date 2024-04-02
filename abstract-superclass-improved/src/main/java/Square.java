class Square extends Rectangle {
    public Square(double side) {
        width = side;
        height = side;
    }

    public String toString() {
        return "Square\n Side: " + width + ", " + super.toString();
    }
}