public class main {
    static public void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge(30);
        Odometer odometer = new Odometer(100_000);

        while (fuelGauge.getFuel() != 0) {
            odometer.drive(fuelGauge);
            System.out.println(odometer.getMileage());
            System.out.println(fuelGauge.getFuel());
        }
    }
}
