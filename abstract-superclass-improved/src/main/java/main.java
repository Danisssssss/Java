public class main {
    static public void main(String[] args) {
        // BaseRectangle
        BaseRectangle baseRectangle = new BaseRectangle(20.34, 21.45);
        baseRectangle.setColor("white");
        baseRectangle.setFilled(true);
        // Square
        Square square = new Square(42.9);
        square.setColor("blue");
        square.setFilled(true);
        // BaseEllipse
        BaseEllipse baseEllipse = new BaseEllipse(12.23, 19.77);
        baseEllipse.setColor("red");
        baseEllipse.setFilled(true);
        // Circle
        Circle circle = new Circle(46.17);
        circle.setColor("yellow");
        circle.setFilled(true);

        System.out.println(baseRectangle.toString());
        System.out.println(square.toString());
        System.out.println(baseEllipse.toString());
        System.out.println(circle.toString());
    }
}
