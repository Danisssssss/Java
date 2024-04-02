import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cost;
        double priceWithoutDiscount = 0;
        double priceWithDiscount = 0;
        double Discount = 0;
        while (true) {
            cost = in.nextDouble();
            if (cost < 0) {
                break;
            }
            priceWithoutDiscount += cost;
            if (cost >= 1000) {
                priceWithDiscount += 0.95 * cost;
            } else {
                priceWithDiscount += cost;
            }
            Discount = priceWithoutDiscount - priceWithDiscount;
        }
        priceWithDiscount = Math.floor(priceWithDiscount * 100) / 100;
        priceWithoutDiscount = Math.floor(priceWithoutDiscount * 100) / 100;
        Discount = Math.floor(Discount * 100) / 100;

        System.out.print(priceWithoutDiscount + " " + priceWithDiscount + " " + Discount);
        in.close();
    }
}