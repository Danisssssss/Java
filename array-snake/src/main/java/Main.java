import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int num = 1;
        int[][] array = new int[N][M];

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < M; j++) {
                    array[i][j] = num++;
                }
            } else {
                for (int j = M - 1; j >= 0; j--) {
                    array[i][j] = num++;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        in.close();
    }
}