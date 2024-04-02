import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int b = in.nextInt();
        float x = (float) b / (float) k;
        System.out.print(x);
        in.close();
    }
}