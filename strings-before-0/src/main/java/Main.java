import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        while (true) {
            str = in.nextLine();
            if (str.equals("0")) {
                break;
            }
            System.out.println(str);
        }
        in.close();
    }
}