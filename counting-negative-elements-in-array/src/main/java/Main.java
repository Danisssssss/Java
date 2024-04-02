import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] elem = input.split(" ");
        int count = 0;
        int sum = 0;
        for (String el : elem) {
            int num = Integer.parseInt(el);
            if (num < 0) {
                count++;
                sum += num;
            }
        }

        System.out.print(count + " " + sum);
    }
}