public class ParkingMeter {
    private int purchasedMinutes;   // приобретенные минуты

    // Конструктор
    public ParkingMeter(int purchasedMinutes) {
        this.purchasedMinutes = purchasedMinutes;
    }

    // Геттеры
    public int getPurchasedMinutes() {
        return purchasedMinutes;
    }

    // Сеттеры
    public void setPurchasedMinutes(int purchasedMinutes) {
        this.purchasedMinutes = purchasedMinutes;
    }
}
