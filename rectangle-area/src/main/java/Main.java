import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double square;
        square = Math.abs(x1 - x2) * Math.abs(y1 - y2);
        square = Math.floor(square * 100) / 100;
        System.out.print(square);
        in.close();
    }
}