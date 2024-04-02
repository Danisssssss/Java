public class ParkingTicket {
    private ParkedCar car;          // припаркованный автомобиль
    private PoliceOfficer officer;  // офицер
    private int fine;               // сумма штраф

    // Конструктор
    public ParkingTicket(ParkedCar car, PoliceOfficer officer, int fine) {
        this.car = car;
        this.officer = officer;
        this.fine = fine;
    }

    // Геттеры
    public ParkedCar getCar() {
        return car;
    }

    public PoliceOfficer getOfficer() {
        return officer;
    }

    public int getFine() {
        return fine;
    }

    // Сеттеры
    public void setCar(ParkedCar car) {
        this.car = car;
    }

    public void setOfficer(PoliceOfficer officer) {
        this.officer = officer;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public String toString() {
        return "PROTOCOL\n" + "CAR\n" + car.toString() + "Fine($): " + fine + "\nOFFICER:\n" + officer.toString();
    }
}
