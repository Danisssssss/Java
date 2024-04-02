import java.util.Scanner;

public class RegularPolygon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double side = in.nextDouble();
        double area;
        if (side > 0 && n >= 3) {
            area = area(n, side);
            System.out.println(area);
        } else {
            System.out.println("NO");
        }
    }

    public static double area(int n, double side) {
        return (Math.pow(side, 2) * n) / (4 * Math.tan(Math.PI / n));
    }
}
