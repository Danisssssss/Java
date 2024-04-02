import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0; // счетчик
        int n; // вводимые числа
        int sum = 0; // сумма вводимых чисел
        boolean sumTen = false; // флаг

        while (true) {
            n = in.nextInt();
            if (n == 0) {
                break;
            }
            sum += n;
            if (!sumTen) {
                counter++;
            }
            if (sum == 10 && !sumTen) {
                sumTen = true;
            }
        }
        System.out.print(counter);
        in.close();
    }
}