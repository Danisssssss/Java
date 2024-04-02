import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] elem = input.split(" ");
        int n = Integer.parseInt(elem[0]);
        int a = Integer.parseInt(elem[1]);
        int b = Integer.parseInt(elem[2]);

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(in.nextLine());
        }

        if (a >= 0 && a < n && b >= 0 && b < n) {
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;

            for (int i = 0; i < n; i++) {
                System.out.println(array[i]);
            }
        } else {
            System.out.print("NO");
        }
        in.close();
    }
}