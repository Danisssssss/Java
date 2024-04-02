import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] intArray = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                intArray[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = intArray[i][j];
                intArray[i][j] = intArray[j][i];
                intArray[j][i] = temp;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(intArray[i][j] + "\t");
            }
            System.out.println();
        }


        in.close();
    }
}