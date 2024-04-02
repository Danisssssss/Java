import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum;
        String first = in.next();
        String second = in.next();
        int intFirst;
        int intSecond;
        // alt + shift + enter (switch)
        intFirst = switch (first) {
            case "odin" -> 1;
            case "dva" -> 2;
            case "tri" -> 3;
            case "chetire" -> 4;
            case "pyat`" -> 5;
            case "shest`" -> 6;
            case "sem`" -> 7;
            case "vosem`" -> 8;
            case "devyat`" -> 9;
            default -> -1;
        };
        intSecond = switch (second) {
            case "odin" -> 1;
            case "dva" -> 2;
            case "tri" -> 3;
            case "chetire" -> 4;
            case "pyat`" -> 5;
            case "shest`" -> 6;
            case "sem`" -> 7;
            case "vosem`" -> 8;
            case "devyat`" -> 9;
            default -> -1;
        };

        if (intFirst != -1 && intSecond != -1) {
            sum = intFirst + intSecond;
            System.out.print(sum);
        } else {
            System.out.print("error");
        }
        in.close();
    }
}