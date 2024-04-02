import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int num = 1;
        int[][] array = new int[N][M];

        int top = 0;
        int bottom = N - 1;
        int left = 0;
        int right = M - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                array[top][i] = num++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                array[i][right] = num++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    array[bottom][i] = num++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    array[i][left] = num++;
                }
                left++;
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