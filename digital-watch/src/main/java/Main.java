import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int hour = (n / 60) % 24;
        int min = n % 60;
        System.out.print(hour + ":" + min);
        in.close();
    }
}