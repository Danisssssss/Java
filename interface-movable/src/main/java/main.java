public class main {
    public static void main(String[] args) {
        // MovablePoint
        Movable m1 = new MovablePoint(5, 6, 10, 15); // upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);

        // MovableCircle
        Movable m2 = new MovableCircle(1, 2, 3, 4, 20); // upcast
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
        m2.moveDown();
        System.out.println(m2);
        m2.moveLeft();
        System.out.println(m2);
        m2.moveUp();
        System.out.println(m2);

        // MovableRectangle
        Movable m3 = new MovableRectangle(0, 0, 3, 4, 2, 2); // upcast
        System.out.println(m3);
        m3.moveRight();
        System.out.println(m3);
        m3.moveDown();
        System.out.println(m3);
        m3.moveLeft();
        System.out.println(m3);
        m3.moveUp();
        System.out.println(m3);
    }
}
