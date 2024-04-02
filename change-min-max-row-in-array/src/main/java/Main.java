import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        int[][] array = new int[n][];
        for (int i = 0; i < n; i++) {
            String[] input = in.nextLine().split(" ");
            array[i] = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                array[i][j] = Integer.parseInt(input[j]);
            }
        }

        boolean allRowsEqual = true;
        for (int i = 0; i < n - 1; i++) {
            if (array[i].length != array[i + 1].length) {
                allRowsEqual = false;
                break;
            }
        }

        if (allRowsEqual) {
            int[] temp = array[0];
            array[0] = array[n - 1];
            array[n - 1] = temp;
        } else {
            int minRow = 0;
            int maxRow = 0;
            for (int i = 1; i < n; i++) {
                if (array[i].length < array[minRow].length) {
                    minRow = i;
                } else if (array[i].length > array[maxRow].length) {
                    maxRow = i;
                }
            }

            int[] temp = array[minRow];
            array[minRow] = array[maxRow];
            array[maxRow] = temp;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        in.close();
    }
}