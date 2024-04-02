public class Area {
    static double square;

    static double getArea(double raduis) {
        if (raduis > 0) {
            square = Math.floor(Math.PI * Math.pow(raduis, 2) * 100) / 100;
            return square;
        } else {
            return 0;
        }
    }

    static double getArea(int width, int length) {
        if (width > 0 && length > 0) {
            square = Math.floor(width * length * 100) / 100;
            return square;
        } else {
            return 0;
        }
    }

    static double getArea(double radius, double height) {
        if (radius > 0 && height > 0) {
            square = Math.floor(2 * Math.PI * radius * (height + radius) * 100) / 100;
            return square;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.printf("%6.2f\n", Area.getArea(10.0));
        System.out.printf("%6.2f\n", Area.getArea(15, 25));
        System.out.printf("%6.2f\n", Area.getArea(12.0, 17.0));
    }
}