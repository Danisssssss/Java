public class PoliceOfficer {
    private String name;        // имя
    private int badgeNumber;    // номер жетона

    // Конструктор
    public PoliceOfficer(String name, int number) {
        this.name = name;
        this.badgeNumber = number;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getBadgeNumber() {
        return badgeNumber;
    }

    // Сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    // проверка истекло ли парковочное время автомобиля
    public ParkingTicket inspect(ParkedCar parkedCar, ParkingMeter parkingMeter) {
        int parkedMins = parkedCar.getParkedMinutes(); // кол-во минут, в течение которых автомобиль был припаркован
        int purchasedMins = parkingMeter.getPurchasedMinutes(); // приобретенные минуты
        if (parkedMins > purchasedMins) {
            int minutesOver = parkedMins - purchasedMins;
            int fine = 25; // сумма штрафа за первый час
            if (minutesOver > 60) {
                fine += ((minutesOver - 60) / 60) * 10;
            }
            return new ParkingTicket(parkedCar, this, fine);
        } else {
            return null;
        }
    }

    public String toString() {
        return "Name: " + name + ";\nBadge number: " + badgeNumber + "\n";
    }
}
