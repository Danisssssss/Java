import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 9) {
            System.out.print((n / 10) % 10);
        }
        else {
            System.out.print(-1);
        }
        in.close();
    }
}