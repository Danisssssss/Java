class Circle extends Ellipse {
    public Circle(double r) {
        r1 = r;
        r2 = r;
    }

    public String toString() {
        return "Ellipse\n R: " + r1 + ", " + super.toString();
    }
}
