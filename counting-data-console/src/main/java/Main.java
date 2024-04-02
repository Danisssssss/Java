import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;
        double avg = 0.0;
        double n;
        while (true) {
            n = in.nextDouble();
            if (n == 0) {
                break;
            }
            count++;
            sum += n;
            avg = sum / count;
        }

        sum = Math.floor(sum * 100) / 100;
        avg = Math.floor(avg * 100) / 100;

        System.out.print(count + " " + sum + " " + avg);
        in.close();
    }
}