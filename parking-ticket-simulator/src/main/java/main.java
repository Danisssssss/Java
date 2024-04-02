public class main {
    public static void main(String[] args) {
        ParkedCar car = new ParkedCar("Brand", "Model", "Color", "NUMBER123", 90);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer officer = new PoliceOfficer("Name Surname", 12345);

        ParkingTicket protocol = officer.inspect(car, meter);

        if (protocol != null) {
            System.out.println("Protocol issued!");
            System.out.println(protocol);
        } else {
            System.out.println("Protocol not issued");
        }
    }
}
